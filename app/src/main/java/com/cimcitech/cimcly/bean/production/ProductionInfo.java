package com.cimcitech.cimcly.bean.production;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class ProductionInfo implements Serializable{
    private Long  prodorderdetid;
    private String sorderno;
    private Long confirmdate;
    private String vehicleno;
    private String productmodel;
    private Long planbegindate;
    private Long planenddate;
    private Long actualbegindate;
    private Long actualenddate;
    private boolean isfinish;
    private String userName;//业务员
    private String productstages;
    private String custName;//客户
    private String prodorderno;

    public String getProdorderno() {
        return prodorderno;
    }

    public void setProdorderno(String prodorderno) {
        this.prodorderno = prodorderno;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProductstages() {
        return productstages;
    }

    public void setProductstages(String productstages) {
        this.productstages = productstages;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getProdorderdetid() {
        return prodorderdetid;
    }

    public void setProdorderdetid(Long prodorderdetid) {
        this.prodorderdetid = prodorderdetid;
    }

    public String getSorderno() {
        return sorderno;
    }

    public void setSorderno(String sorderno) {
        this.sorderno = sorderno;
    }

    public Long getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Long confirmdate) {
        this.confirmdate = confirmdate;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(String productmodel) {
        this.productmodel = productmodel;
    }

    public Long getPlanbegindate() {
        return planbegindate;
    }

    public void setPlanbegindate(Long planbegindate) {
        this.planbegindate = planbegindate;
    }

    public Long getPlanenddate() {
        return planenddate;
    }

    public void setPlanenddate(Long planenddate) {
        this.planenddate = planenddate;
    }

    public Long getActualbegindate() {
        return actualbegindate;
    }

    public void setActualbegindate(Long actualbegindate) {
        this.actualbegindate = actualbegindate;
    }

    public Long getActualenddate() {
        return actualenddate;
    }

    public void setActualenddate(Long actualenddate) {
        this.actualenddate = actualenddate;
    }

    public boolean isfinish() {
        return isfinish;
    }

    public void setIsfinish(boolean isfinish) {
        this.isfinish = isfinish;
    }
}