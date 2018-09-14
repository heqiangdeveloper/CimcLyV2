package com.cimcitech.cimcly.bean.production;

/**
 * Created by lyw on 2017/7/28.
 */

public class ProductionReq {
    private int pageNum;
    private int pageSize;
    private String orderBy;
    private ProductionBean prodOrderDet;

    public ProductionReq(int pageNum, int pageSize, String orderBy, ProductionBean sContOrder) {
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

    public ProductionBean getsContOrder() {
        return prodOrderDet;
    }

    public void setsContOrder(ProductionBean sContOrder) {
        this.prodOrderDet = sContOrder;
    }


    public static class ProductionBean {
        private String createpeople;
        private String sorderno;
        public ProductionBean(String createpeople, String sorderno) {
            this.sorderno = sorderno;
            this.createpeople = createpeople;
        }

        public String getCreatepeople() {
            return createpeople;
        }

        public void setCreatepeople(String createpeople) {
            this.createpeople = createpeople;
        }

        public String getSorderno() {
            return sorderno;
        }

        public void setSorderno(String sorderno) {
            this.sorderno = sorderno;
        }
    }
}
