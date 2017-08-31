package com.cimcitech.cimcly.bean.report;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class AreaOpportUnitReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private AreaOpportUnityBean opportUnity;

    public AreaOpportUnitReq(int pageNum, int pageSize, String orderBy, AreaOpportUnityBean opportUnity) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.opportUnity = opportUnity;
        this.orderBy = orderBy;
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

    public AreaOpportUnityBean getAreaOpportUnityBean() {
        return opportUnity;
    }

    public void setAreaOpportUnityBean(AreaOpportUnityBean opportUnity) {
        this.opportUnity = opportUnity;
    }

    public static class AreaOpportUnityBean {

        private int region;
        private String custName;
        private String currentstage;

        public AreaOpportUnityBean(int region, String custName, String currentstage) {
            this.region = region;
            this.custName = custName;
            this.currentstage = currentstage;
        }

        public int getRegion() {
            return region;
        }

        public void setRegion(int region) {
            this.region = region;
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
