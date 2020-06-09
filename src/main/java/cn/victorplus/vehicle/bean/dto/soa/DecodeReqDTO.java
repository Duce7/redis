package cn.victorplus.vehicle.bean.dto.soa;

/**
 * @Description:
 * @Date: 2018-01-23 15:24
 */
public class DecodeReqDTO extends SoaBaseDTO {

    /**
     * 待解密数据
     */
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
