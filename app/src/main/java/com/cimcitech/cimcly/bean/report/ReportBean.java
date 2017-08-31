package com.cimcitech.cimcly.bean.report;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class ReportBean{
    private String msg;
    private boolean success;
    private ArrayList<ReportData> data;

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

    public ArrayList<ReportData> getData() {
        return data;
    }

    public void setData(ArrayList<ReportData> data) {
        this.data = data;
    }
}