package com.cimcitech.cimcly.bean.payment;

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
public class PaymentCustomer implements Serializable{
    private Long sorderid;

    private Long opportid;

    private String contractno;

    private String orderno;

    private Long custid;

    private String custName;

    private String currency;

    private BigDecimal totalprice;

    private BigDecimal deposit;

    private String isBringChassis;

    private Date signDate;

    private Integer count;

    private Date confirmDate;

    private BigDecimal residual;

    private BigDecimal depositAmount;

    private BigDecimal residualAmount;

    private BigDecimal strikeMoney;

    private BigDecimal paymentarrears;

    private BigDecimal handoffMoney;

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public BigDecimal getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(BigDecimal residualAmount) {
        this.residualAmount = residualAmount;
    }

    public BigDecimal getStrikeMoney() {
        return strikeMoney;
    }

    public void setStrikeMoney(BigDecimal strikeMoney) {
        this.strikeMoney = strikeMoney;
    }

    public BigDecimal getPaymentarrears() {
        return paymentarrears;
    }

    public void setPaymentarrears(BigDecimal paymentarrears) {
        this.paymentarrears = paymentarrears;
    }

    public BigDecimal getHandoffMoney() {
        return handoffMoney;
    }

    public void setHandoffMoney(BigDecimal handoffMoney) {
        this.handoffMoney = handoffMoney;
    }

    public Long getSorderid() {
        return sorderid;
    }

    public void setSorderid(Long sorderid) {
        this.sorderid = sorderid;
    }

    public Long getOpportid() {
        return opportid;
    }

    public void setOpportid(Long opportid) {
        this.opportid = opportid;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getTotalPrice() {
        return totalprice;
    }

    public void setTotalPrice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getIsBringChassis() {
        return isBringChassis;
    }

    public void setIsBringChassis(String isBringChassis) {
        this.isBringChassis = isBringChassis;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public BigDecimal getResidual() {
        return residual;
    }

    public void setResidual(BigDecimal residual) {
        this.residual = residual;
    }
}