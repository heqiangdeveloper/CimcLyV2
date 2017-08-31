package com.cimcitech.cimcly.bean.opport_unit;

import java.io.Serializable;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class OpportUnitInfoVo implements Serializable{


    /**
     * data : {"cityName":"洛阳市","companyid":null,"contactId":null,"createdate":1502779174000,"creator":555555764,"currency":"RMB","currentStageValue":"待报价","currentstage":"CS01","custName":"0323测试","custid":70513,"custstatus":null,"detail":"","followStyle":null,"modifyby":null,"modifydate":null,"opportid":515,"opportno":"17-000114","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM02","planmoney":1234566789,"plansigndate":1502726400000,"plansigndate1":null,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productVarietyName":"液罐半挂","productcategory":"PC01","productcount":102,"productid":"CLY9340GRY","productvariety":"PV02","remark":"","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"张乐"}
     * msg :
     * success : true
     */

    private DataBean data;
    private String msg;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
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

    public static class DataBean implements Serializable {
        /**
         * cityName : 洛阳市
         * companyid : null
         * contactId : null
         * createdate : 1502779174000
         * creator : 555555764
         * currency : RMB
         * currentStageValue : 待报价
         * currentstage : CS01
         * custName : 0323测试
         * custid : 70513
         * custstatus : null
         * detail :
         * followStyle : null
         * modifyby : null
         * modifydate : null
         * opportid : 515
         * opportno : 17-000114
         * opportsubject : 1
         * opporttype : OT01
         * ordersource : null
         * orgid : null
         * paymentmethod : PAM02
         * planmoney : 1234566789
         * plansigndate : 1502726400000
         * plansigndate1 : null
         * possibility : PS01
         * possibilityValue : 低
         * productCategoryName : 液罐车
         * productVarietyName : 液罐半挂
         * productcategory : PC01
         * productcount : 102
         * productid : CLY9340GRY
         * productvariety : PV02
         * remark :
         * stage : ST02
         * stageValue : 意向跟进
         * status : T
         * unitid : null
         * userName : 张乐
         */

        private String cityName;
        private Object companyid;
        private Object contactId;
        private long createdate;
        private int creator;
        private String currency;
        private String currentStageValue;
        private String currentstage;
        private String custName;
        private int custid;
        private Object custstatus;
        private String detail;
        private Object followStyle;
        private Object modifyby;
        private Object modifydate;
        private int opportid;
        private String opportno;
        private String opportsubject;
        private String opporttype;
        private Object ordersource;
        private Object orgid;
        private String paymentmethod;
        private int planmoney;
        private long plansigndate;
        private Object plansigndate1;
        private String possibility;
        private String possibilityValue;
        private String productCategoryName;
        private String productVarietyName;
        private String productcategory;
        private int productcount;
        private String productid;
        private String productvariety;
        private String remark;
        private String stage;
        private String stageValue;
        private String status;
        private Object unitid;
        private String userName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Object getCompanyid() {
            return companyid;
        }

        public void setCompanyid(Object companyid) {
            this.companyid = companyid;
        }

        public Object getContactId() {
            return contactId;
        }

        public void setContactId(Object contactId) {
            this.contactId = contactId;
        }

        public long getCreatedate() {
            return createdate;
        }

        public void setCreatedate(long createdate) {
            this.createdate = createdate;
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

        public String getCurrentStageValue() {
            return currentStageValue;
        }

        public void setCurrentStageValue(String currentStageValue) {
            this.currentStageValue = currentStageValue;
        }

        public String getCurrentstage() {
            return currentstage;
        }

        public void setCurrentstage(String currentstage) {
            this.currentstage = currentstage;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public int getCustid() {
            return custid;
        }

        public void setCustid(int custid) {
            this.custid = custid;
        }

        public Object getCuststatus() {
            return custstatus;
        }

        public void setCuststatus(Object custstatus) {
            this.custstatus = custstatus;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public Object getFollowStyle() {
            return followStyle;
        }

        public void setFollowStyle(Object followStyle) {
            this.followStyle = followStyle;
        }

        public Object getModifyby() {
            return modifyby;
        }

        public void setModifyby(Object modifyby) {
            this.modifyby = modifyby;
        }

        public Object getModifydate() {
            return modifydate;
        }

        public void setModifydate(Object modifydate) {
            this.modifydate = modifydate;
        }

        public int getOpportid() {
            return opportid;
        }

        public void setOpportid(int opportid) {
            this.opportid = opportid;
        }

        public String getOpportno() {
            return opportno;
        }

        public void setOpportno(String opportno) {
            this.opportno = opportno;
        }

        public String getOpportsubject() {
            return opportsubject;
        }

        public void setOpportsubject(String opportsubject) {
            this.opportsubject = opportsubject;
        }

        public String getOpporttype() {
            return opporttype;
        }

        public void setOpporttype(String opporttype) {
            this.opporttype = opporttype;
        }

        public Object getOrdersource() {
            return ordersource;
        }

        public void setOrdersource(Object ordersource) {
            this.ordersource = ordersource;
        }

        public Object getOrgid() {
            return orgid;
        }

        public void setOrgid(Object orgid) {
            this.orgid = orgid;
        }

        public String getPaymentmethod() {
            return paymentmethod;
        }

        public void setPaymentmethod(String paymentmethod) {
            this.paymentmethod = paymentmethod;
        }

        public int getPlanmoney() {
            return planmoney;
        }

        public void setPlanmoney(int planmoney) {
            this.planmoney = planmoney;
        }

        public long getPlansigndate() {
            return plansigndate;
        }

        public void setPlansigndate(long plansigndate) {
            this.plansigndate = plansigndate;
        }

        public Object getPlansigndate1() {
            return plansigndate1;
        }

        public void setPlansigndate1(Object plansigndate1) {
            this.plansigndate1 = plansigndate1;
        }

        public String getPossibility() {
            return possibility;
        }

        public void setPossibility(String possibility) {
            this.possibility = possibility;
        }

        public String getPossibilityValue() {
            return possibilityValue;
        }

        public void setPossibilityValue(String possibilityValue) {
            this.possibilityValue = possibilityValue;
        }

        public String getProductCategoryName() {
            return productCategoryName;
        }

        public void setProductCategoryName(String productCategoryName) {
            this.productCategoryName = productCategoryName;
        }

        public String getProductVarietyName() {
            return productVarietyName;
        }

        public void setProductVarietyName(String productVarietyName) {
            this.productVarietyName = productVarietyName;
        }

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        public int getProductcount() {
            return productcount;
        }

        public void setProductcount(int productcount) {
            this.productcount = productcount;
        }

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getProductvariety() {
            return productvariety;
        }

        public void setProductvariety(String productvariety) {
            this.productvariety = productvariety;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }

        public String getStageValue() {
            return stageValue;
        }

        public void setStageValue(String stageValue) {
            this.stageValue = stageValue;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getUnitid() {
            return unitid;
        }

        public void setUnitid(Object unitid) {
            this.unitid = unitid;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
