package com.cimcitech.cimcly.bean.car_in_storage;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class WaitInStorageInfo implements Serializable{
    private String  vehicleno;
    private String contractNo;//合同号
    private String userName;
    private String custName;
    private String productmodel;
    private String depatureType;
    private String sorderno;//订单号
    private Long instoragedate;//完工日期
    private Long inwarehousedate;//入库日期
    private double saleUnitPrice;

    public double getSaleUnitPrice() {
        return saleUnitPrice;
    }

    public void setSaleUnitPrice(double saleUnitPrice) {
        this.saleUnitPrice = saleUnitPrice;
    }

    public Long getInwarehousedate() {
        return inwarehousedate;
    }

    public void setInwarehousedate(Long inwarehousedate) {
        this.inwarehousedate = inwarehousedate;
    }

    public Long getInstoragedate() {
        return instoragedate;
    }

    public void setInstoragedate(Long instoragedate) {
        this.instoragedate = instoragedate;
    }

    public String getSorderno() {
        return sorderno;
    }

    public void setSorderno(String sorderno) {
        this.sorderno = sorderno;
    }

    public String getDepatureType() {
        return depatureType;
    }

    public void setDepatureType(String depatureType) {
        this.depatureType = depatureType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(String productmodel) {
        this.productmodel = productmodel;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
}