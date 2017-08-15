package com.cimcitech.cimcly.bean.client;

/**
 * Created by lyw on 2017/7/28.
 */

public class MyClientReq {
    private int pageNum;
    private int pageSize;
    private String orderBy;
    private CustomerVisitBean customer;

    public MyClientReq(int pageNum, int pageSize, String orderBy, CustomerVisitBean customer) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.customer = customer;
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

    public CustomerVisitBean getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVisitBean customer) {
        this.customer = customer;
    }


    public static class CustomerVisitBean {
        public CustomerVisitBean(String owner, String custname) {
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
