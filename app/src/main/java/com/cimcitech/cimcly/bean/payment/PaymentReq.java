package com.cimcitech.cimcly.bean.payment;

/**
 * Created by lyw on 2017/7/28.
 */

public class PaymentReq {
    private int pageNum;
    private int pageSize;
    private String orderBy;
    private PaymentBean sContOrder;

    public PaymentReq(int pageNum, int pageSize, String orderBy, PaymentBean sContOrder) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.sContOrder = sContOrder;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public PaymentBean getsContOrder() {
        return sContOrder;
    }

    public void setsContOrder(PaymentBean sContOrder) {
        this.sContOrder = sContOrder;
    }


    public static class PaymentBean {
        public PaymentBean(String owner,String custname) {
            this.owner = owner;
            this.custname = custname;
        }

        public String getCustname() {
            return custname;
        }

        public void setCustname(String custname) {
            this.custname = custname;
        }

        /**
         * creator : 2
         */

        private String custname;

        private String owner;

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
}
