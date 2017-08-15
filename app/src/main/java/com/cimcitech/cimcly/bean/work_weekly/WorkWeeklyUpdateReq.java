package com.cimcitech.cimcly.bean.work_weekly;

/**
 * Created by apple on 2017/8/11.
 */

public class WorkWeeklyUpdateReq {

    private int repid;
    private String nextworktask;
    private String performance;
    private int modifiedby;

    public WorkWeeklyUpdateReq(int repid, String nextworktask, String performance, int modifiedby) {
        this.repid = repid;
        this.nextworktask = nextworktask;
        this.performance = performance;
        this.modifiedby = modifiedby;
    }

    public int getRepid() {
        return repid;
    }

    public void setRepid(int repid) {
        this.repid = repid;
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

    public int getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(int modifiedby) {
        this.modifiedby = modifiedby;
    }
}
