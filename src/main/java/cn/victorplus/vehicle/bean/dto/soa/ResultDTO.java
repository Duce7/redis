package cn.victorplus.vehicle.bean.dto.soa;


import cn.victorplus.vehicle.bean.BaseEntity;

/**
 * @Description:
 * @Date: 2018-01-23 14:06
 */
public class ResultDTO<T> extends BaseEntity {

    private String code;

    private String msg;

    private T body;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
