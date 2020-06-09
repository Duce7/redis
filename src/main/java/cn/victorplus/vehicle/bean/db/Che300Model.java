package cn.victorplus.vehicle.bean.db;


import java.io.Serializable;
import java.util.Date;

/**
 * @description : <p>车300车型数据</p>
 * @author : Zhao Yun
 * @since : 2018/04/28 15:18
 */
public class  Che300Model implements Serializable {

    /* Zhao Yun 2018/04/28 ID */
    private Long id;
    /* Zhao Yun 2018/04/28 品牌ID */
    private Long brandId;
    /* Zhao Yun 2018/04/28 品牌名称 */
    private String brandName;
    /* Zhao Yun 2018/04/28 车系ID */
    private Long seriesId;
    /* Zhao Yun 2018/04/28 车系名称 */
    private String seriesName;
    private Long yearId;
    /* Zhao Yun 2018/04/28 车系分组名称 */
    private String seriesGroupName;
    /* Zhao Yun 2018/04/28 车型ID */
    private Long modelId;
    /* Zhao Yun 2018/04/28 车型名称 */
    private String modelName;
    /* Zhao Yun 2018/04/28 车型年款 */
    private Integer modelYear;
    /* Zhao Yun 2018/04/28 颜色 */
    private String color;
    /* Zhao Yun 2018/04/28 排量 */
    private String modelLiter;
    /* Zhao Yun 2018/04/28 排放标准 */
    private String modelEmissionStandard;
    /* Zhao Yun 2018/04/28 添加时间 */
    private String modelGear;
    private String modelSeats;
    private Date modelCreatetime;
    /* Zhao Yun 2018/04/28 变速箱类型 */
    private Date modelModifytime;
    /* Zhao Yun 2018/04/28 车型指导价 */
    private Double modelPrice;
    /* Zhao Yun 2018/04/28 最小上牌年份 */
    private String minRegYear;
    /* Zhao Yun 2018/04/28 最大上牌年份 */
    private String maxRegYear;
    /* Zhao Yun 2018/04/28 VIN码 */
    private String vin;
    private String modelFuel;
    private String modelLevel;
    private String category;
    public Che300Model() {
    }

    public Che300Model(
            Long id,
            Long brandId,
            String brandName,
            Long seriesId,
            String seriesName,
            Long yearId,
            String seriesGroupName,
            Long modelId,
            String modelName,
            Integer modelYear,
            String color,
            String modelFuel,
            String modelLiter,
            String modelEmissionStandard,
            Date modelCreatetime,
            Date modelModifytime,
            String modelGear,
            String modelSeats,
            Double modelPrice,
            String minRegYear,
            String maxRegYear,
            String modelLevel,
            String category,
            String vin) {
        this.id = id;
        this.brandId = brandId;
        this.brandName = brandName;
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.yearId = yearId;
        this.seriesGroupName = seriesGroupName;
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.modelFuel = modelFuel;
        this.modelLiter = modelLiter;
        this.modelEmissionStandard = modelEmissionStandard;
        this.modelGear = modelGear;
        this.modelSeats = modelSeats;
        this.modelCreatetime = modelCreatetime;
        this.modelModifytime = modelModifytime;
        this.modelPrice = modelPrice;
        this.minRegYear = minRegYear;
        this.maxRegYear = maxRegYear;
        this.vin = vin;
        this.modelLevel = modelLevel;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Long getYearId() {
        return yearId;
    }

    public void setYearId(Long yearId) {
        this.yearId = yearId;
    }

    public String getSeriesGroupName() {
        return seriesGroupName;
    }

    public void setSeriesGroupName(String seriesGroupName) {
        this.seriesGroupName = seriesGroupName;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelLiter() {
        return modelLiter;
    }

    public void setModelLiter(String modelLiter) {
        this.modelLiter = modelLiter;
    }

    public String getModelEmissionStandard() {
        return modelEmissionStandard;
    }

    public void setModelEmissionStandard(String modelEmissionStandard) {
        this.modelEmissionStandard = modelEmissionStandard;
    }

    public Date getModelCreatetime() {
        return modelCreatetime;
    }

    public void setModelCreatetime(Date modelCreatetime) {
        this.modelCreatetime = modelCreatetime;
    }

    public Date getModelModifytime() {
        return modelModifytime;
    }

    public void setModelModifytime(Date modelModifytime) {
        this.modelModifytime = modelModifytime;
    }

    public String getModelGear() {
        return modelGear;
    }

    public void setModelGear(String modelGear) {
        this.modelGear = modelGear;
    }

    public String getModelSeats() {
        return modelSeats;
    }

    public void setModelSeats(String modelSeats) {
        this.modelSeats = modelSeats;
    }

    public Double getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(Double modelPrice) {
        this.modelPrice = modelPrice;
    }

    public String getMinRegYear() {
        return minRegYear;
    }

    public void setMinRegYear(String minRegYear) {
        this.minRegYear = minRegYear;
    }

    public String getMaxRegYear() {
        return maxRegYear;
    }

    public void setMaxRegYear(String maxRegYear) {
        this.maxRegYear = maxRegYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelFuel() {
        return modelFuel;
    }

    public void setModelFuel(String modelFuel) {
        this.modelFuel = modelFuel;
    }

    public String getModelLevel() {
        return modelLevel;
    }

    public void setModelLevel(String modelLevel) {
        this.modelLevel = modelLevel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Che300Model{" +
            "id=" + id +
            ", brandId=" + brandId +
            ", brandName=\"" + brandName + '\"' +
            ", seriesId=" + seriesId +
            ", seriesName=\"" + seriesName + '\"' +
            ", yearId=\"" + yearId + '\"' +
            ", seriesGroupName=\"" + seriesGroupName + '\"' +
            ", modelId=" + modelId +
            ", modelName=\"" + modelName + '\"' +
            ", modelYear=" + modelYear +
            ", color=\"" + color + '\"' +
            ", modelFuel=\"" + modelFuel + '\"' +
            ", modelLiter=\"" + modelLiter + '\"' +
            ", modelEmissionStandard=\"" + modelEmissionStandard + '\"' +
            ", modelCreatetime=\"" + modelCreatetime + '\"' +
            ", modelModifytime=\"" + modelModifytime + '\"' +
            ", modelGear=\"" + modelGear + '\"' +
            ", modelSeats=\"" + modelSeats + '\"' +
            ", modelPrice=" + modelPrice +
            ", minRegYear=\"" + minRegYear + '\"' +
            ", maxRegYear=\"" + maxRegYear + '\"' +
            ", vin=\"" + vin + '\"' +
            ", modelLevel=\"" + modelLevel + '\"' +
            ", category=\"" + category + '\"' +
        '}';
    }

}