package com.cimcitech.cimcly.bean.payment;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/3.
 */

public class PaymentNameVo {

    private ArrayList<Data> data;
    private String msg;
    private boolean success;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
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

    public class Data {
        private int custid;
        private String custname;
        private BigDecimal totalPrice;
        private BigDecimal residual;

        public int getCustid() {
            return custid;
        }

        public void setCustid(int custid) {
            this.custid = custid;
        }

        public String getCustname() {
            return custname;
        }

        public void setCustname(String custname) {
            this.custname = custname;
        }

        public BigDecimal getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
        }

        public BigDecimal getResidual() {
            return residual;
        }

        public void setResidual(BigDecimal residual) {
            this.residual = residual;
        }
    }


}
