package com.cimcitech.cimcly.bean.payment;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class PaymentVo {

    private ArrayList<PaymentCustomerDetail> data;
    private String msg;
    private boolean success;

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

    public ArrayList<PaymentCustomerDetail> getData() {
        return data;
    }

    public void setData(ArrayList<PaymentCustomerDetail> data) {
        this.data = data;
    }
}
