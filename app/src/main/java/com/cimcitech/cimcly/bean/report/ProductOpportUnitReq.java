package com.cimcitech.cimcly.bean.report;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ProductOpportUnitReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private ProductOpportUnityBean opportUnity;

    public ProductOpportUnitReq(int pageNum, int pageSize, String orderBy, ProductOpportUnityBean
            opportUnity) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.opportUnity = opportUnity;
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

    public ProductOpportUnityBean getOpportUnity() {
        return opportUnity;
    }

    public void setOpportUnity(ProductOpportUnityBean opportUnity) {
        this.opportUnity = opportUnity;
    }

    public static class ProductOpportUnityBean {

        private String productvariety;
        private String custName;
        private String currentstage;

        public ProductOpportUnityBean(String variety, String custName, String currentstage) {
            this.productvariety = variety;
            this.custName = custName;
            this.currentstage = currentstage;
        }

        public String getVariety() {
            return productvariety;
        }

        public void setVariety(String variety) {
            this.productvariety = variety;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getCurrentstage() {
            return currentstage;
        }

        public void setCurrentstage(String currentstage) {
            this.currentstage = currentstage;
        }
    }


}
