package cn.victorplus.vehicle.bean;

public class Response<T> {
    private int status;
    private String msg;
    private T data;

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess(){
        return this.status == 0;
    }

    public static <T> Response<T> success() {
        Response<T> resp = new Response<T>();
        resp.status = 0;
        return resp;
    }

    public static <T> Response<T> success(String msg, T data) {
        Response<T> resp = new Response();
        resp.data = data;
        resp.status = 0;
        resp.msg = msg;
        return resp;
    }

    public static <T> Response<T> success(T data) {
        Response<T> resp = new Response();
        resp.data = data;
        resp.status = 0;
        return resp;
    }



    public static <T> Response<T> fail() {
        Response<T> resp = new Response();
        resp.status = 1;
        return resp;
    }

    public static <T> Response<T> fail(String msg) {
        Response<T> resp = new Response();
        resp.status = 1;
        resp.msg = msg;
        return resp;
    }

    public static <T> Response<T> fail(String msg, T data) {
        Response<T> resp = new Response();
        resp.data = data;
        resp.status = 1;
        resp.msg = msg;
        return resp;
    }


    public static <T> Response<T> error() {
        Response<T> resp = new Response();
        resp.status = 2;
        return resp;
    }

    public static <T> Response<T> error(String msg) {
        Response<T> resp = new Response();
        resp.status = 2;
        resp.msg = msg;
        return resp;
    }

    public static <T> Response<T> error(String msg, T data) {
        Response<T> resp = new Response();
        resp.data = data;
        resp.status = 2;
        resp.msg = msg;
        return resp;
    }

    public static <T> Response<T> customStatus(int status, String msg, T data) {
        Response<T> resp = new Response();
        resp.status = status;
        resp.msg = msg;
        resp.data = data;
        return resp;
    }
}
