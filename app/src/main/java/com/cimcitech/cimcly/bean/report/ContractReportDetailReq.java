package com.cimcitech.cimcly.bean.report;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ContractReportDetailReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private ContOrderBean sContOrder;

    public ContractReportDetailReq(int pageNum, int pageSize, String orderBy, ContOrderBean sContOrder) {
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

    public ContOrderBean getsContOrder() {
        return sContOrder;
    }

    public void setsContOrder(ContOrderBean sContOrder) {
        this.sContOrder = sContOrder;
    }

    public static class ContOrderBean {
        private String year;
        private String region;
        private String productvariety;
        private String custId;
        private String province;
        private String custName;
        private String fstate;

        public ContOrderBean(String year, String region, String productvariety, String custId, String province, String custName, String fstate) {
            this.year = year;
            this.region = region;
            this.productvariety = productvariety;
            this.custId = custId;
            this.province = province;
            this.custName = custName;
            this.fstate = fstate;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getProductvariety() {
            return productvariety;
        }

        public void setProductvariety(String productvariety) {
            this.productvariety = productvariety;
        }

        public String getCustId() {
            return custId;
        }

        public void setCustId(String custId) {
            this.custId = custId;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
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
