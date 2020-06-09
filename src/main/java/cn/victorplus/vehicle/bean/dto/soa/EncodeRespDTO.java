package cn.victorplus.vehicle.bean.dto.soa;


import cn.victorplus.vehicle.bean.BaseEntity;

/**
 * @Description:
 * @Date: 2018-01-23 14:46
 */
public class EncodeRespDTO extends BaseEntity {

    /**
     * 全加密密文
     */
    private String result;
    /**
     * 部分加密密文
     */
    private String subDecode;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSubDecode() {
        return subDecode;
    }

    public void setSubDecode(String subDecode) {
        this.subDecode = subDecode;
    }
}
