package cn.victorplus.vehicle.bean.db;

import java.io.Serializable;
import java.util.Date;


/**
 * @description : <p>车300请求日志表</p>
 * @author : Zhao Yun
 * @since : 2018/04/28 11:27
 */
public class Che300ModelLog implements Serializable {

    /* Zhao Yun 2018/04/28 ID */
    private Long id;
    /* Zhao Yun 2018/04/28 Boss系统订单号 */
    private String appCode;
    /* Zhao Yun 2018/04/28 调用系统名称 */
    private String sysName;
    /* Zhao Yun 2018/04/28 请求类型(1-VIN码查询,2-查询校验) */
    private Integer che300ReqType;
    /* Zhao Yun 2018/04/28 查询VIN码 */
    private String vin;
    /* Zhao Yun 2018/04/28 车型ID */
    private Integer modelId;
    /* Zhao Yun 2018/04/28 请求状态，0失败，1成功 */
    private Integer status;
    /* Zhao Yun 2018/04/28 请求结果 */
    private String result;
    /* Zhao Yun 2018/04/28 创建时间 */
    private Date created;
    private String modelQuote;
    private String paramsKey;
    public Che300ModelLog() {
    }

    public Che300ModelLog(
            Long id,
            String appCode,
            String sysName,
            Integer che300ReqType,
            String vin,
            Integer modelId,
            Integer status,
            String result,
            String modelQuote,
            String paramsKey,
            Date created) {
        this.id = id;
        this.appCode = appCode;
        this.sysName = sysName;
        this.che300ReqType = che300ReqType;
        this.vin = vin;
        this.modelId = modelId;
        this.status = status;
        this.result = result;
        this.modelQuote = modelQuote;
        this.paramsKey = paramsKey;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public Integer getChe300ReqType() {
        return che300ReqType;
    }

    public void setChe300ReqType(Integer che300ReqType) {
        this.che300ReqType = che300ReqType;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getModelQuote() {
        return modelQuote;
    }

    public void setModelQuote(String modelQuote) {
        this.modelQuote = modelQuote;
    }

    public String getParamsKey() {
        return paramsKey;
    }

    public void setParamsKey(String paramsKey) {
        this.paramsKey = paramsKey;
    }

    @Override
    public String toString() {
        return "Che300ModelLog{" +
            "id=" + id +
            ", appCode=\"" + appCode + '\"' +
            ", sysName=\"" + sysName + '\"' +
            ", che300ReqType=" + che300ReqType +
            ", vin=\"" + vin + '\"' +
            ", modelId=" + modelId +
            ", status=" + status +
            ", result=\"" + result + '\"' +
            ", created=" + created +
            ", paramsKey=" + paramsKey +
            ", modelQuote=" + modelQuote +
        '}';
    }

}