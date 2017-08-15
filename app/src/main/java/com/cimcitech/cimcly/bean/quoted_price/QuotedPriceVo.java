package com.cimcitech.cimcly.bean.quoted_price;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/7.
 */

public class QuotedPriceVo {
    /**
     * data : {"orderAmountTotal":0,"orderCount":0,"pageInfo":{"endRow":6,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-30 09:58:07","creater":null,"creatorName":null,"custName":"赵亚栋0410","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000102","opportSubject":"是非得失","planMoney":4600000,"priceVersion":null,"productCount":2,"protocolprice":"234500","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":504,"quoteopport":"501","quoteprice":"2900125","quotestandprice":"2900000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-28 10:56:38","creater":null,"creatorName":null,"custName":"赵亚栋","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000097","opportSubject":"test00000","planMoney":1000000,"priceVersion":null,"productCount":2,"protocolprice":"210000","quoteCarType":"CLY9401GRYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":503,"quoteopport":"496","quoteprice":"200130","quotestandprice":"200000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-12 17:10:13","creater":null,"creatorName":null,"custName":"凌宇测试","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000082","opportSubject":"购买液罐车","planMoney":600000,"priceVersion":null,"productCount":3,"protocolprice":"300000","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":502,"quoteopport":"481","quoteprice":"209300.0","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:27:22","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"123456","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":501,"quoteopport":"426","quoteprice":"214200","quotestandprice":"198000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:08:28","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":500,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:05:43","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":499,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":8,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":10,"pages":1,"prePage":0,"size":6,"startRow":1,"total":6},"quoteAmountTotal":0,"quoteCount":0}
     * msg :
     * success : true
     */

