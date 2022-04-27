package com.example.demo.work;

public enum ErrorEnum {

    VALID_EXCEPTION(10001, "参数格式校验失败");

    /**
     * 失败错误码
     */
    private final int code;

    /**
     * 失败错误信息
     */
    private final String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
