package com.cimcitech.cimcly.bean.customer_visit;

/**
 * Created by cimcitech on 2017/8/3.
 */

public class UpdateCustomerVisitInfoReq {

    private int cvid;
    private int userid;
    private Long custid;
    private String customerno;
    private String custname;
    private String custaddress;
    private int custmanagerid;
    private String custmanagername;
    private Long contpersonid;
    private String signinaddress;
    private double sigininlat;
    private double sigininlon;
    private String visitsummary;
    private String custphone;
    private int modifiedby;
    private int creator;
    private String visitbegintime;
    private String visitendtime;

    public UpdateCustomerVisitInfoReq(int cvid, int userid, Long custid, String customerno, String custname, String custaddress, int custmanagerid, String custmanagername, Long contpersonid, String signinaddress, double sigininlat, double sigininlon, String visitsummary, String custphone, int modifiedby, int creator, String visitbegintime, String visitendtime) {
        this.cvid = cvid;
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
        this.custphone = custphone;
        this.modifiedby = modifiedby;
        this.creator = creator;
        this.visitbegintime = visitbegintime;
        this.visitendtime = visitendtime;
    }

    public int getCvid() {
        return cvid;
    }

    public void setCvid(int cvid) {
        this.cvid = cvid;
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

    public int getCustmanagerid() {
        return custmanagerid;
    }

    public void setCustmanagerid(int custmanagerid) {
        this.custmanagerid = custmanagerid;
    }

    public String getCustmanagername() {
        return custmanagername;
    }

    public void setCustmanagername(String custmanagername) {
        this.custmanagername = custmanagername;
    }

    public Long getContpersonid() {
        return contpersonid;
    }

    public void setContpersonid(Long contpersonid) {
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

    public String getCustphone() {
        return custphone;
    }

    public void setCustphone(String custphone) {
        this.custphone = custphone;
    }

    public int getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(int modifiedby) {
        this.modifiedby = modifiedby;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
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

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }
}
