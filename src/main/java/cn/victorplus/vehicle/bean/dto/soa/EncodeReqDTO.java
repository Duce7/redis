package cn.victorplus.vehicle.bean.dto.soa;

/**
 * @Description:
 * @Date: 2018-01-23 14:35
 */
public class EncodeReqDTO extends SoaBaseDTO {

    /**
     * 是否部分解密
     */
    private Boolean subDecode;

    /**
     * 待加密数据
     */
    private String data;


    public Boolean getSubDecode() {
        return subDecode;
    }

    public void setSubDecode(Boolean subDecode) {
        this.subDecode = subDecode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
