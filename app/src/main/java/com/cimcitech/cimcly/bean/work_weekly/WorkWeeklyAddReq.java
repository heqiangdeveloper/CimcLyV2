package com.cimcitech.cimcly.bean.work_weekly;

/**
 * Created by apple on 2017/8/11.
 */

public class WorkWeeklyAddReq {

    private String begintime;
    private int creator;
    private String endtime;
    private String nextworktask;
    private String performance;
    private int userid;
    private String reportType;
    private double siginInLat;
    private double siginInLon;
    private String signInAddress;

    public WorkWeeklyAddReq(String begintime, int creator, String endtime, String nextworktask, String performance, int userid, String reportType, double siginInLat, double siginInLon, String signInAddress) {
        this.begintime = begintime;
        this.creator = creator;
        this.endtime = endtime;
        this.nextworktask = nextworktask;
        this.performance = performance;
        this.userid = userid;
        this.reportType = reportType;
        this.siginInLat = siginInLat;
        this.siginInLon = siginInLon;
        this.signInAddress = signInAddress;
    }


    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getNextworktask() {
        return nextworktask;
    }

    public void setNextworktask(String nextworktask) {
        this.nextworktask = nextworktask;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getSignInAddress() {
        return signInAddress;
    }

    public void setSignInAddress(String signInAddress) {
        this.signInAddress = signInAddress;
    }

    public double getSiginInLat() {
        return siginInLat;
    }

    public void setSiginInLat(double siginInLat) {
        this.siginInLat = siginInLat;
    }

    public double getSiginInLon() {
        return siginInLon;
    }

    public void setSiginInLon(double siginInLon) {
        this.siginInLon = siginInLon;
    }
}
