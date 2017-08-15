package com.cimcitech.cimcly.bean.person;

/**
 * Created by apple on 2017/8/14.
 */

public class UpdatePersonReq {

    private int contpersonid;
    private Long custid;
    private String personname;
    private String conttel;
    private String contmobile;
    private String familyarea;
    private String familycity;
    private String familyaddress;
    private int modify;

    public UpdatePersonReq(int contpersonid, Long custid, String personname, String conttel, String contmobile, String familyarea, String familycity, String familyaddress, int modify) {
        this.contpersonid = contpersonid;
        this.custid = custid;
        this.personname = personname;
        this.conttel = conttel;
        this.contmobile = contmobile;
        this.familyarea = familyarea;
        this.familycity = familycity;
        this.familyaddress = familyaddress;
        this.modify = modify;
    }

    public int getContpersonid() {
        return contpersonid;
    }

    public void setContpersonid(int contpersonid) {
        this.contpersonid = contpersonid;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
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

    public int getModify() {
        return modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }
}
