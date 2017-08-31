package com.cimcitech.cimcly.bean;

import java.io.Serializable;

/**
 * Created by lyw on 2017/7/30.
 */

public class VisitCurrinfo implements Serializable {

    /**
     * contpersonid : 4551
     * contpersonname : 周燕萍
     * createdate : 1501312923000
     * creator : 555555928
     * custaddress : 广东茂名市茂名市光华南路文光二街8号805
     * custid : 2752
     * custmanagerid : 4551
     * custmanagername : 周燕萍
     * custname : 茂名市恒佳运输服务有限公司
     * customerno : 116657
     * custphone : 0668-2517606
     * cvid : 10
     * modifiedby : null
     * sigininlat : 31.206388
     * sigininlon : 121.640199
     * signinaddress : 高科幼儿园
     * ts : 1501312932000
     * unitid : null
     * userid : 555555928
     * visitbegintime : 2017-07-29 15:22:03.29
     * visitendtime : 2017-07-29 15:22:03.291
     * visitsummary : 测试，待删除   修改111111111
     */

    private int contpersonid;
    private String contpersonname;
    private long createdate;
    private int creator;
    private String custaddress;
    private int custid;
    private int custmanagerid;
    private String custmanagername;
    private String custname;
    private String customerno;
    private String custphone;
    private int cvid;
    private Object modifiedby;
    private double sigininlat;
    private double sigininlon;
    private String signinaddress;
    private long ts;
    private Object unitid;
    private int userid;
    private String visitbegintime;
    private String visitendtime;
    private String visitsummary;

    public int getContpersonid() {
        return contpersonid;
    }

    public void setContpersonid(int contpersonid) {
        this.contpersonid = contpersonid;
    }

    public String getContpersonname() {
        return contpersonname;
    }

    public void setContpersonname(String contpersonname) {
        this.contpersonname = contpersonname;
    }

    public long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(long createdate) {
        this.createdate = createdate;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
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

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getCustphone() {
        return custphone;
    }

    public void setCustphone(String custphone) {
        this.custphone = custphone;
    }

    public int getCvid() {
        return cvid;
    }

    public void setCvid(int cvid) {
        this.cvid = cvid;
    }

    public Object getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Object modifiedby) {
        this.modifiedby = modifiedby;
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

    public String getSigninaddress() {
        return signinaddress;
    }

    public void setSigninaddress(String signinaddress) {
        this.signinaddress = signinaddress;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public Object getUnitid() {
        return unitid;
    }

    public void setUnitid(Object unitid) {
        this.unitid = unitid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getVisitsummary() {
        return visitsummary;
    }

    public void setVisitsummary(String visitsummary) {
        this.visitsummary = visitsummary;
    }
}
