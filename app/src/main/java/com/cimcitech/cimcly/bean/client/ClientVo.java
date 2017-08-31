package com.cimcitech.cimcly.bean.client;

import java.io.Serializable;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class ClientVo implements Serializable{

    private Data data;
    private String msg;
    private boolean success;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data implements Serializable{
        private String area;
        private String areaid;
        private String city;
        private String companyid;
        private String contact;
        private String contacter;
        private String contacterid;
        private String contractnum;
        private String country;
        private String createauthor;
        private long createdate;
        private String createreport;
        private String createtime;
        private long creator;
        private String creditdegree;
        private String custaddress;
        private Long custid;
        private String custname;
        private String custnumber;
        private String customerno;
        private String custstatus;
        private String custtel;
        private String custtype;
        private String custtypename;
        private String deptno;
        private String dutyregno;
        private String email;
        private String employeelevel;
        private String fax;
        private String fst;
        private String hotdegree;
        private String hotexplain;
        private String hottype;
        private String industry;
        private String isactive;
        private String iscredit;
        private String ishot;
        private String juridicalperson;
        private String ktokd;
        private String labelcategory;
        private String makeup;
        private int modifyby;
        private String opportcount;
        private String opportnum;
        private String orgcode;
        private String orgid;
        private String origin;
        private long owner;
        private String ownerid;
        private String ownername;
        private String pactcount;
        private String paymentunit;
        private String pltyp;
        private String province;
        private String region;
        private String regionname;
        private String relationlevel;
        private String saleparty;
        private String shipparty;
        private String shortname;
        private String sitecode;
        private String spart;
        private String subjects;
        private String summary;
        private String transportmethod;
        private long ts;
        private String unitid;
        private String valueassessment;
        private String vkbur;
        private String web;
        private String yearincome;
        private String yearnum;
        private String zipcode;

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAreaid() {
            return areaid;
        }

        public void setAreaid(String areaid) {
            this.areaid = areaid;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCompanyid() {
            return companyid;
        }

        public void setCompanyid(String companyid) {
            this.companyid = companyid;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getContacter() {
            return contacter;
        }

        public void setContacter(String contacter) {
            this.contacter = contacter;
        }

        public String getContacterid() {
            return contacterid;
        }

        public void setContacterid(String contacterid) {
            this.contacterid = contacterid;
        }

        public String getContractnum() {
            return contractnum;
        }

        public void setContractnum(String contractnum) {
            this.contractnum = contractnum;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCreateauthor() {
            return createauthor;
        }

        public void setCreateauthor(String createauthor) {
            this.createauthor = createauthor;
        }

        public long getCreatedate() {
            return createdate;
        }

        public void setCreatedate(long createdate) {
            this.createdate = createdate;
        }

        public String getCreatereport() {
            return createreport;
        }

        public void setCreatereport(String createreport) {
            this.createreport = createreport;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public long getCreator() {
            return creator;
        }

        public void setCreator(long creator) {
            this.creator = creator;
        }

        public String getCreditdegree() {
            return creditdegree;
        }

        public void setCreditdegree(String creditdegree) {
            this.creditdegree = creditdegree;
        }

        public String getCustaddress() {
            return custaddress;
        }

        public void setCustaddress(String custaddress) {
            this.custaddress = custaddress;
        }

        public Long getCustid() {
            return custid;
        }

        public void setCustid(Long custid) {
            this.custid = custid;
        }

        public String getCustname() {
            return custname;
        }

        public void setCustname(String custname) {
            this.custname = custname;
        }

        public String getCustnumber() {
            return custnumber;
        }

        public void setCustnumber(String custnumber) {
            this.custnumber = custnumber;
        }

        public String getCustomerno() {
            return customerno;
        }

        public void setCustomerno(String customerno) {
            this.customerno = customerno;
        }

        public String getCuststatus() {
            return custstatus;
        }

        public void setCuststatus(String custstatus) {
            this.custstatus = custstatus;
        }

        public String getCusttel() {
            return custtel;
        }

        public void setCusttel(String custtel) {
            this.custtel = custtel;
        }

        public String getCusttype() {
            return custtype;
        }

        public void setCusttype(String custtype) {
            this.custtype = custtype;
        }

        public String getCusttypename() {
            return custtypename;
        }

        public void setCusttypename(String custtypename) {
            this.custtypename = custtypename;
        }

        public String getDeptno() {
            return deptno;
        }

        public void setDeptno(String deptno) {
            this.deptno = deptno;
        }

        public String getDutyregno() {
            return dutyregno;
        }

        public void setDutyregno(String dutyregno) {
            this.dutyregno = dutyregno;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmployeelevel() {
            return employeelevel;
        }

        public void setEmployeelevel(String employeelevel) {
            this.employeelevel = employeelevel;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getFst() {
            return fst;
        }

        public void setFst(String fst) {
            this.fst = fst;
        }

        public String getHotdegree() {
            return hotdegree;
        }

        public void setHotdegree(String hotdegree) {
            this.hotdegree = hotdegree;
        }

        public String getHotexplain() {
            return hotexplain;
        }

        public void setHotexplain(String hotexplain) {
            this.hotexplain = hotexplain;
        }

        public String getHottype() {
            return hottype;
        }

        public void setHottype(String hottype) {
            this.hottype = hottype;
        }

        public String getIndustry() {
            return industry;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public String getIsactive() {
            return isactive;
        }

        public void setIsactive(String isactive) {
            this.isactive = isactive;
        }

        public String getIscredit() {
            return iscredit;
        }

        public void setIscredit(String iscredit) {
            this.iscredit = iscredit;
        }

        public String getIshot() {
            return ishot;
        }

        public void setIshot(String ishot) {
            this.ishot = ishot;
        }

        public String getJuridicalperson() {
            return juridicalperson;
        }

        public void setJuridicalperson(String juridicalperson) {
            this.juridicalperson = juridicalperson;
        }

        public String getKtokd() {
            return ktokd;
        }

        public void setKtokd(String ktokd) {
            this.ktokd = ktokd;
        }

        public String getLabelcategory() {
            return labelcategory;
        }

        public void setLabelcategory(String labelcategory) {
            this.labelcategory = labelcategory;
        }

        public String getMakeup() {
            return makeup;
        }

        public void setMakeup(String makeup) {
            this.makeup = makeup;
        }

        public int getModifyby() {
            return modifyby;
        }

        public void setModifyby(int modifyby) {
            this.modifyby = modifyby;
        }

        public String getOpportcount() {
            return opportcount;
        }

        public void setOpportcount(String opportcount) {
            this.opportcount = opportcount;
        }

        public String getOpportnum() {
            return opportnum;
        }

        public void setOpportnum(String opportnum) {
            this.opportnum = opportnum;
        }

        public String getOrgcode() {
            return orgcode;
        }

        public void setOrgcode(String orgcode) {
            this.orgcode = orgcode;
        }

        public String getOrgid() {
            return orgid;
        }

        public void setOrgid(String orgid) {
            this.orgid = orgid;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public long getOwner() {
            return owner;
        }

        public void setOwner(long owner) {
            this.owner = owner;
        }

        public String getOwnerid() {
            return ownerid;
        }

        public void setOwnerid(String ownerid) {
            this.ownerid = ownerid;
        }

        public String getOwnername() {
            return ownername;
        }

        public void setOwnername(String ownername) {
            this.ownername = ownername;
        }

        public String getPactcount() {
            return pactcount;
        }

        public void setPactcount(String pactcount) {
            this.pactcount = pactcount;
        }

        public String getPaymentunit() {
            return paymentunit;
        }

        public void setPaymentunit(String paymentunit) {
            this.paymentunit = paymentunit;
        }

        public String getPltyp() {
            return pltyp;
        }

        public void setPltyp(String pltyp) {
            this.pltyp = pltyp;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getRegionname() {
            return regionname;
        }

        public void setRegionname(String regionname) {
            this.regionname = regionname;
        }

        public String getRelationlevel() {
            return relationlevel;
        }

        public void setRelationlevel(String relationlevel) {
            this.relationlevel = relationlevel;
        }

        public String getSaleparty() {
            return saleparty;
        }

        public void setSaleparty(String saleparty) {
            this.saleparty = saleparty;
        }

        public String getShipparty() {
            return shipparty;
        }

        public void setShipparty(String shipparty) {
            this.shipparty = shipparty;
        }

        public String getShortname() {
            return shortname;
        }

        public void setShortname(String shortname) {
            this.shortname = shortname;
        }

        public String getSitecode() {
            return sitecode;
        }

        public void setSitecode(String sitecode) {
            this.sitecode = sitecode;
        }

        public String getSpart() {
            return spart;
        }

        public void setSpart(String spart) {
            this.spart = spart;
        }

        public String getSubjects() {
            return subjects;
        }

        public void setSubjects(String subjects) {
            this.subjects = subjects;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getTransportmethod() {
            return transportmethod;
        }

        public void setTransportmethod(String transportmethod) {
            this.transportmethod = transportmethod;
        }

        public long getTs() {
            return ts;
        }

        public void setTs(long ts) {
            this.ts = ts;
        }

        public String getUnitid() {
            return unitid;
        }

        public void setUnitid(String unitid) {
            this.unitid = unitid;
        }

        public String getValueassessment() {
            return valueassessment;
        }

        public void setValueassessment(String valueassessment) {
            this.valueassessment = valueassessment;
        }

        public String getVkbur() {
            return vkbur;
        }

        public void setVkbur(String vkbur) {
            this.vkbur = vkbur;
        }

        public String getWeb() {
            return web;
        }

        public void setWeb(String web) {
            this.web = web;
        }

        public String getYearincome() {
            return yearincome;
        }

        public void setYearincome(String yearincome) {
            this.yearincome = yearincome;
        }

        public String getYearnum() {
            return yearnum;
        }

        public void setYearnum(String yearnum) {
            this.yearnum = yearnum;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }
    }
}
