package cn.victorplus.vehicle.utils.car;

import cn.victorplus.vehicle.bean.db.*;
import cn.victorplus.vehicle.bean.dto.CarBrandDTO;
import cn.victorplus.vehicle.bean.dto.CarModelsDTO;
import cn.victorplus.vehicle.bean.dto.CarSeriesDTO;
import cn.victorplus.vehicle.bean.dto.CarYearDTO;
import cn.victorplus.vehicle.tools.ListUtil;
import cn.victorplus.vehicle.tools.StringUtils;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DTO转换工具
 */
public class TranslateUtil {

    private static final ReentrantLock lock = new ReentrantLock();
    private static final Long THIRTY_MILLION = 30000000L;
    private static ConcurrentHashMap<Integer, LongAdder> sequenceMap = new ConcurrentHashMap<>();

    /**
     * 车300车辆品牌对象转通用DTO对象
     *
     * @param brand
     * @return
     */
    public static CarBrandDTO translateCarBrand(Che300Brand brand) {
        CarBrandDTO carBrand = new CarBrandDTO();
        if (null != brand) {
            carBrand.setbId(brand.getBrandId().intValue());
            carBrand.setbName(brand.getBrandName());
            carBrand.setbCreatetime(brand.getBrandCreatetime());
            carBrand.setbModifytime(brand.getBrandModifytime());
            carBrand.setbFirstletter(brand.getBrandFirstLetter());
        }
        return carBrand;
    }

    /**
     * 车300车辆品牌集合对象转通用DTO对象集合
     *
     * @param brands
     * @return
     */
    public static List<CarBrandDTO> translateCarBrand(List<Che300Brand> brands) {
        List<CarBrandDTO> carBrandDTOList = new ArrayList<>();
        if (ListUtil.isNotEmpty(brands)) {
            for (Che300Brand brand : brands) {
                CarBrandDTO carBrandDTO = translateCarBrand(brand);
                carBrandDTOList.add(carBrandDTO);
            }
        }
        return carBrandDTOList;
    }

    /**
     * 车300车辆 车系对象转通用DTO对象
     *
     * @param series
     * @return
     */
    public static CarSeriesDTO translateCarSeries(Che300Series series) {
        CarSeriesDTO carSeriesDTO = new CarSeriesDTO();
        if (null != series) {
            carSeriesDTO.setbId(series.getBrandId().intValue());
            carSeriesDTO.setsId(series.getSeriesId().intValue());
            carSeriesDTO.setfId(0);//车300没有厂家Id
            carSeriesDTO.setsName(series.getSeriesName());
            carSeriesDTO.setSCreatetime(series.getSeriesCreatetime());
            carSeriesDTO.setsModifytime(series.getSeriesModifytime());
            carSeriesDTO.setsGroupName(series.getSeriesGroupName());
        }
        return carSeriesDTO;
    }

    /**
     * 车300车辆 车系集合转通用DTO对象集合
     *
     * @param seriesList
     * @return
     */
    public static List<CarSeries> translateCarSeries(List<Che300Series> seriesList) {
        List<CarSeries> carSeriesDTOList = new ArrayList<>();
        if (ListUtil.isNotEmpty(seriesList)) {
            for (Che300Series series : seriesList) {
                CarSeriesDTO carSeriesDTO = translateCarSeries(series);
                carSeriesDTOList.add(carSeriesDTO);
            }
        }
        return carSeriesDTOList;
    }

    /**
     * 车300车辆 车型对象转通用DTO对象
     *
     * @param model
     * @return
     */
    public static CarModelsDTO translateCarModel(Che300Vehicle model) {
        CarModelsDTO carModelsDTO = new CarModelsDTO();
        if (null != model) {
            carModelsDTO.setbId(model.getBrandId());
            carModelsDTO.setyId(model.getYearId());
            carModelsDTO.setsId(model.getSeriesId());
            carModelsDTO.setmCreatetime(model.getModelCreatetime());
            carModelsDTO.setMModifytime(model.getModelModifytime());
            carModelsDTO.setmName(model.getModelName());
            carModelsDTO.setmMsrp(model.getModelPrice().intValue());
            carModelsDTO.setMSeats(model.getModelSeats());
            carModelsDTO.setmGearbox(model.getModelGear());
            carModelsDTO.setMliter(model.getModelLiter());
            carModelsDTO.setmFuel(model.getModelFuel());
            carModelsDTO.setmLevel(model.getLevel());
            carModelsDTO.setMId(model.getModelId());
            carModelsDTO.setmDrivingmode(model.getDrivingMode());
        }
        return carModelsDTO;
    }

