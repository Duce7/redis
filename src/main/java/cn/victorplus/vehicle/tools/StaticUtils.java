package cn.victorplus.vehicle.tools;

import java.nio.charset.Charset;

/**
 * 静态变量配置
 * @author longfei
 * @version 1.0.0
 */
public interface StaticUtils {
    String BASE_PATH = "cn.victorplus.vehicle";
    String MAPPER_PATH = BASE_PATH + ".mapper";
    String CONTROLLER_PATH = BASE_PATH + ".web.controller";

    String UTF_8 = "UTF-8";
    Charset UTF_8_CHARSET = Charset.forName(UTF_8);
    /* 易车 */
    String BIT_HOST = "http://api.car.bitauto.com";
    String BIT_URL = BIT_HOST + "/CarInfo/MasterBrandToSerialNew.aspx";
    /* 汽车之家 */
    String AUTO_HOME_HOST = "https://www.autohome.com.cn";
    String AUTO_HOME_URL = AUTO_HOME_HOST + "/ashx/AjaxIndexCarFind.ashx";
    /* 汽车之家 - 参数 */
    String CAR_PARAM_HOST = "https://carif.api.autohome.com.cn";
    String CAR_PARAM_URL = CAR_PARAM_HOST + "/Car/Spec_ParamListBySpecList.ashx";
    @Deprecated // M站的，暂时作废
            String CAR_ESSENTIAL_PARAM_HOST = "https://car.m.autohome.com.cn";
    @Deprecated // M站的，暂时作废
            String CAR_ESSENTIAL_PARAM_URL = CAR_ESSENTIAL_PARAM_HOST + "/ashx/car/GetModelConfig1.ashx";
    /* 精友 */
    String GENI_HOST = "http://zy.mljr.com";
    String GENI_URL = GENI_HOST + "/ylCarService";

    String CHE300_HOST = "http://testapi.che300.com";
    /* 车300 - 参数 */
    String CHE300_TOKEN = "a3778eeb8ead5c3de1f30ee673bb089a";
    /* 车300 */
    String CHE300_BRAND_URL = CHE300_HOST + "/service/getCarBrandList?token=" +CHE300_TOKEN ;
    String CHE300_SERIES_URL = CHE300_HOST + "/service/getCarSeriesList?token=" +CHE300_TOKEN + "&brandId=";
    String CHE300_MODEL_URL = CHE300_HOST + "/service/getCarModelList?token=" +CHE300_TOKEN + "&seriesId=";
    String CHE300_VIN_URL = CHE300_HOST + "/service/identifyModelByVIN?token=" +CHE300_TOKEN + "&vin=";

}
