package com.cimcitech.cimcly.bean.opport_unit;

/**
 * Created by cimcitech on 2017/8/7.
 */

public class OpportUnitAddReq {

    private Long custid;    //客户id
    private String opportsubject;    //意向主题
    private String productid;    //产品型号
    private String plansigndate1;    //需求交付日
    private String planmoney;    //预计合同金额
    private String possibility;    //可能性
    private String detail;    //详细需求
    private String remark;    //备注
    private int creator;    //创建者
    private String currency;    //币种
    private String opporttype;    //意向类型
    private String paymentmethod;    //付款方式
    private String productcategory;//产品类别
    private String productvariety;    //产品品种
    private int productcount; //数量

    public OpportUnitAddReq(Long custid, String opportsubject, String productid, String plansigndate1, String planmoney, String possibility, String detail, String remark, int creator, String currency, String opporttype, String paymentmethod, String productcategory, String productvariety, int productcount) {
        this.custid = custid;
        this.opportsubject = opportsubject;
        this.productid = productid;
        this.plansigndate1 = plansigndate1;
        this.planmoney = planmoney;
        this.possibility = possibility;
        this.detail = detail;
        this.remark = remark;
        this.creator = creator;
        this.currency = currency;
        this.opporttype = opporttype;
        this.paymentmethod = paymentmethod;
        this.productcategory = productcategory;
        this.productvariety = productvariety;
        this.productcount = productcount;
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

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
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

    public int getProductcount() {
        return productcount;
    }

    public void setProductcount(int productcount) {
        this.productcount = productcount;
    }

    public String getPlansigndate1() {
        return plansigndate1;
    }

    public void setPlansigndate1(String plansigndate1) {
        this.plansigndate1 = plansigndate1;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }
}
