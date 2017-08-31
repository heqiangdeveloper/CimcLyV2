package com.cimcitech.cimcly.bean.opport_unit;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class OpportUnitReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private OpportUnityBean opportUnity;

    public OpportUnitReq(int pageNum, int pageSize, String orderBy, OpportUnityBean opportUnity) {
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

    public OpportUnityBean getOpportUnity() {
        return opportUnity;
    }

    public void setOpportUnity(OpportUnityBean opportUnity) {
        this.opportUnity = opportUnity;
    }


    public static class OpportUnityBean {

        private int creator;
        private String custName;
        private String currentstage;

        public OpportUnityBean(int creator, String custName, String currentstage) {
            this.creator = creator;
            this.custName = custName;
            this.currentstage = currentstage;
        }

        public int getCreator() {
            return creator;
        }

        public void setCreator(int creator) {
            this.creator = creator;
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
