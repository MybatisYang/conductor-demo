package com.example.demo.work;

/**
 * @Description: 统一返回结果
 * @Author: yjs
 * @createTime: 2022年04月26日 09:25:31
 * @version: 1.0
 */
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static CommonResult ok (String msg) {
        CommonResult r = new CommonResult();
        r.setCode(200);
        r.setMessage(msg);
        return r;
    }

    public static CommonResult ok (String msg, Object data) {
        CommonResult r = new CommonResult();
        r.setCode(200);
        r.setMessage(msg);
        r.setData(data);
        return r;
    }

    public static CommonResult error (ErrorEnum errorEnum) {
        CommonResult r = new CommonResult();
        r.setMessage(errorEnum.getMsg());
        r.setCode(errorEnum.getCode());
        return r;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

