package com.cimcitech.cimcly.bean.client;

import java.util.ArrayList;

/**
 * Created by cimcitech on 2017/8/3.
 */

public class ClientNameVo {

    private ArrayList<Data> data;
    private String msg;
    private boolean success;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
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

    public class Data {
        private Long custid;
        private String custname;
        private String customerno;
        private String conttel;
        private String custaddress;

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

        public String getConttel() {
            return conttel;
        }

        public void setConttel(String conttel) {
            this.conttel = conttel;
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
    }


}
