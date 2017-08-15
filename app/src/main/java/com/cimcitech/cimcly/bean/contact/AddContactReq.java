package com.cimcitech.cimcly.bean.contact;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class AddContactReq {


    private int userid;//	用户ID 当前用户ID
    private Long custid;//客户id
    private String customerno;//	客户代码
    private String custname;//客户名称
    private String custaddress;//	客户地址
    private String custmanagerid;//	拜访客户id
    private String custmanagername;//拜访人
    private String contpersonid;//客户联系人ID
    //private String createdate;//	创建日期
    //private int creator;//创建人
    private String signinaddress;//	签到地址
    private double sigininlat;//	签到地点纬度
    private double sigininlon;//签到地点经度
    private String visitsummary;//	拜访总结
    //private String custphone;//客户电话
    private String createdate;//创建时间
    private int modifiedby;//	修改人
    private String visitbegintime;//拜访开始时间
    private String visitendtime;//拜访结束时间
    private String custphone;//	客户电话
    private int creator;//	创建人

    public AddContactReq(int userid, Long custid, String customerno, String custname,
                         String custaddress, String custmanagerid,
                         String custmanagername, String contpersonid, String signinaddress,
                         double sigininlat, double sigininlon,
                         String visitsummary, String visitbegintime,
                         String visitendtime, String custphone, int creator) {
        this.userid = userid;
        this.custid = custid;
        this.customerno = customerno;
        this.custname = custname;
        this.custaddress = custaddress;
        this.custmanagerid = custmanagerid;
        this.custmanagername = custmanagername;
        this.contpersonid = contpersonid;
        this.signinaddress = signinaddress;
        this.sigininlat = sigininlat;
        this.sigininlon = sigininlon;
        this.visitsummary = visitsummary;
        this.visitbegintime = visitbegintime;
        this.visitendtime = visitendtime;
        this.custphone = custphone;
        this.creator = creator;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public String getCustmanagerid() {
        return custmanagerid;
    }

    public void setCustmanagerid(String custmanagerid) {
        this.custmanagerid = custmanagerid;
    }

    public String getCustmanagername() {
        return custmanagername;
    }

    public void setCustmanagername(String custmanagername) {
        this.custmanagername = custmanagername;
    }

    public String getContpersonid() {
        return contpersonid;
    }

    public void setContpersonid(String contpersonid) {
        this.contpersonid = contpersonid;
    }

    public String getSigninaddress() {
        return signinaddress;
    }

    public void setSigninaddress(String signinaddress) {
        this.signinaddress = signinaddress;
    }

    public double getSigininlat() {
        return sigininlat;
    }

    public void setSigininlat(double sigininlat) {
        this.sigininlat = sigininlat;
    }

    public double getSigininlon() {
        return sigininlon;
    }

    public void setSigininlon(double sigininlon) {
        this.sigininlon = sigininlon;
    }

    public String getVisitsummary() {
        return visitsummary;
    }

    public void setVisitsummary(String visitsummary) {
        this.visitsummary = visitsummary;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public int getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(int modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getVisitbegintime() {
        return visitbegintime;
    }

    public void setVisitbegintime(String visitbegintime) {
        this.visitbegintime = visitbegintime;
    }

    public String getVisitendtime() {
        return visitendtime;
    }

    public void setVisitendtime(String visitendtime) {
        this.visitendtime = visitendtime;
    }

    public String getCustphone() {
        return custphone;
    }

    public void setCustphone(String custphone) {
        this.custphone = custphone;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }
}
