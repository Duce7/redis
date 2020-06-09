package cn.victorplus.vehicle.service;

import cn.victorplus.vehicle.bean.db.Che300Brand;
import cn.victorplus.vehicle.bean.db.Che300Series;
import cn.victorplus.vehicle.bean.db.Che300Vehicle;
import cn.victorplus.vehicle.bean.db.Che300Year;
import cn.victorplus.vehicle.client.CarDataClient;
import cn.victorplus.vehicle.config.ThreadPools;
import cn.victorplus.vehicle.mapper.*;
import cn.victorplus.vehicle.tools.ListUtil;
import cn.victorplus.vehicle.utils.car.TranslateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
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
public class CarDateService {

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
    private volatile AtomicInteger s = new AtomicInteger(0);
    private volatile AtomicInteger m = new AtomicInteger(0);

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
                float sizeBrand = httpResponseBrandList.size();
                ThreadPools.executor((int)sizeBrand,()->{
//                    String roll = i / sizeBrand * 100 + "";
//                    String progressBar = roll.substring(0, roll.indexOf('.') + 2) + "%";
//                    String showNum = i+"/"+sizeBrand;
//                    log.info("乘用车数据抓取进度---{}---{} ", progressBar,showNum);
                    JSONObject brandJson = httpResponseBrandList.getJSONObject(i.getAndAdd(1));
                    Che300Brand brand = TranslateUtil.buildChe300Brand(brandJson);
                    int count = che300BrandMapper.countBrand(brand.getBrandId());
                    if (count > 0) {
                        brand.setBrandModifytime(new Date());
                        che300BrandMapper.updateIgnoreNull(brand);
                    } else {
                        brand.setBrandCreatetime(new Date());
                        che300BrandMapper.addIgnoreCarBrand(brand);
                    }
                    getSeries(brand);
                });

            }
        } catch (Exception e) {
            log.error(ERROR, "getCarBrandList", brandObject, e);
        }
    }

//
//    public void getCarData() {
//        JSONObject brandObject = null;
//        String brandOString = null;
//        try {
//            brandOString = carDataClient.getCarBrandList(token);
//            brandObject = JSON.parseObject(brandOString);
//            Integer status = brandObject.getInteger(STATUS);
//            // 成功
//            if (SUCCESS.equals(status)) {
//                JSONArray httpResponseBrandList = brandObject.getJSONArray("brand_list");
//                float sizeBrand = httpResponseBrandList.size();
//                for (int i = 0; i < sizeBrand; i++) {
//                    String roll = i / sizeBrand * 100 + "";
//                    String progressBar = roll.substring(0, roll.indexOf('.') + 2) + "%";
//                    String showNum = i+"/"+sizeBrand;
//                    log.info("乘用车数据抓取进度---{}---{} ", progressBar,showNum);
//                    JSONObject brandJson = httpResponseBrandList.getJSONObject(i);
//                    Che300Brand brand = TranslateUtil.buildChe300Brand(brandJson);
//                    int count = che300BrandMapper.countBrand(brand.getBrandId());
//                    if (count > 0) {
//                        brand.setBrandModifytime(new Date());
//                        che300BrandMapper.updateIgnoreNull(brand);
//                    } else {
//                        brand.setBrandCreatetime(new Date());
//                        che300BrandMapper.addIgnoreCarBrand(brand);
//                    }
//                    /*抓取车系数据*/
//                    getSeries(brand);
//                }
//            }
//        } catch (Exception e) {
//            log.error(ERROR, "getCarBrandList", brandObject, e);
//        }
//    }

    public void getSeries(Che300Brand brand) {
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
                int sizeSeries = httpResponseSeriesList.size();
                ThreadPools.executor(sizeSeries,new Dos(httpResponseSeriesList,brand));
            }
        } catch (Exception e) {
            log.error(ERROR, url, "", e);
        }
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
                sizeModel = httpResponseModelList.size();
                ThreadPools.executor(sizeModel, new Dom(httpResponseModelList,brand,series));
            }
            log.info("=============================== time end {} =======rate {}",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),m+"/"+sizeModel);
        } catch (Exception e) {
            log.error(ERROR, url, "", e);
        }
    }

    public Che300Year getYears(String yearValue, Long seriesId) {
        Che300Year year = null;
        year = new Che300Year(null, yearValue, seriesId, new Date(), new Date());
        List<Che300Year> che300YearList = che300YearMapper.getBySYid(seriesId, yearValue);
        if (ListUtil.isNotEmpty(che300YearList)) {
            return che300YearList.get(0);
        }
        che300YearMapper.addIgnoreCarYear(year);
        return year;
    }

    class Dom implements Runnable{
        private volatile AtomicReferenceArray<JSONObject> httpResponseModelList;
        private Che300Brand brand;
        private Che300Series series;

        public Dom(JSONArray httpResponseSeriesList,Che300Brand brand,Che300Series series) {
            this.brand = brand;
            this.httpResponseModelList = new AtomicReferenceArray(httpResponseSeriesList.toArray());
            this.series = series;
        }

        @Override
        public void run() {
            JSONObject modelJson = httpResponseModelList.get(m.getAndAdd(1));
            String year = modelJson.getString("model_year");
            /*插入年份*/
            Che300Year che300Year = getYears(year, series.getSeriesId());
            Che300Vehicle model = TranslateUtil.buildChe300Model(modelJson, series, brand, che300Year);
            model.setCategory("乘用车");
            int count = che300VehicleMapper.countModels(model.getModelId());
            if (count > 0) {
                model.setModelModifytime(new Date());
                che300VehicleMapper.updateByChe300ModelId(model);
            } else {
                model.setModelCreatetime(new Date());
                che300VehicleMapper.addIgnoreChe300Model(model);
            }
        }
    }

    class Dos implements Runnable{
        private Vector<JSONObject> httpResponseSeriesList;
        private Che300Brand brand;

        public Dos(JSONArray httpResponseSeriesList,Che300Brand brand) {
            this.brand = brand;
            this.httpResponseSeriesList = new Vector(httpResponseSeriesList.toJavaList(ArrayList.class));
        }

        @Override
        public void run() {
            JSONObject seriesJson = httpResponseSeriesList.get(s.getAndAdd(1));
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
        }
    }
}
