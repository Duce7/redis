package cn.victorplus.vehicle.bean.db;


import cn.victorplus.vehicle.bean.BaseEntity;

import java.util.Date;

/**
WARNING: 
this code is generated by CodeMonkey
please DO NOT modify this file
**/
public class CarYear extends BaseEntity {
  /**
  年代款ID
  **/
  private Integer yId;
  /**
  年代款名称
  **/
  private String yName;
  /**
  车系ID
  **/
  private Integer sId;
  /**
  创建时间
  **/
  private Date yCreatetime;
  /**
  最后修改时间
  **/
  private Date yModifytime;
  private Long cuid;
  private String cuname;

  public CarYear() {
  }

  public CarYear(
          Integer yId,
          String yName,
          Integer sId,
          String yQuote,
          Date yCreatetime,
          Date yModifytime) {
    this.yId = yId;
    this.yName = yName;
    this.sId = sId;
    this.yCreatetime = yCreatetime;
    this.yModifytime = yModifytime;
  }

  public CarYear(Integer yId, String yName, Integer sId, Date yCreatetime, Date yModifytime, Long cuid, String cuname) {
    this.yId = yId;
    this.yName = yName;
    this.sId = sId;
    this.yCreatetime = yCreatetime;
    this.yModifytime = yModifytime;
    this.cuid = cuid;
    this.cuname = cuname;
  }

  public Integer getYId() {
  	return yId;
  }
	
  public void setYId(Integer yId) {
    this.yId = yId;
  }
	
  public String getYName() {
  	return yName;
  }
	
  public void setYName(String yName) {
    this.yName = yName;
  }
	
  public Integer getSId() {
  	return sId;
  }
	
  public void setSId(Integer sId) {
    this.sId = sId;
  }
	
  public Date getYCreatetime() {
  	return yCreatetime;
  }
	
  public void setYCreatetime(Date yCreatetime) {
    this.yCreatetime = yCreatetime;
  }
	
  public Date getYModifytime() {
  	return yModifytime;
  }
	
  public void setYModifytime(Date yModifytime) {
    this.yModifytime = yModifytime;
  }

  public Integer getyId() {
    return yId;
  }

  public void setyId(Integer yId) {
    this.yId = yId;
  }

  public String getyName() {
    return yName;
  }

  public void setyName(String yName) {
    this.yName = yName;
  }

  public Integer getsId() {
    return sId;
  }

  public void setsId(Integer sId) {
    this.sId = sId;
  }

  public Date getyCreatetime() {
    return yCreatetime;
  }

  public void setyCreatetime(Date yCreatetime) {
    this.yCreatetime = yCreatetime;
  }

  public Date getyModifytime() {
    return yModifytime;
  }

  public void setyModifytime(Date yModifytime) {
    this.yModifytime = yModifytime;
  }

  public Long getCuid() {
    return cuid;
  }

  public void setCuid(Long cuid) {
    this.cuid = cuid;
  }

  public String getCuname() {
    return cuname;
  }

  public void setCuname(String cuname) {
    this.cuname = cuname;
  }

}
