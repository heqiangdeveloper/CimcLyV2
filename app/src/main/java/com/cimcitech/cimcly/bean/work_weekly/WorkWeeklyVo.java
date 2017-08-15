package com.cimcitech.cimcly.bean.work_weekly;

import java.util.List;

/**
 * Created by apple on 2017/8/11.
 */

public class WorkWeeklyVo {

    /**
     * data : {"endRow":2,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"begintime":1502150400000,"createdate":1502215742000,"creator":-1,"creatorName":null,"endtime":1502496000000,"modifiedby":null,"nextworktask":"古古怪怪广告歌滚滚滚滚滚","owner":null,"performance":"古怪古怪滚滚滚滚滚滚滚","repid":25,"reportType":null,"reportTypeDesc":null,"siginInLat":null,"siginInLon":null,"signInAddress":null,"ts":null,"type":0,"unitid":null,"userName":"张乐","userid":555555764},{"begintime":1502236800000,"createdate":1502215683000,"creator":-1,"creatorName":null,"endtime":1502236800000,"modifiedby":null,"nextworktask":"111111","owner":null,"performance":"1111","repid":24,"reportType":null,"reportTypeDesc":null,"siginInLat":null,"siginInLon":null,"signInAddress":null,"ts":null,"type":0,"unitid":null,"userName":"张乐","userid":555555764}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":8,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":10,"pages":1,"prePage":0,"size":2,"startRow":1,"total":2}
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
         * endRow : 2
         * firstPage : 1
         * hasNextPage : false
         * hasPreviousPage : false
         * isFirstPage : true
         * isLastPage : true
         * lastPage : 1
         * list : [{"begintime":1502150400000,"createdate":1502215742000,"creator":-1,"creatorName":null,"endtime":1502496000000,"modifiedby":null,"nextworktask":"古古怪怪广告歌滚滚滚滚滚","owner":null,"performance":"古怪古怪滚滚滚滚滚滚滚","repid":25,"reportType":null,"reportTypeDesc":null,"siginInLat":null,"siginInLon":null,"signInAddress":null,"ts":null,"type":0,"unitid":null,"userName":"张乐","userid":555555764},{"begintime":1502236800000,"createdate":1502215683000,"creator":-1,"creatorName":null,"endtime":1502236800000,"modifiedby":null,"nextworktask":"111111","owner":null,"performance":"1111","repid":24,"reportType":null,"reportTypeDesc":null,"siginInLat":null,"siginInLon":null,"signInAddress":null,"ts":null,"type":0,"unitid":null,"userName":"张乐","userid":555555764}]
         * navigateFirstPage : 1
         * navigateLastPage : 1
         * navigatePages : 8
         * navigatepageNums : [1]
         * nextPage : 0
         * pageNum : 1
         * pageSize : 10
         * pages : 1
         * prePage : 0
         * size : 2
         * startRow : 1
         * total : 2
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
             * begintime : 1502150400000
             * createdate : 1502215742000
             * creator : -1
             * creatorName : null
             * endtime : 1502496000000
             * modifiedby : null
             * nextworktask : 古古怪怪广告歌滚滚滚滚滚
             * owner : null
             * performance : 古怪古怪滚滚滚滚滚滚滚
             * repid : 25
             * reportType : null
             * reportTypeDesc : null
             * siginInLat : null
             * siginInLon : null
             * signInAddress : null
             * ts : null
             * type : 0
             * unitid : null
             * userName : 张乐
             * userid : 555555764
             */

            private long begintime;
            private long createdate;
            private int creator;
            private Object creatorName;
            private long endtime;
            private Object modifiedby;
            private String nextworktask;
            private Object owner;
            private String performance;
            private int repid;
            private Object reportType;
            private Object reportTypeDesc;
            private long siginInLat;
            private long siginInLon;
            private String signInAddress;
            private Object ts;
            private int type;
            private Object unitid;
            private String userName;
            private int userid;

            public long getBegintime() {
                return begintime;
            }

            public void setBegintime(long begintime) {
                this.begintime = begintime;
            }

            public long getCreatedate() {
                return createdate;
            }

            public void setCreatedate(long createdate) {
                this.createdate = createdate;
            }

            public int getCreator() {
                return creator;
            }

            public void setCreator(int creator) {
                this.creator = creator;
            }

            public Object getCreatorName() {
                return creatorName;
            }

            public void setCreatorName(Object creatorName) {
                this.creatorName = creatorName;
            }

            public long getEndtime() {
                return endtime;
            }

            public void setEndtime(long endtime) {
                this.endtime = endtime;
            }

            public Object getModifiedby() {
                return modifiedby;
            }

            public void setModifiedby(Object modifiedby) {
                this.modifiedby = modifiedby;
            }

            public String getNextworktask() {
                return nextworktask;
            }

            public void setNextworktask(String nextworktask) {
                this.nextworktask = nextworktask;
            }

            public Object getOwner() {
                return owner;
            }

            public void setOwner(Object owner) {
                this.owner = owner;
            }

            public String getPerformance() {
                return performance;
            }

            public void setPerformance(String performance) {
                this.performance = performance;
            }

            public int getRepid() {
                return repid;
            }

            public void setRepid(int repid) {
                this.repid = repid;
            }

            public Object getReportType() {
                return reportType;
            }

            public void setReportType(Object reportType) {
                this.reportType = reportType;
            }

            public Object getReportTypeDesc() {
                return reportTypeDesc;
            }

            public void setReportTypeDesc(Object reportTypeDesc) {
                this.reportTypeDesc = reportTypeDesc;
            }

            public Object getTs() {
                return ts;
            }

            public void setTs(Object ts) {
                this.ts = ts;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public Object getUnitid() {
                return unitid;
            }

            public void setUnitid(Object unitid) {
                this.unitid = unitid;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public int getUserid() {
                return userid;
            }

            public void setUserid(int userid) {
                this.userid = userid;
            }

            public long getSiginInLat() {
                return siginInLat;
            }

            public void setSiginInLat(long siginInLat) {
                this.siginInLat = siginInLat;
            }

            public long getSiginInLon() {
                return siginInLon;
            }

            public void setSiginInLon(long siginInLon) {
                this.siginInLon = siginInLon;
            }

            public String getSignInAddress() {
                return signInAddress;
            }

            public void setSignInAddress(String signInAddress) {
                this.signInAddress = signInAddress;
            }
        }
    }
}
