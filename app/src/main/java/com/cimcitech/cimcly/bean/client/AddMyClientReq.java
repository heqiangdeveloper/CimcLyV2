package com.cimcitech.cimcly.bean.client;

/**
 * Created by lyw on 2017/7/28.
 */

public class AddMyClientReq {

    private String custname;
    private String custaddress;
    private String custtel;
    private String custtype;
    private String zipcode;
    private String web;
    private int creator;
    private int owner;
    private String shortname;
    private String fax;
    private String country;
    private String province;
    private String city;
    private String makeup;
    private String summary;
    private Contact contact;
    private Long custid;

    public AddMyClientReq(String custname, String custaddress, String custtel, String custtype, String zipcode, String web, int creator, int owner, String shortname, String fax, String country, String province, String city, String makeup, String summary, Contact contact) {
        this.custname = custname;
        this.custaddress = custaddress;
        this.custtel = custtel;
        this.custtype = custtype;
        this.zipcode = zipcode;
        this.web = web;
        this.creator = creator;
        this.owner = owner;
        this.shortname = shortname;
        this.fax = fax;
        this.country = country;
        this.province = province;
        this.city = city;
        this.makeup = makeup;
        this.summary = summary;
        this.contact = contact;
    }

    public AddMyClientReq(Long custid, String custname, String custaddress, String custtel, String custtype, String zipcode, String web, int creator, int owner, String shortname, String fax, String country, String province, String city, String makeup, String summary) {
        this.custid = custid;
        this.custname = custname;
        this.custaddress = custaddress;
        this.custtel = custtel;
        this.custtype = custtype;
        this.zipcode = zipcode;
        this.web = web;
        this.creator = creator;
        this.owner = owner;
        this.shortname = shortname;
        this.fax = fax;
        this.country = country;
        this.province = province;
        this.city = city;
        this.makeup = makeup;
        this.summary = summary;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMakeup() {
        return makeup;
    }

    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }
}
