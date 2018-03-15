package com.cimcitech.cimcly.bean.test;

import com.cimcitech.cimcly.bean.report.ReportData;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class VehicleInfoVo implements Serializable{

    private Data data;
    private String msg;
    private boolean success;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
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
