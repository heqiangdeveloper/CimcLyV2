package com.cimcitech.cimcly.bean.contact;

/**
 * Created by cimcitech on 2017/8/2.
 */

public class ContactReq {

    private int pageNum;
    private int pageSize;
    private String orderBy;
    private ContactReqBean contact;

    public ContactReq(int pageNum, int pageSize, String orderBy, ContactReqBean contact) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
        this.contact = contact;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ContactReqBean getCustomer() {
        return contact;
    }

    public void setCustomer(ContactReqBean customer) {
        this.contact = customer;
    }

    public static class ContactReqBean {
        private String owner;
        private String personname;
        private Long custid;

        public ContactReqBean(String owner, String personname) {
            this.owner = owner;
            this.personname = personname;
        }

        public ContactReqBean(String owner, String personname, Long custid) {
            this.owner = owner;
            this.personname = personname;
            this.custid = custid;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
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

        public Long getCustid() {
            return custid;
        }

        public void setCustid(Long custid) {
            this.custid = custid;
        }
    }
}
