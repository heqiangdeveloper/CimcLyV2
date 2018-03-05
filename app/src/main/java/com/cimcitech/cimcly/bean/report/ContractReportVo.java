package com.cimcitech.cimcly.bean.report;

import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ContractReportVo {

    private ArrayList<ContractReportData> data;
    private String msg;
    private boolean success;

    public ArrayList<ContractReportData> getData() {
        return data;
    }

    public void setData(ArrayList<ContractReportData> data) {
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
