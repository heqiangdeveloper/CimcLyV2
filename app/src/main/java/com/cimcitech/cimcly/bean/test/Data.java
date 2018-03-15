package com.cimcitech.cimcly.bean.test;

import java.io.Serializable;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class Data implements Serializable{
    private String prodOrderNo;
    private int scheduleResultId;
    private String sorderNo;
    private String custName;
    private String productionName;

    public String getProdOrderNo() {
        return prodOrderNo;
    }

    public void setProdOrderNo(String prodOrderNo) {
        this.prodOrderNo = prodOrderNo;
    }

    public int getScheduleResultId() {
        return scheduleResultId;
    }

    public void setScheduleResultId(int scheduleResultId) {
        this.scheduleResultId = scheduleResultId;
    }

    public String getSorderNo() {
        return sorderNo;
    }

    public void setSorderNo(String sorderNo) {
        this.sorderNo = sorderNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }
}