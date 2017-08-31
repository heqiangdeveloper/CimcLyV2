package com.cimcitech.cimcly.bean.report;

import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ProductReportVo {

    private ArrayList<ProductReportData> data;
    private String msg;
    private boolean success;

    public ArrayList<ProductReportData> getData() {
        return data;
    }

    public void setData(ArrayList<ProductReportData> data) {
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
