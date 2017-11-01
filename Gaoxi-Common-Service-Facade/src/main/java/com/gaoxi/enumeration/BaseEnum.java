package com.gaoxi.enumeration;

/**
 * @author 大闲人柴毛毛
 * @date 2017/10/31 下午2:40
 * @description 枚举的顶层父类
 */
public class BaseEnum {

    protected int code;
    protected String msg;

    public BaseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
