package com.cimcitech.cimcly.bean.car_in_storage;

/**
 * Created by lyw on 2017/7/28.
 */

public class WaitInStorageReq {
    private int pageNum;
    private int pageSize;
    private String orderBy;
    private WaitInStorageReqBean prodOrderDet;

    public WaitInStorageReq(int pageNum, int pageSize, String orderBy, WaitInStorageReqBean sContOrder) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.prodOrderDet = sContOrder;
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

    public WaitInStorageReqBean getProdOrderDet() {
        return prodOrderDet;
    }

    public void setProdOrderDet(WaitInStorageReqBean prodOrderDet) {
        this.prodOrderDet = prodOrderDet;
    }

    public static class WaitInStorageReqBean {
        private String createpeople;
        private String custName;
        public WaitInStorageReqBean(String createpeople, String custName) {
            this.custName = custName;
            this.createpeople = createpeople;
        }

        public String getCreatepeople() {
            return createpeople;
        }

        public void setCreatepeople(String createpeople) {
            this.createpeople = createpeople;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }
    }
}
