package com.cimcitech.cimcly.bean.payment;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class PaymentDetailVo {

    private Data data;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Data{
        private Object paccountno;
        private Object accountremark;
        private Object category;
        private Object checkaccountid;
        private Object collectBank;
        private Object collectbank;
        private Object collectno;
        private Object  companyid;
        private Object  contractno;
        private Object  createdate;
        private Object   creator;
        private Object  custName;
        private Object custid;
        private Object  customerNo;
        private Object  departuredate;
        private Object   depositamount;
        private Object  enteramount;
        private Object   feetype;
        private Object handoffmoney;
        private Object      incomeid;
        private Object      invoicedate;
        private Object  invoicetype;
        private Object     isconfirm;
        private Object   isloan;
        private Object   isreceived;
        private Object    issuednumber;
        private Object    modifyby;
        private Object    modifydate;
        private Object     nextremittancedate;
        private Object     openbank;
        private Object      orgid;
        private Object      paymentarrears;
        private Object      paymentunit;
        private Object      postingdate;
        private Object      remark;
        private Object       remitmethod;
        private Object       residualamount;
        private Object      resourceid;
        private Object    sorderid;
        private Object    strikemoney;
        private Object       transactionAmount;
        private Object     transactionDate;
        private Object       usedamount;
    }
}
