package com.cimcitech.cimcly.bean.message;

import com.cimcitech.cimcly.activity.message.MessageContent;

/**
 * Created by qianghe on 2018/7/4.
 */

public class ContractMessageBean {
    private String title;
    private String msg;

    private int sOrderId;//订单id
    private String fStatus;//合同审批结果
    private String fState;//合同审批结果id,如“FS05” 通过，“FS06”不通过
    private String contractNo;//合同号

    public String getfState() {
        return fState;
    }

    public void setfState(String fState) {
        this.fState = fState;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getsOrderId() {
        return sOrderId;
    }

    public void setsOrderId(int sOrderId) {
        this.sOrderId = sOrderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
