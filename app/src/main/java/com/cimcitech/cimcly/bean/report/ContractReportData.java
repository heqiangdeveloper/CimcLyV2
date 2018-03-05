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
public class ContractReportData implements Serializable{
    private int carCount;
    private int contCount;
    private String custId;
    private String custName;
    private String productVariety;
    private String productVarietyDesc;
    private String province;
    private String provinceDesc;
    private String region;
    private String regionDesc;
    private int totalprice;

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getContCount() {
        return contCount;
    }

    public void setContCount(int contCount) {
        this.contCount = contCount;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProductVariety() {
        return productVariety;
    }

    public void setProductVariety(String productVariety) {
        this.productVariety = productVariety;
    }

    public String getProductVarietyDesc() {
        return productVarietyDesc;
    }

    public void setProductVarietyDesc(String productVarietyDesc) {
        this.productVarietyDesc = productVarietyDesc;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceDesc() {
        return provinceDesc;
    }

    public void setProvinceDesc(String provinceDesc) {
        this.provinceDesc = provinceDesc;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionDesc() {
        return regionDesc;
    }

    public void setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
    }

}