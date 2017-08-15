package com.cimcitech.cimcly.bean.work_weekly;

/**
 * Created by apple on 2017/8/11.
 */

public class WorkWeeklyDetailVo {


    /**
     * data : {"begintime":1502640000000,"createdate":null,"creator":555555764,"creatorName":"张乐","endtime":1502640000000,"modifiedby":null,"nextworktask":"vvvbvvvvv","owner":null,"performance":"bbbh","repid":30,"reportType":"TP02","reportTypeDesc":"日报-晚报","siginInlat":34.591198,"siginInlon":112.409488,"signInAddress":"中集凌宇汽车公司","ts":null,"type":null,"unitid":null,"userName":"张乐","userid":555555764}
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
         * begintime : 1502640000000
         * createdate : null
         * creator : 555555764
         * creatorName : 张乐
         * endtime : 1502640000000
         * modifiedby : null
         * nextworktask : vvvbvvvvv
         * owner : null
         * performance : bbbh
         * repid : 30
         * reportType : TP02
         * reportTypeDesc : 日报-晚报
         * siginInlat : 34.591198
         * siginInlon : 112.409488
         * signInAddress : 中集凌宇汽车公司
         * ts : null
         * type : null
         * unitid : null
         * userName : 张乐
         * userid : 555555764
         */

        private long begintime;
        private Object createdate;
        private int creator;
        private String creatorName;
        private long endtime;
        private Object modifiedby;
        private String nextworktask;
        private Object owner;
        private String performance;
        private int repid;
        private String reportType;
        private String reportTypeDesc;
        private double siginInlat;
        private double siginInlon;
        private String signInAddress;
        private Object ts;
        private Object type;
        private Object unitid;
        private String userName;
        private int userid;

        public long getBegintime() {
            return begintime;
        }

        public void setBegintime(long begintime) {
            this.begintime = begintime;
        }

        public Object getCreatedate() {
            return createdate;
        }

        public void setCreatedate(Object createdate) {
            this.createdate = createdate;
        }

        public int getCreator() {
            return creator;
        }

        public void setCreator(int creator) {
            this.creator = creator;
        }

        public String getCreatorName() {
            return creatorName;
        }

        public void setCreatorName(String creatorName) {
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

        public String getReportType() {
            return reportType;
        }

        public void setReportType(String reportType) {
            this.reportType = reportType;
        }

        public String getReportTypeDesc() {
            return reportTypeDesc;
        }

        public void setReportTypeDesc(String reportTypeDesc) {
            this.reportTypeDesc = reportTypeDesc;
        }

        public double getSiginInlat() {
            return siginInlat;
        }

        public void setSiginInlat(double siginInlat) {
            this.siginInlat = siginInlat;
        }

        public double getSiginInlon() {
            return siginInlon;
        }

        public void setSiginInlon(double siginInlon) {
            this.siginInlon = siginInlon;
        }

        public String getSignInAddress() {
            return signInAddress;
        }

        public void setSignInAddress(String signInAddress) {
            this.signInAddress = signInAddress;
        }

        public Object getTs() {
            return ts;
        }

        public void setTs(Object ts) {
            this.ts = ts;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
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
    }
}