    private DataBean data;
    private String msg;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * orderAmountTotal : 0
         * orderCount : 0
         * pageInfo : {"endRow":6,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-30 09:58:07","creater":null,"creatorName":null,"custName":"赵亚栋0410","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000102","opportSubject":"是非得失","planMoney":4600000,"priceVersion":null,"productCount":2,"protocolprice":"234500","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":504,"quoteopport":"501","quoteprice":"2900125","quotestandprice":"2900000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-28 10:56:38","creater":null,"creatorName":null,"custName":"赵亚栋","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000097","opportSubject":"test00000","planMoney":1000000,"priceVersion":null,"productCount":2,"protocolprice":"210000","quoteCarType":"CLY9401GRYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":503,"quoteopport":"496","quoteprice":"200130","quotestandprice":"200000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-12 17:10:13","creater":null,"creatorName":null,"custName":"凌宇测试","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000082","opportSubject":"购买液罐车","planMoney":600000,"priceVersion":null,"productCount":3,"protocolprice":"300000","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":502,"quoteopport":"481","quoteprice":"209300.0","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:27:22","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"123456","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":501,"quoteopport":"426","quoteprice":"214200","quotestandprice":"198000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:08:28","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":500,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:05:43","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":499,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":8,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":10,"pages":1,"prePage":0,"size":6,"startRow":1,"total":6}
         * quoteAmountTotal : 0
         * quoteCount : 0
         */

        private int orderAmountTotal;
        private int orderCount;
        private PageInfoBean pageInfo;
        private int quoteAmountTotal;
        private int quoteCount;

        public int getOrderAmountTotal() {
            return orderAmountTotal;
        }

        public void setOrderAmountTotal(int orderAmountTotal) {
            this.orderAmountTotal = orderAmountTotal;
        }

        public int getOrderCount() {
            return orderCount;
        }

        public void setOrderCount(int orderCount) {
            this.orderCount = orderCount;
        }

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public int getQuoteAmountTotal() {
            return quoteAmountTotal;
        }

        public void setQuoteAmountTotal(int quoteAmountTotal) {
            this.quoteAmountTotal = quoteAmountTotal;
        }

        public int getQuoteCount() {
            return quoteCount;
        }

        public void setQuoteCount(int quoteCount) {
            this.quoteCount = quoteCount;
        }

        public static class PageInfoBean {
            /**
             * endRow : 6
             * firstPage : 1
             * hasNextPage : false
             * hasPreviousPage : false
             * isFirstPage : true
             * isLastPage : true
             * lastPage : 1
             * list : [{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-30 09:58:07","creater":null,"creatorName":null,"custName":"赵亚栋0410","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000102","opportSubject":"是非得失","planMoney":4600000,"priceVersion":null,"productCount":2,"protocolprice":"234500","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":504,"quoteopport":"501","quoteprice":"2900125","quotestandprice":"2900000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-28 10:56:38","creater":null,"creatorName":null,"custName":"赵亚栋","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000097","opportSubject":"test00000","planMoney":1000000,"priceVersion":null,"productCount":2,"protocolprice":"210000","quoteCarType":"CLY9401GRYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":503,"quoteopport":"496","quoteprice":"200130","quotestandprice":"200000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-07-12 17:10:13","creater":null,"creatorName":null,"custName":"凌宇测试","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000082","opportSubject":"购买液罐车","planMoney":600000,"priceVersion":null,"productCount":3,"protocolprice":"300000","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":502,"quoteopport":"481","quoteprice":"209300.0","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:27:22","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"123456","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"已提交","quoteid":501,"quoteopport":"426","quoteprice":"214200","quotestandprice":"198000.00","quotestatus":"DS2","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:08:28","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":500,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null},{"baseversion":null,"chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 11:05:43","creater":null,"creatorName":null,"custName":"赵亚栋0406","deposit":null,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":null,"issendmail":null,"isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":"17-000028","opportSubject":"第四次购买液罐车","planMoney":600000,"priceVersion":null,"productCount":4,"protocolprice":"43435","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":"未提交","quoteid":499,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":null,"version":null,"viewLabelList":null}]
             * navigateFirstPage : 1
             * navigateLastPage : 1
             * navigatePages : 8
             * navigatepageNums : [1]
             * nextPage : 0
             * pageNum : 1
             * pageSize : 10
             * pages : 1
             * prePage : 0
             * size : 6
             * startRow : 1
             * total : 6
             */

            private int endRow;
            private int firstPage;
            private boolean hasNextPage;
            private boolean hasPreviousPage;
            private boolean isFirstPage;
            private boolean isLastPage;
            private int lastPage;
            private int navigateFirstPage;
            private int navigateLastPage;
            private int navigatePages;
            private int nextPage;
            private int pageNum;
            private int pageSize;
            private int pages;
            private int prePage;
            private int size;
            private int startRow;
            private int total;
            private List<ListBean> list;
            private List<Integer> navigatepageNums;

            public int getEndRow() {
                return endRow;
            }

            public void setEndRow(int endRow) {
                this.endRow = endRow;
            }

            public int getFirstPage() {
                return firstPage;
            }

            public void setFirstPage(int firstPage) {
                this.firstPage = firstPage;
            }

            public boolean isHasNextPage() {
                return hasNextPage;
            }

            public void setHasNextPage(boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
            }

            public boolean isHasPreviousPage() {
                return hasPreviousPage;
            }

            public void setHasPreviousPage(boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
            }

            public boolean isIsFirstPage() {
                return isFirstPage;
            }

            public void setIsFirstPage(boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
            }

            public boolean isIsLastPage() {
                return isLastPage;
            }

            public void setIsLastPage(boolean isLastPage) {
                this.isLastPage = isLastPage;
            }

            public int getLastPage() {
                return lastPage;
            }

            public void setLastPage(int lastPage) {
                this.lastPage = lastPage;
            }

            public int getNavigateFirstPage() {
                return navigateFirstPage;
            }

            public void setNavigateFirstPage(int navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
            }

            public int getNavigateLastPage() {
                return navigateLastPage;
            }

            public void setNavigateLastPage(int navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
            }

            public int getNavigatePages() {
                return navigatePages;
            }

            public void setNavigatePages(int navigatePages) {
                this.navigatePages = navigatePages;
            }

            public int getNextPage() {
                return nextPage;
            }

            public void setNextPage(int nextPage) {
                this.nextPage = nextPage;
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

            public int getPages() {
                return pages;
            }

            public void setPages(int pages) {
                this.pages = pages;
            }

            public int getPrePage() {
                return prePage;
            }

            public void setPrePage(int prePage) {
                this.prePage = prePage;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getStartRow() {
                return startRow;
            }

            public void setStartRow(int startRow) {
                this.startRow = startRow;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public List<Integer> getNavigatepageNums() {
                return navigatepageNums;
            }

            public void setNavigatepageNums(List<Integer> navigatepageNums) {
                this.navigatepageNums = navigatepageNums;
            }

            public static class ListBean {
                /**
                 * baseversion : null
                 * chassismodel : null
                 * confirmdate : null
                 * createdate : 2017-07-30 09:58:07
                 * creater : null
                 * creatorName : null
                 * custName : 赵亚栋0410
                 * deposit : null
                 * divison : null
                 * doctype : null
                 * dpprice : null
                 * forecastdate : null
                 * isbringchassis : null
                 * issendmail : null
                 * isspecial : null
                 * mmdate : null
                 * oalcurl : null
                 * opportNo : 17-000102
                 * opportSubject : 是非得失
                 * planMoney : 4600000
                 * priceVersion : null
                 * productCount : 2
                 * protocolprice : 234500
                 * quoteCarType : CLY9405GYYA
                 * quoteDetailList : null
                 * quoteStatusValue : 已提交
                 * quoteid : 504
                 * quoteopport : 501
                 * quoteprice : 2900125
                 * quotestandprice : 2900000.00
                 * quotestatus : DS2
                 * saleArea : null
                 * singleprice : null
                 * specialmm : null
                 * status : T
                 * technote : null
                 * unitid : null
                 * version : null
                 * viewLabelList : null
                 */

                private Object baseversion;
                private Object chassismodel;
                private Object confirmdate;
                private String createdate;
                private Object creater;
                private Object creatorName;
                private String custName;
                private Object deposit;
                private Object divison;
                private Object doctype;
                private Object dpprice;
                private Object forecastdate;
                private Object isbringchassis;
                private Object issendmail;
                private Object isspecial;
                private Object mmdate;
                private Object oalcurl;
                private String opportNo;
                private String opportSubject;
                private int planMoney;
                private Object priceVersion;
                private int productCount;
                private String protocolprice;
                private String quoteCarType;
                private Object quoteDetailList;
                private String quoteStatusValue;
                private int quoteid;
                private String quoteopport;
                private String quoteprice;
                private String quotestandprice;
                private String quotestatus;
                private Object saleArea;
                private Object singleprice;
                private Object specialmm;
                private String status;
                private Object technote;
                private Object unitid;
                private Object version;
                private Object viewLabelList;

                public Object getBaseversion() {
                    return baseversion;
                }

                public void setBaseversion(Object baseversion) {
                    this.baseversion = baseversion;
                }

                public Object getChassismodel() {
                    return chassismodel;
                }

                public void setChassismodel(Object chassismodel) {
                    this.chassismodel = chassismodel;
                }

                public Object getConfirmdate() {
                    return confirmdate;
                }

                public void setConfirmdate(Object confirmdate) {
                    this.confirmdate = confirmdate;
                }

                public String getCreatedate() {
                    return createdate;
                }

                public void setCreatedate(String createdate) {
                    this.createdate = createdate;
                }

                public Object getCreater() {
                    return creater;
                }

                public void setCreater(Object creater) {
                    this.creater = creater;
                }

                public Object getCreatorName() {
                    return creatorName;
                }

                public void setCreatorName(Object creatorName) {
                    this.creatorName = creatorName;
                }

                public String getCustName() {
                    return custName;
                }

                public void setCustName(String custName) {
                    this.custName = custName;
                }

                public Object getDeposit() {
                    return deposit;
                }

                public void setDeposit(Object deposit) {
                    this.deposit = deposit;
                }

                public Object getDivison() {
                    return divison;
                }

                public void setDivison(Object divison) {
                    this.divison = divison;
                }

                public Object getDoctype() {
                    return doctype;
                }

                public void setDoctype(Object doctype) {
                    this.doctype = doctype;
                }

                public Object getDpprice() {
                    return dpprice;
                }

                public void setDpprice(Object dpprice) {
                    this.dpprice = dpprice;
                }

                public Object getForecastdate() {
                    return forecastdate;
                }

                public void setForecastdate(Object forecastdate) {
                    this.forecastdate = forecastdate;
                }

                public Object getIsbringchassis() {
                    return isbringchassis;
                }

                public void setIsbringchassis(Object isbringchassis) {
                    this.isbringchassis = isbringchassis;
                }

                public Object getIssendmail() {
                    return issendmail;
                }

                public void setIssendmail(Object issendmail) {
                    this.issendmail = issendmail;
                }

                public Object getIsspecial() {
                    return isspecial;
                }

                public void setIsspecial(Object isspecial) {
                    this.isspecial = isspecial;
                }

                public Object getMmdate() {
                    return mmdate;
                }

                public void setMmdate(Object mmdate) {
                    this.mmdate = mmdate;
                }

                public Object getOalcurl() {
                    return oalcurl;
                }

                public void setOalcurl(Object oalcurl) {
                    this.oalcurl = oalcurl;
                }

                public String getOpportNo() {
                    return opportNo;
                }

                public void setOpportNo(String opportNo) {
                    this.opportNo = opportNo;
                }

                public String getOpportSubject() {
                    return opportSubject;
                }

                public void setOpportSubject(String opportSubject) {
                    this.opportSubject = opportSubject;
                }

                public int getPlanMoney() {
                    return planMoney;
                }

                public void setPlanMoney(int planMoney) {
                    this.planMoney = planMoney;
                }

                public Object getPriceVersion() {
                    return priceVersion;
                }

                public void setPriceVersion(Object priceVersion) {
                    this.priceVersion = priceVersion;
                }

                public int getProductCount() {
                    return productCount;
                }

                public void setProductCount(int productCount) {
                    this.productCount = productCount;
                }

                public String getProtocolprice() {
                    return protocolprice;
                }

                public void setProtocolprice(String protocolprice) {
                    this.protocolprice = protocolprice;
                }

                public String getQuoteCarType() {
                    return quoteCarType;
                }

                public void setQuoteCarType(String quoteCarType) {
                    this.quoteCarType = quoteCarType;
                }

                public Object getQuoteDetailList() {
                    return quoteDetailList;
                }

                public void setQuoteDetailList(Object quoteDetailList) {
                    this.quoteDetailList = quoteDetailList;
                }

                public String getQuoteStatusValue() {
                    return quoteStatusValue;
                }

                public void setQuoteStatusValue(String quoteStatusValue) {
                    this.quoteStatusValue = quoteStatusValue;
                }

                public int getQuoteid() {
                    return quoteid;
                }

                public void setQuoteid(int quoteid) {
                    this.quoteid = quoteid;
                }

                public String getQuoteopport() {
                    return quoteopport;
                }

                public void setQuoteopport(String quoteopport) {
                    this.quoteopport = quoteopport;
                }

                public String getQuoteprice() {
                    return quoteprice;
                }

                public void setQuoteprice(String quoteprice) {
                    this.quoteprice = quoteprice;
                }

                public String getQuotestandprice() {
                    return quotestandprice;
                }

                public void setQuotestandprice(String quotestandprice) {
                    this.quotestandprice = quotestandprice;
                }

                public String getQuotestatus() {
                    return quotestatus;
                }

                public void setQuotestatus(String quotestatus) {
                    this.quotestatus = quotestatus;
                }

                public Object getSaleArea() {
                    return saleArea;
                }

                public void setSaleArea(Object saleArea) {
                    this.saleArea = saleArea;
                }

                public Object getSingleprice() {
                    return singleprice;
                }

                public void setSingleprice(Object singleprice) {
                    this.singleprice = singleprice;
                }

                public Object getSpecialmm() {
                    return specialmm;
                }

                public void setSpecialmm(Object specialmm) {
                    this.specialmm = specialmm;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public Object getTechnote() {
                    return technote;
                }

                public void setTechnote(Object technote) {
                    this.technote = technote;
                }

                public Object getUnitid() {
                    return unitid;
                }

                public void setUnitid(Object unitid) {
                    this.unitid = unitid;
                }

                public Object getVersion() {
                    return version;
                }

                public void setVersion(Object version) {
                    this.version = version;
                }

                public Object getViewLabelList() {
                    return viewLabelList;
                }

                public void setViewLabelList(Object viewLabelList) {
                    this.viewLabelList = viewLabelList;
                }
            }
        }
    }
}
