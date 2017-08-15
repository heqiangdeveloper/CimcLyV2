package com.cimcitech.cimcly.bean.order_contract;

/**
 * Created by apple on 2017/8/11.
 */

public class OrderContractReq {


    private int pageNum;
    private int pageSize;
    private SContOrder sContOrder;

    public OrderContractReq(int pageNum, int pageSize, SContOrder sContOrder) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
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

    public SContOrder getsContOrder() {
        return sContOrder;
    }

    public void setsContOrder(SContOrder sContOrder) {
        this.sContOrder = sContOrder;
    }


    public static class SContOrder {
        private int owner;
        private String custName;
        private String fstate;

        public SContOrder(int owner, String custName, String fstate) {
            this.owner = owner;
            this.custName = custName;
            this.fstate = fstate;
        }

        public int getOwner() {
            return owner;
        }

        public void setOwner(int owner) {
            this.owner = owner;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getFstate() {
            return fstate;
        }

        public void setFstate(String fstate) {
            this.fstate = fstate;
        }
    }


}
