package com.cimcitech.cimcly.bean.order_contract;

/**
 * Created by apple on 2017/8/14.
 */

public class OrderContractSaveVo {

    private int sorderid;
    private String count;
    private double deposit;
    private double totalprice;

    public OrderContractSaveVo(int sorderid, String count, double deposit, double totalprice) {
        this.sorderid = sorderid;
        this.count = count;
        this.deposit = deposit;
        this.totalprice = totalprice;
    }

    public int getSorderid() {
        return sorderid;
    }

    public void setSorderid(int sorderid) {
        this.sorderid = sorderid;
    }

    public void setCount(int count) {
        count = count;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
