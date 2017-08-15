package com.cimcitech.cimcly.bean.opport_unit;

/**
 * Created by cimcitech on 2017/8/7.
 */

public class OpportUnitUpdateReq {

    private int opportid;    //意向id
    private int custid;    //客户id
    private String opportsubject;    //意向主题
    private String productid;    //产品型号
    private String plansigndate;    //需求交付日
    private String planmoney;    //预计合同金额
    private String possibility;    //可能性
    private String detail;    //详细需求
    private String remark;    //备注
    private int modify;    //修改人
    private String currency;    //币种
    private String opporttype;    //意向类型
    private String paymentmethod;    //付款方式
    private String productcategory;    //产品类别
    private String productvariety;    //产品品种
    private String followStyle;    //跟进方式
    private int productcount;

    public OpportUnitUpdateReq(int opportid, int custid, String opportsubject, String productid, String plansigndate, String planmoney, String possibility, String detail, String remark, int modify, String currency, String opporttype, String paymentmethod, String productcategory, String productvariety, String followStyle, int productcount) {
        this.opportid = opportid;
        this.custid = custid;
        this.opportsubject = opportsubject;
        this.productid = productid;
        this.plansigndate = plansigndate;
        this.planmoney = planmoney;
        this.possibility = possibility;
        this.detail = detail;
        this.remark = remark;
        this.modify = modify;
        this.currency = currency;
        this.opporttype = opporttype;
        this.paymentmethod = paymentmethod;
        this.productcategory = productcategory;
        this.productvariety = productvariety;
        this.followStyle = followStyle;
        this.productcount = productcount;
    }

    public int getOpportid() {
        return opportid;
    }

    public void setOpportid(int opportid) {
        this.opportid = opportid;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getOpportsubject() {
        return opportsubject;
    }

    public void setOpportsubject(String opportsubject) {
        this.opportsubject = opportsubject;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getPlansigndate() {
        return plansigndate;
    }

    public void setPlansigndate(String plansigndate) {
        this.plansigndate = plansigndate;
    }

    public String getPlanmoney() {
        return planmoney;
    }

    public void setPlanmoney(String planmoney) {
        this.planmoney = planmoney;
    }

    public String getPossibility() {
        return possibility;
    }

    public void setPossibility(String possibility) {
        this.possibility = possibility;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getModify() {
        return modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOpporttype() {
        return opporttype;
    }

    public void setOpporttype(String opporttype) {
        this.opporttype = opporttype;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }

    public String getProductvariety() {
        return productvariety;
    }

    public void setProductvariety(String productvariety) {
        this.productvariety = productvariety;
    }

    public String getFollowStyle() {
        return followStyle;
    }

    public void setFollowStyle(String followStyle) {
        this.followStyle = followStyle;
    }

    public int getProductcount() {
        return productcount;
    }

    public void setProductcount(int productcount) {
        this.productcount = productcount;
    }
}
