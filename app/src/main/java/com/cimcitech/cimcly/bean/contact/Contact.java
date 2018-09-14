package com.cimcitech.cimcly.bean.contact;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户联系人实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:26
 */
public class Contact implements Serializable {
    private Long contpersonid;
    private String custid;
    private String custname;
    private String personname;

    private String conttel;

    private Long orgid;

    private Long creator;

    private long createdate;

    private Long modifyby;

    private Date ts;

    private String contfax;

    private String contemail;

    private String conthomepage;

    private String contmobile;

    private String contpostcode;

    private String contpost;

    private String contphoto;

    private BigDecimal companyid;

    private BigDecimal unitid;

    private Date birthday;

    private String isactive;

    private String sex;

    private String category;

    private String business;

    private String type;

    private String nichname;

    private String familytel;

    private String msnqq;

    private String skype;

    private String wangwang;

    private String address;

    private String interest;

    private String credtype;

    private String remark;

    private String credno;

    private String department;

    private String usual;

    private BigDecimal owner;

    private String unitarea;

    private String unitcity;

    private String unitaddress;

    private String unitpostcode;

    private String familyarea;

    private String familycity;

    private String familyaddress;

    private String familypostcode;

    private String otherarea;

    private String othercity;

    private String otheraddress;

    private String otherpostcode;

    private String othertel;

    private String assist;

    private String assisttel;

    private String custtype;

    private String summary;

    private String letters;

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public Contact(String personname, String conttel,
                   String contmobile, String familyarea,
                   String familycity, String familyaddress,
                   String summary) {
        this.personname = personname;
        this.conttel = conttel;
        this.contmobile = contmobile;
        this.familyarea = familyarea;
        this.familycity = familycity;
        this.familyaddress = familyaddress;
        this.summary = summary;
    }

    public Long getContpersonid() {
        return contpersonid;
    }

    public void setContpersonid(Long contpersonid) {
        this.contpersonid = contpersonid;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getConttel() {
        return conttel;
    }

    public void setConttel(String conttel) {
        this.conttel = conttel;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(long createdate) {
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

    public String getContfax() {
        return contfax;
    }

    public void setContfax(String contfax) {
        this.contfax = contfax;
    }

    public String getContemail() {
        return contemail;
    }

    public void setContemail(String contemail) {
        this.contemail = contemail;
    }

    public String getConthomepage() {
        return conthomepage;
    }

    public void setConthomepage(String conthomepage) {
        this.conthomepage = conthomepage;
    }

    public String getContmobile() {
        return contmobile;
    }

    public void setContmobile(String contmobile) {
        this.contmobile = contmobile;
    }

    public String getContpostcode() {
        return contpostcode;
    }

    public void setContpostcode(String contpostcode) {
        this.contpostcode = contpostcode;
    }

    public String getContpost() {
        return contpost;
    }

    public void setContpost(String contpost) {
        this.contpost = contpost;
    }

    public String getContphoto() {
        return contphoto;
    }

    public void setContphoto(String contphoto) {
        this.contphoto = contphoto;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNichname() {
        return nichname;
    }

    public void setNichname(String nichname) {
        this.nichname = nichname;
    }

    public String getFamilytel() {
        return familytel;
    }

    public void setFamilytel(String familytel) {
        this.familytel = familytel;
    }

    public String getMsnqq() {
        return msnqq;
    }

    public void setMsnqq(String msnqq) {
        this.msnqq = msnqq;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getWangwang() {
        return wangwang;
    }

    public void setWangwang(String wangwang) {
        this.wangwang = wangwang;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getCredtype() {
        return credtype;
    }

    public void setCredtype(String credtype) {
        this.credtype = credtype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCredno() {
        return credno;
    }

    public void setCredno(String credno) {
        this.credno = credno;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUsual() {
        return usual;
    }

    public void setUsual(String usual) {
        this.usual = usual;
    }

    public BigDecimal getOwner() {
        return owner;
    }

    public void setOwner(BigDecimal owner) {
        this.owner = owner;
    }

    public String getUnitarea() {
        return unitarea;
    }

    public void setUnitarea(String unitarea) {
        this.unitarea = unitarea;
    }

    public String getUnitcity() {
        return unitcity;
    }

    public void setUnitcity(String unitcity) {
        this.unitcity = unitcity;
    }

    public String getUnitaddress() {
        return unitaddress;
    }

    public void setUnitaddress(String unitaddress) {
        this.unitaddress = unitaddress;
    }

    public String getUnitpostcode() {
        return unitpostcode;
    }

    public void setUnitpostcode(String unitpostcode) {
        this.unitpostcode = unitpostcode;
    }

    public String getFamilyarea() {
        return familyarea;
    }

    public void setFamilyarea(String familyarea) {
        this.familyarea = familyarea;
    }

    public String getFamilycity() {
        return familycity;
    }

    public void setFamilycity(String familycity) {
        this.familycity = familycity;
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress;
    }

    public String getFamilypostcode() {
        return familypostcode;
    }

    public void setFamilypostcode(String familypostcode) {
        this.familypostcode = familypostcode;
    }

    public String getOtherarea() {
        return otherarea;
    }

    public void setOtherarea(String otherarea) {
        this.otherarea = otherarea;
    }

    public String getOthercity() {
        return othercity;
    }

    public void setOthercity(String othercity) {
        this.othercity = othercity;
    }

    public String getOtheraddress() {
        return otheraddress;
    }

    public void setOtheraddress(String otheraddress) {
        this.otheraddress = otheraddress;
    }

    public String getOtherpostcode() {
        return otherpostcode;
    }

    public void setOtherpostcode(String otherpostcode) {
        this.otherpostcode = otherpostcode;
    }

    public String getOthertel() {
        return othertel;
    }

    public void setOthertel(String othertel) {
        this.othertel = othertel;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
        this.assist = assist;
    }

    public String getAssisttel() {
        return assisttel;
    }

    public void setAssisttel(String assisttel) {
        this.assisttel = assisttel;
    }

    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}