package com.cimcitech.cimcly.bean.RequestBean;

/**
 * Created by lyw on 2017/7/30.
 */

public class RuquMyVisit {


    /**
     * pageNum : 1
     * pageSize : 10
     * orderBy :
     * customerVisit : {"creator":"2"}
     */

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private CustomerVisitBean customerVisit;

    public RuquMyVisit(int pageNum, int pageSize, String orderBy, CustomerVisitBean customerVisit) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.customerVisit = customerVisit;
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

    public CustomerVisitBean getCustomerVisit() {
        return customerVisit;
    }

    public void setCustomerVisit(CustomerVisitBean customerVisit) {
        this.customerVisit = customerVisit;
    }

    public static class CustomerVisitBean {
        public CustomerVisitBean(int creator) {
            this.creator = creator;
        }

        /**
         * creator : 2
         */

        private int creator;

        private String custname;

        public CustomerVisitBean(String custname) {
            this.custname = custname;
        }

        public CustomerVisitBean(int creator, String custname) {
            this.creator = creator;
            this.custname = custname;
        }

        public int getOwner() {
            return creator;
        }

        public void setOwner(int creator) {
            this.creator = creator;
        }

        public int getCreator() {
            return creator;
        }

        public void setCreator(int creator) {
            this.creator = creator;
        }

        public String getCustname() {
            return custname;
        }

        public void setCustname(String custname) {
            this.custname = custname;
        }
    }
}
