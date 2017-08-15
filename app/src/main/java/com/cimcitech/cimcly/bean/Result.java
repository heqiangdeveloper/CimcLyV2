package com.cimcitech.cimcly.bean;

import java.io.Serializable;

/**
 *
 */
public class Result<T> implements Serializable {
    /**
     * data : {"userId":2,"token":"2FD08ED0-E53B-48B1-B8E6-E6B4290A2770"}
     * msg :
     * success : true
     */

    private T data;
    private String msg;
    private boolean success;

    public T getData() {
        return data;
    }

    public void setData(T data) {
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

    public static class DataBean {
    }




}
