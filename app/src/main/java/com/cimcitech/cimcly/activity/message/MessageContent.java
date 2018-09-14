package com.cimcitech.cimcly.activity.message;

/**
 * Created by qianghe on 2018/7/4.
 */

public class MessageContent {
    private String title;
    private String msg;//消息提示的内容

    private int sOrderId;//订单id
    private String fStatus;//合同审批结果
    private String fState;//合同审批结果id,如“FS05” 通过，“FS06”不通过
    private String contractNo;//合同号

    private int quoteid;//报价单id
    private String quoteStatusValue;//审批结果
    private String quoteStatus;//审批结果id,如“DS3”通过，“DS4”不通过

    //适用于报价单的构造器
    public MessageContent(String title, String msg, int quoteid, String quoteStatusValue, String quoteStatus) {
        this.title = title;
        this.msg = msg;
        this.quoteid = quoteid;
        this.quoteStatusValue = quoteStatusValue;
        this.quoteStatus = quoteStatus;
    }

    //适用于订单合同的构造器
    public MessageContent(String title, String msg, int sOrderId, String fStatus,String fState, String contractNo) {
        this.title = title;
        this.msg = msg;
        this.sOrderId = sOrderId;
        this.fStatus = fStatus;
        this.contractNo = contractNo;
        this.fState = fState;
    }

    //全局构造器

    public MessageContent(String title, String msg, int sOrderId, String fStatus, String fState,
                          String contractNo, int quoteid, String quoteStatusValue, String quoteStatus) {
        this.title = title;
        this.msg = msg;
        this.sOrderId = sOrderId;
        this.fStatus = fStatus;
        this.fState = fState;
        this.contractNo = contractNo;
        this.quoteid = quoteid;
        this.quoteStatusValue = quoteStatusValue;
        this.quoteStatus = quoteStatus;
    }

    public String getfState() {
        return fState;
    }

    public void setfState(String fState) {
        this.fState = fState;
    }

    public String getQuoteStatus() {
        return quoteStatus;
    }

    public void setQuoteStatus(String quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public int getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(int quoteid) {
        this.quoteid = quoteid;
    }

    public String getQuoteStatusValue() {
        return quoteStatusValue;
    }

    public void setQuoteStatusValue(String quoteStatusValue) {
        this.quoteStatusValue = quoteStatusValue;
    }

    public String getfStatus() {
        return fStatus;
    }

    public void setfStatus(String fStatus) {
        this.fStatus = fStatus;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getsOrderId() {
        return sOrderId;
    }

    public void setsOrderId(int sOrderId) {
        this.sOrderId = sOrderId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
