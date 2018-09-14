package com.cimcitech.cimcly.bean.message;

import com.cimcitech.cimcly.activity.message.MessageContent;

/**
 * Created by qianghe on 2018/7/4.
 */

public class QuotedMessageBean {
    private String title;
    private String msg;
    private int quoteid;
    private String quoteStatusValue;//审批结果
    private String quoteStatus;//审批结果id,如“DS3”通过，“DS4”不通过

    public String getQuoteStatus() {
        return quoteStatus;
    }

    public void setQuoteStatus(String quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(int quoteid) {
        this.quoteid = quoteid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuoteStatusValue() {
        return quoteStatusValue;
    }

    public void setQuoteStatusValue(String quoteStatusValue) {
        this.quoteStatusValue = quoteStatusValue;
    }
}
