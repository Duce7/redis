package cn.victorplus.vehicle.bean.dto.soa;


import cn.victorplus.vehicle.bean.BaseEntity;

/**
 * @Description:
 * @Date: 2018-01-23 15:25
 */
public class DecodeRespDTO extends BaseEntity {

    /**
     * 解密完成的字符串
     */
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
