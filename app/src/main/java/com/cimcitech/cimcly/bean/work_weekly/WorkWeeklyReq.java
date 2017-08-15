package com.cimcitech.cimcly.bean.work_weekly;

/**
 * Created by apple on 2017/8/11.
 */

public class WorkWeeklyReq {

    private int pageNum;
    private int pageSize;
    private WeeklyReport weeklyReport;

    public WorkWeeklyReq(int pageNum, int pageSize, WeeklyReport weeklyReport) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.weeklyReport = weeklyReport;
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

    public WeeklyReport getWeeklyReport() {
        return weeklyReport;
    }

    public void setWeeklyReport(WeeklyReport weeklyReport) {
        this.weeklyReport = weeklyReport;
    }

    public static class WeeklyReport {
        private int userid;
        private int type;

        public WeeklyReport(int userid, int type) {
            this.userid = userid;
            this.type = type;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
