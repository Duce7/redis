package cn.victorplus.vehicle.bean.db;


import java.io.Serializable;
import java.util.Date;

/**
 * @description : <p>车300城市列表数据</p>
 */
public class Che300City implements Serializable {


    private Long cityId;
    private String cityName;
    private Long provId;
    private String provName;
    private Date cityCreatetime;
    private Date cityModifytime;

    public Che300City(Long cityId, String cityName, Long provId, String provName, Date modelCreatetime, Date modelModifytime) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.provId = provId;
        this.provName = provName;
        this.cityCreatetime = modelCreatetime;
        this.cityModifytime = modelModifytime;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getProvId() {
        return provId;
    }

    public void setProvId(Long provId) {
        this.provId = provId;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public Date getModelCreatetime() {
        return cityCreatetime;
    }

    public void setModelCreatetime(Date modelCreatetime) {
        this.cityCreatetime = modelCreatetime;
    }

    public Date getModelModifytime() {
        return cityModifytime;
    }

    public void setModelModifytime(Date modelModifytime) {
        this.cityModifytime = modelModifytime;
    }

    @Override
    public String toString() {
        return "Che300City{" +
                "cityId=" + cityId +
                ", cityName=" + cityName +
                ", provId=" + provId +
                ", provName=" + provName +
                ", modelCreatetime=" + cityCreatetime +
                ", modelModifytime=" + cityModifytime +
                '}';
    }
}