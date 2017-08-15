package com.cimcitech.cimcly.bean.client;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class Customer implements Serializable{

    private Long custid;

    private String custname;

    private String custaddress;

    private String custtel;

    private String custtype;

    //客户类型名称
    private String custtypename;

    private String custstatus;

    private Long orgid;

    private Long ownerid;

    private Long creator;

    private Date createdate;

    private Long modifyby;

    private Date ts;

    private String contacter;

    private Long contacterid;

    private BigDecimal companyid;

    private BigDecimal unitid;

    private String saleparty;

    private String shipparty;

    private String isactive;

    private Integer owner;

    //销售员
    private String ownername;

    //意向订单数
    private Integer opportcount;

    //销售订单数
    private Integer pactcount;

    private String ishot;

    private String hotdegree;

    private String shortname;

    private String valueassessment;

    private String customerno;

    private String creditdegree;

    private String industry;

    private String yearincome;

    private String relationlevel;

    private String employeelevel;

    private String origin;

    private String labelcategory;

    private String summary;

    private String hottype;

    private String hotexplain;

    private String custnumber;

    private String area;

    private String city;

    private String web;

    private Long areaid;

    private String juridicalperson;

    private String email;

    private String fax;

    private String orgcode;

    private String dutyregno;

    private String country;

    private String sitecode;

    private String zipcode;

    private String fst;

    private String province;

    private Long contractnum;

    private Long opportnum;

    private Long yearnum;

    private Long deptno;

    private String iscredit;

    private String makeup;

    private String region;

    private String regionname;

    private String subjects;

    private String paymentunit;

    private String ktokd;

    private String pltyp;

    private String spart;

    private String vkbur;

    private String transportmethod;

    private String createreport;

    private String createauthor;

    private String createtime;

    //客户的联系人
    private Contact contact;

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
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

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
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

    public String getCuststatus() {
        return custstatus;
    }

    public void setCuststatus(String custstatus) {
        this.custstatus = custstatus;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public Long getContacterid() {
        return contacterid;
    }

    public void setContacterid(Long contacterid) {
        this.contacterid = contacterid;
    }

    public BigDecimal getCompanyid() {
        return companyid;
    }

    public void setCompanyid(BigDecimal companyid) {
        this.companyid = companyid;
    }

    public BigDecimal getUnitid() {
        return unitid;
    }

    public void setUnitid(BigDecimal unitid) {
        this.unitid = unitid;
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

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public Integer getOpportcount() {
        return opportcount;
    }

    public void setOpportcount(Integer opportcount) {
        this.opportcount = opportcount;
    }

    public Integer getPactcount() {
        return pactcount;
    }

    public void setPactcount(Integer pactcount) {
        this.pactcount = pactcount;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public String getHotdegree() {
        return hotdegree;
    }

    public void setHotdegree(String hotdegree) {
        this.hotdegree = hotdegree;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getValueassessment() {
        return valueassessment;
    }

    public void setValueassessment(String valueassessment) {
        this.valueassessment = valueassessment;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getCreditdegree() {
        return creditdegree;
    }

    public void setCreditdegree(String creditdegree) {
        this.creditdegree = creditdegree;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getYearincome() {
        return yearincome;
    }

    public void setYearincome(String yearincome) {
        this.yearincome = yearincome;
    }

    public String getRelationlevel() {
        return relationlevel;
    }

    public void setRelationlevel(String relationlevel) {
        this.relationlevel = relationlevel;
    }

    public String getEmployeelevel() {
        return employeelevel;
    }

    public void setEmployeelevel(String employeelevel) {
        this.employeelevel = employeelevel;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLabelcategory() {
        return labelcategory;
    }

    public void setLabelcategory(String labelcategory) {
        this.labelcategory = labelcategory;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getHottype() {
        return hottype;
    }

    public void setHottype(String hottype) {
        this.hottype = hottype;
    }

    public String getHotexplain() {
        return hotexplain;
    }

    public void setHotexplain(String hotexplain) {
        this.hotexplain = hotexplain;
    }

    public String getCustnumber() {
        return custnumber;
    }

    public void setCustnumber(String custnumber) {
        this.custnumber = custnumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public String getJuridicalperson() {
        return juridicalperson;
    }

    public void setJuridicalperson(String juridicalperson) {
        this.juridicalperson = juridicalperson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getDutyregno() {
        return dutyregno;
    }

    public void setDutyregno(String dutyregno) {
        this.dutyregno = dutyregno;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSitecode() {
        return sitecode;
    }

    public void setSitecode(String sitecode) {
        this.sitecode = sitecode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getFst() {
        return fst;
    }

    public void setFst(String fst) {
        this.fst = fst;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getContractnum() {
        return contractnum;
    }

    public void setContractnum(Long contractnum) {
        this.contractnum = contractnum;
    }

    public Long getOpportnum() {
        return opportnum;
    }

    public void setOpportnum(Long opportnum) {
        this.opportnum = opportnum;
    }

    public Long getYearnum() {
        return yearnum;
    }

    public void setYearnum(Long yearnum) {
        this.yearnum = yearnum;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getIscredit() {
        return iscredit;
    }

    public void setIscredit(String iscredit) {
        this.iscredit = iscredit;
    }

    public String getMakeup() {
        return makeup;
    }

    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getPaymentunit() {
        return paymentunit;
    }

    public void setPaymentunit(String paymentunit) {
        this.paymentunit = paymentunit;
    }

    public String getKtokd() {
        return ktokd;
    }

    public void setKtokd(String ktokd) {
        this.ktokd = ktokd;
    }

    public String getPltyp() {
        return pltyp;
    }

    public void setPltyp(String pltyp) {
        this.pltyp = pltyp;
    }

    public String getSpart() {
        return spart;
    }

    public void setSpart(String spart) {
        this.spart = spart;
    }

    public String getVkbur() {
        return vkbur;
    }

    public void setVkbur(String vkbur) {
        this.vkbur = vkbur;
    }

    public String getTransportmethod() {
        return transportmethod;
    }

    public void setTransportmethod(String transportmethod) {
        this.transportmethod = transportmethod;
    }

    public String getCreatereport() {
        return createreport;
    }

    public void setCreatereport(String createreport) {
        this.createreport = createreport;
    }

    public String getCreateauthor() {
        return createauthor;
    }

    public void setCreateauthor(String createauthor) {
        this.createauthor = createauthor;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}