package com.cimcitech.cimcly.bean.contact;

import java.io.Serializable;

/**
 * Created by cimcitech on 2017/8/2.
 */

public class ContactInfoVo implements Serializable{


    /**
     * data : {"address":null,"assist":null,"assisttel":null,"birthday":null,"business":null,"category":null,"companyid":null,"contemail":null,"contfax":null,"conthomepage":null,"contmobile":"13455577555","contpersonid":19759,"contphoto":null,"contpost":null,"contpostcode":null,"conttel":null,"createdate":1502701162000,"creator":null,"credno":null,"credtype":null,"custid":"70604","custname":"yggg","customerNo":null,"custtype":null,"department":null,"familyaddress":"gffgg","familyarea":"内蒙古","familycity":"呼伦贝尔","familypostcode":null,"familytel":null,"interest":null,"isactive":null,"modifyby":null,"msnqq":null,"nichname":null,"orgid":null,"otheraddress":null,"otherarea":null,"othercity":null,"otherpostcode":null,"othertel":null,"owner":null,"personname":"gggh","remark":null,"sex":null,"skype":null,"summary":null,"ts":null,"type":null,"unitaddress":null,"unitarea":null,"unitcity":null,"unitid":null,"unitpostcode":null,"usual":null,"wangwang":null}
     * msg :
     * success : true
     */

    private DataBean data;
    private String msg;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
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

    public static class DataBean implements Serializable{
        /**
         * address : null
         * assist : null
         * assisttel : null
         * birthday : null
         * business : null
         * category : null
         * companyid : null
         * contemail : null
         * contfax : null
         * conthomepage : null
         * contmobile : 13455577555
         * contpersonid : 19759
         * contphoto : null
         * contpost : null
         * contpostcode : null
         * conttel : null
         * createdate : 1502701162000
         * creator : null
         * credno : null
         * credtype : null
         * custid : 70604
         * custname : yggg
         * customerNo : null
         * custtype : null
         * department : null
         * familyaddress : gffgg
         * familyarea : 内蒙古
         * familycity : 呼伦贝尔
         * familypostcode : null
         * familytel : null
         * interest : null
         * isactive : null
         * modifyby : null
         * msnqq : null
         * nichname : null
         * orgid : null
         * otheraddress : null
         * otherarea : null
         * othercity : null
         * otherpostcode : null
         * othertel : null
         * owner : null
         * personname : gggh
         * remark : null
         * sex : null
         * skype : null
         * summary : null
         * ts : null
         * type : null
         * unitaddress : null
         * unitarea : null
         * unitcity : null
         * unitid : null
         * unitpostcode : null
         * usual : null
         * wangwang : null
         */

        private Object address;
        private Object assist;
        private Object assisttel;
        private Object birthday;
        private Object business;
        private Object category;
        private Object companyid;
        private Object contemail;
        private Object contfax;
        private Object conthomepage;
        private String contmobile;
        private int contpersonid;
        private Object contphoto;
        private Object contpost;
        private Object contpostcode;
        private String conttel;
        private long createdate;
        private Object creator;
        private Object credno;
        private Object credtype;
        private String custid;
        private String custname;
        private Object customerNo;
        private Object custtype;
        private Object department;
        private String familyaddress;
        private String familyarea;
        private String familycity;
        private Object familypostcode;
        private Object familytel;
        private Object interest;
        private Object isactive;
        private Object modifyby;
        private Object msnqq;
        private Object nichname;
        private Object orgid;
        private Object otheraddress;
        private Object otherarea;
        private Object othercity;
        private Object otherpostcode;
        private Object othertel;
        private Object owner;
        private String personname;
        private Object remark;
        private Object sex;
        private Object skype;
        private Object summary;
        private Object ts;
        private Object type;
        private Object unitaddress;
        private Object unitarea;
        private Object unitcity;
        private Object unitid;
        private Object unitpostcode;
        private Object usual;
        private Object wangwang;

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getAssist() {
            return assist;
        }

        public void setAssist(Object assist) {
            this.assist = assist;
        }

        public Object getAssisttel() {
            return assisttel;
        }

