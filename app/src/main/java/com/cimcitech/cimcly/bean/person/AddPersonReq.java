package com.cimcitech.cimcly.bean.person;

/**
 * Created by cimcitech on 2017/8/3.
 */

public class AddPersonReq {

    private ContactReqBean contact;

    public AddPersonReq(ContactReqBean contact) {
        this.contact = contact;
    }

    public ContactReqBean getContact() {
        return contact;
    }

    public void setContact(ContactReqBean contact) {
        this.contact = contact;
    }

    public static class ContactReqBean {
        private String personname;
        private Long custid;
        private String conttel;
        private String contmobile;
        private String familyarea;
        private String familycity;
        private String familyaddress;
        private String summary;
        private int creator;

        public ContactReqBean(String personname, Long custid, String conttel, String contmobile, String familyarea, String familycity, String familyaddress, String summary, int creator) {
            this.personname = personname;
            this.custid = custid;
            this.conttel = conttel;
            this.contmobile = contmobile;
            this.familyarea = familyarea;
            this.familycity = familycity;
            this.familyaddress = familyaddress;
            this.summary = summary;
            this.creator = creator;
        }


        public String getPerosonname() {
            return personname;
        }

        public void setPerosonname(String perosonname) {
            this.personname = perosonname;
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

        public String getContmobile() {
            return contmobile;
        }

        public void setContmobile(String contmobile) {
            this.contmobile = contmobile;
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

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
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
}
