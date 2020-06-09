package cn.victorplus.vehicle.bean.db;

import java.io.Serializable;
import java.util.Date;

/**
 * @description : <p>车300车型数据</p>
 */
public class Che300Vehicle implements Serializable {

    private Long id;
    private Long brandId;
    private String brandName;
    private Long seriesId;
    private String seriesName;
    private Long yearId;
    private String seriesGroupName;
    private Long modelId;
    private String modelName;
    private Integer modelYear;
    private String color;
    private String modelLiter;
    private String modelFuel;
    private String modelEmissionStandard;
    private String modelGear;
    private String modelSeats;
    private Date modelCreatetime;
    private Date modelModifytime;
    private Double modelPrice;
    private String minRegYear;
    private String maxRegYear;
    private String vin;
    private String level;
    private String category;
    private String drivingMode;

    public Che300Vehicle() {
    }

    public Che300Vehicle(Long id, Long brandId, String brandName, Long seriesId, String seriesName, Long yearId, String seriesGroupName, Long modelId, String modelName, Integer modelYear, String color, String modelLiter, String modelFuel, String modelEmissionStandard, String modelGear, String modelSeats, Date modelCreatetime, Date modelModifytime, Double modelPrice, String minRegYear, String maxRegYear, String vin, String level, String category, String drivingMode) {
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
        this.modelLiter = modelLiter;
        this.modelFuel = modelFuel;
        this.modelEmissionStandard = modelEmissionStandard;
        this.modelGear = modelGear;
        this.modelSeats = modelSeats;
        this.modelCreatetime = modelCreatetime;
        this.modelModifytime = modelModifytime;
        this.modelPrice = modelPrice;
        this.minRegYear = minRegYear;
        this.maxRegYear = maxRegYear;
        this.vin = vin;
        this.level = level;
        this.category = category;
        this.drivingMode = drivingMode;
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

    public String getModelFuel() {
        return modelFuel;
    }

    public void setModelFuel(String modelFuel) {
        this.modelFuel = modelFuel;
    }

    public String getModelEmissionStandard() {
        return modelEmissionStandard;
    }

    public void setModelEmissionStandard(String modelEmissionStandard) {
        this.modelEmissionStandard = modelEmissionStandard;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDrivingMode() {
        return drivingMode;
    }

    public void setDrivingMode(String drivingMode) {
        this.drivingMode = drivingMode;
    }

    @Override
    public String toString() {
        return "Che300Vehicle{" +
                "id=" + id +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", seriesId=" + seriesId +
                ", seriesName='" + seriesName + '\'' +
                ", yearId=" + yearId +
                ", seriesGroupName='" + seriesGroupName + '\'' +
                ", modelId=" + modelId +
                ", modelName='" + modelName + '\'' +
                ", modelYear=" + modelYear +
                ", color='" + color + '\'' +
                ", modelLiter='" + modelLiter + '\'' +
                ", modelFuel='" + modelFuel + '\'' +
                ", modelEmissionStandard='" + modelEmissionStandard + '\'' +
                ", modelGear='" + modelGear + '\'' +
                ", modelSeats='" + modelSeats + '\'' +
                ", modelCreatetime=" + modelCreatetime +
                ", modelModifytime=" + modelModifytime +
                ", modelPrice=" + modelPrice +
                ", minRegYear='" + minRegYear + '\'' +
                ", maxRegYear='" + maxRegYear + '\'' +
                ", vin='" + vin + '\'' +
                ", level='" + level + '\'' +
                ", category='" + category + '\'' +
                ", drivingMode='" + drivingMode + '\'' +
                '}';
    }
}