        public void setAssisttel(Object assisttel) {
            this.assisttel = assisttel;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public Object getBusiness() {
            return business;
        }

        public void setBusiness(Object business) {
            this.business = business;
        }

        public Object getCategory() {
            return category;
        }

        public void setCategory(Object category) {
            this.category = category;
        }

        public Object getCompanyid() {
            return companyid;
        }

        public void setCompanyid(Object companyid) {
            this.companyid = companyid;
        }

        public Object getContemail() {
            return contemail;
        }

        public void setContemail(Object contemail) {
            this.contemail = contemail;
        }

        public Object getContfax() {
            return contfax;
        }

        public void setContfax(Object contfax) {
            this.contfax = contfax;
        }

        public Object getConthomepage() {
            return conthomepage;
        }

        public void setConthomepage(Object conthomepage) {
            this.conthomepage = conthomepage;
        }

        public String getContmobile() {
            return contmobile;
        }

        public void setContmobile(String contmobile) {
            this.contmobile = contmobile;
        }

        public int getContpersonid() {
            return contpersonid;
        }

        public void setContpersonid(int contpersonid) {
            this.contpersonid = contpersonid;
        }

        public Object getContphoto() {
            return contphoto;
        }

        public void setContphoto(Object contphoto) {
            this.contphoto = contphoto;
        }

        public Object getContpost() {
            return contpost;
        }

        public void setContpost(Object contpost) {
            this.contpost = contpost;
        }

        public Object getContpostcode() {
            return contpostcode;
        }

        public void setContpostcode(Object contpostcode) {
            this.contpostcode = contpostcode;
        }

        public long getCreatedate() {
            return createdate;
        }

        public void setCreatedate(long createdate) {
            this.createdate = createdate;
        }

        public Object getCreator() {
            return creator;
        }

        public void setCreator(Object creator) {
            this.creator = creator;
        }

        public Object getCredno() {
            return credno;
        }

        public void setCredno(Object credno) {
            this.credno = credno;
        }

        public Object getCredtype() {
            return credtype;
        }

        public void setCredtype(Object credtype) {
            this.credtype = credtype;
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

        public Object getCustomerNo() {
            return customerNo;
        }

        public void setCustomerNo(Object customerNo) {
            this.customerNo = customerNo;
        }

        public Object getCusttype() {
            return custtype;
        }

        public void setCusttype(Object custtype) {
            this.custtype = custtype;
        }

        public Object getDepartment() {
            return department;
        }

        public void setDepartment(Object department) {
            this.department = department;
        }

        public String getFamilyaddress() {
            return familyaddress;
        }

        public void setFamilyaddress(String familyaddress) {
            this.familyaddress = familyaddress;
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

        public Object getFamilypostcode() {
            return familypostcode;
        }

        public void setFamilypostcode(Object familypostcode) {
            this.familypostcode = familypostcode;
        }

        public Object getFamilytel() {
            return familytel;
        }

        public void setFamilytel(Object familytel) {
            this.familytel = familytel;
        }

        public Object getInterest() {
            return interest;
        }

        public void setInterest(Object interest) {
            this.interest = interest;
        }

        public Object getIsactive() {
            return isactive;
        }

        public void setIsactive(Object isactive) {
            this.isactive = isactive;
        }

        public Object getModifyby() {
            return modifyby;
        }

        public void setModifyby(Object modifyby) {
            this.modifyby = modifyby;
        }

        public Object getMsnqq() {
            return msnqq;
        }

        public void setMsnqq(Object msnqq) {
            this.msnqq = msnqq;
        }

        public Object getNichname() {
            return nichname;
        }

        public void setNichname(Object nichname) {
            this.nichname = nichname;
        }

        public Object getOrgid() {
            return orgid;
        }

        public void setOrgid(Object orgid) {
            this.orgid = orgid;
        }

        public Object getOtheraddress() {
            return otheraddress;
        }

        public void setOtheraddress(Object otheraddress) {
            this.otheraddress = otheraddress;
        }

        public Object getOtherarea() {
            return otherarea;
        }

        public void setOtherarea(Object otherarea) {
            this.otherarea = otherarea;
        }

        public Object getOthercity() {
            return othercity;
        }

        public void setOthercity(Object othercity) {
            this.othercity = othercity;
        }

        public Object getOtherpostcode() {
            return otherpostcode;
        }

        public void setOtherpostcode(Object otherpostcode) {
            this.otherpostcode = otherpostcode;
        }

        public Object getOthertel() {
            return othertel;
        }

        public void setOthertel(Object othertel) {
            this.othertel = othertel;
        }

        public Object getOwner() {
            return owner;
        }

        public void setOwner(Object owner) {
            this.owner = owner;
        }

        public String getPersonname() {
            return personname;
        }

        public void setPersonname(String personname) {
            this.personname = personname;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getSex() {
            return sex;
        }

        public void setSex(Object sex) {
            this.sex = sex;
        }

        public Object getSkype() {
            return skype;
        }

        public void setSkype(Object skype) {
            this.skype = skype;
        }

        public Object getSummary() {
            return summary;
        }

        public void setSummary(Object summary) {
            this.summary = summary;
        }

        public Object getTs() {
            return ts;
        }

        public void setTs(Object ts) {
            this.ts = ts;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getUnitaddress() {
            return unitaddress;
        }

        public void setUnitaddress(Object unitaddress) {
            this.unitaddress = unitaddress;
        }

        public Object getUnitarea() {
            return unitarea;
        }

        public void setUnitarea(Object unitarea) {
            this.unitarea = unitarea;
        }

        public Object getUnitcity() {
            return unitcity;
        }

        public void setUnitcity(Object unitcity) {
            this.unitcity = unitcity;
        }

        public Object getUnitid() {
            return unitid;
        }

        public void setUnitid(Object unitid) {
            this.unitid = unitid;
        }

        public Object getUnitpostcode() {
            return unitpostcode;
        }

        public void setUnitpostcode(Object unitpostcode) {
            this.unitpostcode = unitpostcode;
        }

        public Object getUsual() {
            return usual;
        }

        public void setUsual(Object usual) {
            this.usual = usual;
        }

        public Object getWangwang() {
            return wangwang;
        }

        public void setWangwang(Object wangwang) {
            this.wangwang = wangwang;
        }

        public String getConttel() {
            return conttel;
        }

        public void setConttel(String conttel) {
            this.conttel = conttel;
        }
    }
}
