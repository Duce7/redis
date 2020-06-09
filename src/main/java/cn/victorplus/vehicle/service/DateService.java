package cn.victorplus.vehicle.service;

import cn.victorplus.vehicle.bean.Response;
import cn.victorplus.vehicle.bean.db.*;
import cn.victorplus.vehicle.client.CarDataClient;
import cn.victorplus.vehicle.config.ThreadPools;
import cn.victorplus.vehicle.mapper.*;
import cn.victorplus.vehicle.tools.ListUtil;
import cn.victorplus.vehicle.utils.car.TranslateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

@Slf4j
@Service
public class DateService {

    private static final Integer SUCCESS = 1;
    private static final String STATUS = "status";
    private static final String ERROR = "调用地址 ：{} , 返回报文 ：{} ,错误信息 ：{}";
    @Value(value = "${che300.api.token}")
    private String token;
    @Resource
    private CarDataClient carDataClient;

    @Resource
    private Che300VehicleMapper che300VehicleMapper;
    @Resource
    private Che300BrandMapper che300BrandMapper;
    @Resource
    private Che300SeriesMapper che300SeriesMapper;
    @Resource
    private Che300YearMapper che300YearMapper;
    @Resource
    private Che300CityMapper che300CityMapper;
//    @Resource
//    private Che300AttributeMapper che300AttributeMapper;

    private volatile AtomicInteger i = new AtomicInteger(0);
//    private volatile AtomicInteger s = new AtomicInteger(0);
//    private volatile AtomicInteger m = new AtomicInteger(0);

    public void getData() {
        log.info("=============================== time start {}",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        JSONObject brandObject = null;
        String brandOString = null;
        try {
            brandOString = carDataClient.getCarBrandList(token);
            brandObject = JSON.parseObject(brandOString);
            Integer status = brandObject.getInteger(STATUS);
            // 成功
            if (SUCCESS.equals(status)) {
                JSONArray httpResponseBrandList = brandObject.getJSONArray("brand_list");
                Vector<JSONObject> httpResponseBrandVe = new Vector(httpResponseBrandList.toJavaList(JSONObject.class));
                int sizeBrand = httpResponseBrandVe.size();
                CountDownLatch countDownLatch1 = new CountDownLatch(sizeBrand);
                ThreadPools.executor(sizeBrand,()->{
//                    String roll = i / sizeBrand * 100 + "";
//                    String progressBar = roll.substring(0, roll.indexOf('.') + 2) + "%";
//                    String showNum = i+"/"+sizeBrand;
//                    log.info("乘用车数据抓取进度---{}---{} ", progressBar,showNum);
                    JSONObject brandJson = httpResponseBrandVe.get(i.getAndAdd(1));
                    Che300Brand brand = TranslateUtil.buildChe300Brand(brandJson);
                    int count = che300BrandMapper.countBrand(brand.getBrandId());
                    if (count > 0) {
                        brand.setBrandModifytime(new Date());
                        che300BrandMapper.updateIgnoreNull(brand);
                    } else {
                        brand.setBrandCreatetime(new Date());
                        che300BrandMapper.addIgnoreCarBrand(brand);
                    }
                    this.getSeries(brand);
                    countDownLatch1.countDown();
                });
                countDownLatch1.await();
                log.info("@@@@@@@@@@@@@@@@@@@@@@@@brand end 品牌结束@@@@@@@@@@@@@@@@@@@");


            }
        } catch (Exception e) {
            log.error(ERROR, "getCarBrandList", brandObject, e);
        }
    }

    public void getSeries(Che300Brand brand) {
//        List<Che300Brand> all = che300BrandMapper.getAll(null, null);
//        Vector<Che300Brand> allVe = new Vector<>(all);
//        for (Che300Brand brand :allVe) {
            long brandId = TranslateUtil.minusThirtyMillion(brand.getBrandId());
            String url = "/service/getCarSeriesList?token=";
            JSONObject seriesObject;
            String seriesString;
            try {
                seriesString = carDataClient.getCarSeriesList(token, brandId);
                seriesObject = JSON.parseObject(seriesString);
                Integer status = seriesObject.getInteger(STATUS);
                // 成功
                if (SUCCESS.equals(status)) {
                    JSONArray httpResponseSeriesList = seriesObject.getJSONArray("series_list");
                    Vector<JSONObject> httpResponseSeriesVe = new Vector<>(httpResponseSeriesList.toJavaList(JSONObject.class));
                    int sizeSeries = httpResponseSeriesVe.size();
                    ThreadPools.executor(sizeSeries,() ->{
                        AtomicInteger s = new AtomicInteger(0);
                        JSONObject seriesJson = httpResponseSeriesVe.get(s.getAndAdd(1));
                        Che300Series series = TranslateUtil.buildChe300Series(seriesJson, brand);
                        int count = che300SeriesMapper.countSeries(series.getSeriesId());
                        if (count > 0) {
                            series.setSeriesModifytime(new Date());
                            che300SeriesMapper.updateIgnoreNull(series);
                        } else {
                            series.setSeriesCreatetime(new Date());
                            che300SeriesMapper.addIgnoreCarSeries(series);
                        }
                        /*抓取车型数据*/
                        getModels(brand, series);
                    });
                }
            } catch (Exception e) {
                log.error(ERROR, url, "", e);
            }
//        }
    }

    public void getModels(Che300Brand brand, Che300Series series) {
        long seriesId = TranslateUtil.minusThirtyMillion(series.getSeriesId());
        String url =  "/service/getCarModelList?token=";
        JSONObject modelObject;
        String modelString;
        try {
            modelString = carDataClient.getCarModelList(token,seriesId);
            modelObject = JSON.parseObject(modelString);
            Integer status = modelObject.getInteger(STATUS);
            // 成功
            int sizeModel = 0;
            if (SUCCESS.equals(status)) {
                JSONArray httpResponseModelList = modelObject.getJSONArray("model_list");
                Vector<JSONObject> httpResponseModelVe = new Vector(httpResponseModelList.toJavaList(JSONObject.class));
                sizeModel = httpResponseModelVe.size();
                ThreadPools.executor(sizeModel, ()->{
                    AtomicInteger m = new AtomicInteger(0);
                    JSONObject modelJson = httpResponseModelVe.get(m.getAndAdd(1));
                    String yearValue = modelJson.getString("model_year");
                    Che300Year year = new Che300Year(null, yearValue, seriesId, new Date(), new Date());
                    List<Che300Year> che300YearList = che300YearMapper.getBySYid(seriesId, yearValue);
                    if (ListUtil.isNotEmpty(che300YearList)) {
                        year = che300YearList.get(0);
                    }
                    Che300Vehicle model = TranslateUtil.buildChe300Model(modelJson, series, brand, year);
                    model.setCategory("乘用车");
                    int count = che300VehicleMapper.countModels(model.getModelId());
                    if (count > 0) {
                        model.setModelModifytime(new Date());
                        che300VehicleMapper.updateByChe300ModelId(model);
                    } else {
                        model.setModelCreatetime(new Date());
                        che300VehicleMapper.addIgnoreChe300Model(model);
                    }
                });
            }
            log.info("************************** time end {}*******************",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        } catch (Exception e) {
            log.error(ERROR, url, "", e);
        }
    }

    public Response<Che300Brand> getBrand(Long id) {
        Che300Brand che300Brand = che300BrandMapper.get(id);
        if ()
    }
}
