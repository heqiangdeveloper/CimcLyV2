package com.cimcitech.cimcly.bean.RequestBean;

/**
 * Created by lyw on 2017/7/28.
 */

public class CustomReq {
    public CustomReq(CustomerReqBean customerReq) {
        this.customerReq = customerReq;
    }

    /**
     * customerReq : {"pageNum":1,"pageSize":10,"orderBy":null,"customer":{"owner":null}}
     */


    private CustomerReqBean customerReq;

    public CustomerReqBean getCustomerReq() {
        return customerReq;
    }

    public void setCustomerReq(CustomerReqBean customerReq) {
        this.customerReq = customerReq;
    }

    public static class CustomerReqBean {
        public CustomerReqBean(int pageNum, int pageSize, String orderBy, CustomerBean customer) {
            this.pageNum = pageNum;
            this.pageSize = pageSize;
            this.orderBy = orderBy;
            this.customer = customer;
        }

        /**
         * pageNum : 1
         * pageSize : 10
         * orderBy : null
         * customer : {"owner":null}
         */

        private int pageNum;
        private int pageSize;
        private String orderBy;
        private CustomerBean customer;

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

        public CustomerBean getCustomer() {
            return customer;
        }

        public void setCustomer(CustomerBean customer) {
            this.customer = customer;
        }

        public static class CustomerBean {
            public CustomerBean(String owner) {
                this.owner = owner;
            }

            /**
             * owner : null
             */

            private String owner;

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }
        }
    }
}
