package com.cimcitech.cimcly.bean.payment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class PaymentCustomerDetail implements Serializable{
    private ArrayList<DetailData> data;
    private String msg;
    private boolean success;

    public ArrayList<DetailData> getData() {
        return data;
    }

    public void setData(ArrayList<DetailData> data) {
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

    public class DetailData{
        private long sorderid;

        private long opportid;

        private String contractno;

        private String orderno;

        private long custid;

        private String custName;

        private String currency;

        private BigDecimal totalprice;

        private BigDecimal deposit;

        private String isBringChassis;

        private long signDate;

        private Integer count;

        private long confirmDate;

        private BigDecimal residual;

        private BigDecimal depositamount;

        private BigDecimal residualamount;

        private BigDecimal strikemoney;

        private BigDecimal paymentarrears;

        private BigDecimal handoffmoney;

        private long createdate;

        private BigDecimal transactionAmount;

        private String collectBank;

        private String remitmethod;

        private long transactionDate;

        public BigDecimal getDepositamount() {
            return depositamount;
        }

        public void setDepositamount(BigDecimal depositamount) {
            this.depositamount = depositamount;
        }

        public BigDecimal getResidualamount() {
            return residualamount;
        }

        public void setResidualamount(BigDecimal residualamount) {
            this.residualamount = residualamount;
        }

        public BigDecimal getStrikemoney() {
            return strikemoney;
        }

        public void setStrikemoney(BigDecimal strikemoney) {
            this.strikemoney = strikemoney;
        }

        public BigDecimal getHandoffmoney() {
            return handoffmoney;
        }

        public void setHandoffmoney(BigDecimal handoffmoney) {
            this.handoffmoney = handoffmoney;
        }

        public long getCreatedate() {
            return createdate;
        }

        public void setCreatedate(long createdate) {
            this.createdate = createdate;
        }

        public BigDecimal getTransactionAmount() {
            return transactionAmount;
        }

        public void setTransactionAmount(BigDecimal transactionAmount) {
            this.transactionAmount = transactionAmount;
        }

        public String getCollectBank() {
            return collectBank;
        }

        public void setCollectBank(String collectBank) {
            this.collectBank = collectBank;
        }

        public String getRemitmethod() {
            return remitmethod;
        }

        public void setRemitmethod(String remitmethod) {
            this.remitmethod = remitmethod;
        }

        public long getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(long transactionDate) {
            this.transactionDate = transactionDate;
        }

        public long getSorderid() {
            return sorderid;
        }

        public void setSorderid(long sorderid) {
            this.sorderid = sorderid;
        }

        public long getOpportid() {
            return opportid;
        }

        public void setOpportid(long opportid) {
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

        public long getCustid() {
            return custid;
        }

        public void setCustid(long custid) {
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

        public BigDecimal getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(BigDecimal totalprice) {
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

        public long getSignDate() {
            return signDate;
        }

        public void setSignDate(long signDate) {
            this.signDate = signDate;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public long getConfirmDate() {
            return confirmDate;
        }

        public void setConfirmDate(long confirmDate) {
            this.confirmDate = confirmDate;
        }

        public BigDecimal getResidual() {
            return residual;
        }

        public void setResidual(BigDecimal residual) {
            this.residual = residual;
        }

        public BigDecimal getPaymentarrears() {
            return paymentarrears;
        }

        public void setPaymentarrears(BigDecimal paymentarrears) {
            this.paymentarrears = paymentarrears;
        }

    }
}