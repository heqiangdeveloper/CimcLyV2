package com.cimcitech.cimcly.activity.message;

/**
 * Created by qianghe on 2018/7/4.
 */

public class MessageData {
    private String flag;//标记类型：报价单，合同等
    private int id;
    private int opened;//状态：0未读，1已读
    private String time;
    private MessageContent messageContent;

    public MessageData(String flag, int opened, String time, MessageContent messageContent) {
        this.flag = flag;
        this.opened = opened;
        this.time = time;
        this.messageContent = messageContent;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOpened() {
        return opened;
    }

    public void setOpened(int opened) {
        this.opened = opened;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MessageContent getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(MessageContent messageContent) {
        this.messageContent = messageContent;
    }
}
