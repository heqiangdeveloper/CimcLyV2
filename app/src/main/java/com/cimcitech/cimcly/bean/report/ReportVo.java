package com.cimcitech.cimcly.bean.report;

import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ReportVo {

    private ArrayList<ReportData> data;
    private String msg;
    private boolean success;

    public ArrayList<ReportData> getData() {
        return data;
    }

    public void setData(ArrayList<ReportData> data) {
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
