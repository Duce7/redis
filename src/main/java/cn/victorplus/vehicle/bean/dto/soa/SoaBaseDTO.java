package cn.victorplus.vehicle.bean.dto.soa;


import cn.victorplus.vehicle.bean.BaseEntity;

/**
 * @Description:
 * @Date: 2018-01-23 14:33
 */
public class SoaBaseDTO extends BaseEntity {
    /**
     * 订单编号(业务系统数据唯一标识)
     */
    private String appCode;
    /**
     * 业务人员姓名
     */
    private String userId;
    /**
     * 业务系统标识
     */
    private String sysName = "vehicle";

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }
}
