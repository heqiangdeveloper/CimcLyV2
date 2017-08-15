package com.cimcitech.cimcly.bean.feed_back;

/**
 * Created by apple on 2017/8/14.
 */

public class FeedBackReq {

    private String questiontheme;
    private String questiontype;
    private int userid;
    private String questiondetail;

    public FeedBackReq(String questiontheme, String questiontype, int userid, String questiondetail) {
        this.questiontheme = questiontheme;
        this.questiontype = questiontype;
        this.userid = userid;
        this.questiondetail = questiondetail;
    }

    public String getQuestiontheme() {
        return questiontheme;
    }

    public void setQuestiontheme(String questiontheme) {
        this.questiontheme = questiontheme;
    }

    public String getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getQuestiondetail() {
        return questiondetail;
    }

    public void setQuestiondetail(String questiondetail) {
        this.questiondetail = questiondetail;
    }
}
