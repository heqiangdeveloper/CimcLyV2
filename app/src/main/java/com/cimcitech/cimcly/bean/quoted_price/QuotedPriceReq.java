package com.cimcitech.cimcly.bean.quoted_price;

/**
 * Created by cimcitech on 2017/8/7.
 */

public class QuotedPriceReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private QuotedPriceBean quoteBase;

    public QuotedPriceReq(int pageNum, int pageSize, String orderBy, QuotedPriceBean quoteBase) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.quoteBase = quoteBase;
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

    public QuotedPriceBean getQuoteBase() {
        return quoteBase;
    }

    public void setQuoteBase(QuotedPriceBean quoteBase) {
        this.quoteBase = quoteBase;
    }

    public static class QuotedPriceBean {

        private int creater;
        private String custName;
        private String quotestatus;

        public QuotedPriceBean(int creater, String custName, String quotestatus) {
            this.creater = creater;
            this.custName = custName;
            this.quotestatus = quotestatus;
        }

        public int getCreater() {
            return creater;
        }

        public void setCreater(int creater) {
            this.creater = creater;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getQuotestatus() {
            return quotestatus;
        }

        public void setQuotestatus(String quotestatus) {
            this.quotestatus = quotestatus;
        }
    }
}
