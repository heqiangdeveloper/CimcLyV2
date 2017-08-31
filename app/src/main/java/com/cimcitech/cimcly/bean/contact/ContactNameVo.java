package com.cimcitech.cimcly.bean.contact;

import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ContactNameVo {

    private ArrayList<Data> data;
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

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public class Data {
        private String custid;
        private String custname;
        private String conttel;
        private int contpersonid;
        private String personname;

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

        public String getConttel() {
            return conttel;
        }

        public void setConttel(String conttel) {
            this.conttel = conttel;
        }

        public int getContpersonid() {
            return contpersonid;
        }

        public void setContpersonid(int contpersonid) {
            this.contpersonid = contpersonid;
        }

        public String getPersonname() {
            return personname;
        }

        public void setPersonname(String personname) {
            this.personname = personname;
        }
    }
}
