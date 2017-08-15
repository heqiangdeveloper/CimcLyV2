package com.cimcitech.cimcly.bean.customer_visit;

import java.io.Serializable;

/**
 * Created by cimcitech on 2017/8/3.
 */

public class CustomerVisitInfoVo implements Serializable{

    private Data data;
    private String msg;
    private boolean success;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public class Data implements Serializable{
        private Long contpersonid;
        private String contpersonname;
        private long createdate;
        private int creator;
        private String custaddress;
        private Long custid;
        private int custmanagerid;
        private String custmanagername;
        private String custname;
        private String customerno;
        private String custphone;
        private int cvid;
        private int modifiedby;
        private double sigininlat;
        private double sigininlon;
        private String signinaddress;
        private long ts;
        private Object unitid;
        private int userid;
        private String visitbegintime;
        private String visitendtime;
        private String visitsummary;

        public Long getContpersonid() {
            return contpersonid;
        }

        public void setContpersonid(Long contpersonid) {
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

        public void setSigininlon(long sigininlon) {
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

        public int getModifiedby() {
            return modifiedby;
        }

        public void setModifiedby(int modifiedby) {
            this.modifiedby = modifiedby;
        }

        public Long getCustid() {
            return custid;
        }

        public void setCustid(Long custid) {
            this.custid = custid;
        }
    }
}
