package com.cimcitech.cimcly.bean;

/**
 * Created by cimcitech on 2017/7/31.
 */

public class LoginVo {

    private Loginback data;
    private String msg;
    private boolean success;

    public Loginback getData() {
        return data;
    }

    public void setData(Loginback data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
