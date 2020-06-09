package cn.victorplus.vehicle.bean.dto.soa;

/**
 * @Description:
 * @Date: 2018-01-23 15:26
 */
public class SubDecodeReqDTO extends SoaBaseDTO{

    private Boolean batch;

    private Object data;


    public Boolean getBatch() {
        return batch;
    }

    public void setBatch(Boolean batch) {
        this.batch = batch;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