    /**
     * 车300车辆 车系集合转通用DTO对象集合
     *
     * @param che300Models
     * @return
     */
    public static List<CarModelsDTO> translateCarModel(List<Che300Vehicle> che300Models) {
        List<CarModelsDTO> carSeriesDTOList = new ArrayList<>();
        if (ListUtil.isNotEmpty(che300Models)) {
            for (Che300Vehicle carModel : che300Models) {
                CarModelsDTO carModels = translateCarModel(carModel);
                carSeriesDTOList.add(carModels);
            }
        }
        return carSeriesDTOList;
    }

    /**
     * 车300车辆 车年份对象转通用DTO对象
     *
     * @param year
     * @return
     */
    public static CarYear translateCarYear(Che300Year year) {
        CarYear carYear = new CarYearDTO();
        if (null != year) {
            carYear.setyId(year.getYearId().intValue());
            carYear.setYName(year.getYearName());
            carYear.setYCreatetime(year.getYearCreatetime());
            carYear.setyModifytime(year.getYearModifytime());
            carYear.setSId(year.getSeriesId().intValue());
        }
        return carYear;
    }

    /**
     * 车300车辆 车年份集合转通用DTO对象集合
     *
     * @param yearList
     * @return
     */
    public static List<CarYear> translateCarYear(List<Che300Year> yearList) {
        List<CarYear> carYearDTOS = new ArrayList<>();
        if (ListUtil.isNotEmpty(yearList)) {
            for (Che300Year che300Year : yearList) {
                CarYear carModels = translateCarYear(che300Year);
                carYearDTOS.add(carModels);
            }
        }
        return carYearDTOS;
    }

    public static Che300Series buildChe300Series(JSONObject json, Che300Brand brand) {
        Che300Series series = new Che300Series();
        if (null != json) {
            series.setBrandId(brand.getBrandId());
            long seriesId = Long.parseLong(json.getString("series_id"));
            series.setSeriesId(seriesId + THIRTY_MILLION);
            series.setSeriesName(json.getString("series_name"));
            series.setSeriesGroupName(json.getString("series_group_name"));
        }
        return series;
    }

    public static Che300Brand buildChe300Brand(JSONObject json) {
        Che300Brand brand = new Che300Brand();
        if (null != json) {
            Long brandId = Long.valueOf(json.getString("brand_id"));
            brand.setBrandId(brandId + THIRTY_MILLION);
            brand.setBrandName(json.getString("brand_name"));
            brand.setBrandFirstLetter(json.getString("initial"));
        }
        return brand;
    }

    public static Che300Vehicle buildChe300Model(JSONObject json, Che300Series series, Che300Brand brand, Che300Year year) {
        Che300Vehicle model = new Che300Vehicle();
        if (null != json) {
            model.setBrandId(brand.getBrandId());
            model.setBrandName(brand.getBrandName());
            Long modelId = Long.valueOf(json.getString("model_id"));
            model.setModelId(modelId + THIRTY_MILLION);
            model.setMaxRegYear(json.getString("max_reg_year"));
            model.setMinRegYear(json.getString("min_reg_year"));
            model.setModelGear(json.getString("gear_type"));
            model.setModelName(json.getString("model_name"));
            String liter = json.getString("liter");
            Matcher matcher = Pattern.compile("[a-zA-Z]").matcher(liter);
            if (matcher.find()){
                liter = liter.substring(0,matcher.start());
            }
            model.setModelLiter(liter);
            model.setModelPrice(new Double(json.getString("model_price")) * 10000);
            model.setModelSeats(json.getString("seat_number"));
            model.setModelYear(Integer.parseInt(json.getString("model_year")));
            model.setYearId(year.getYearId());
            model.setSeriesId(series.getSeriesId());
            model.setSeriesName(series.getSeriesName());
            model.setSeriesGroupName(series.getSeriesGroupName());
        }
        return model;
    }

    public static Che300Year buildChe300Year(String yearValue, Che300Series series) {
        Che300Year year = new Che300Year();
        if (StringUtils.isNotEmpty(yearValue)) {
            year.setSeriesId(series.getSeriesId());
            year.setYearModifytime(new Date());
            year.setYearCreatetime(new Date());
            year.setYearName(yearValue);
        }
        return year;
    }

    public static long addThirtyMillion(long id) {
        return id < THIRTY_MILLION ? id +THIRTY_MILLION : id;
    }

    public static long minusThirtyMillion(long id) {
        return id > THIRTY_MILLION ? id - THIRTY_MILLION: id;
    }
}
