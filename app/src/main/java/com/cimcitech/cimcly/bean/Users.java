package com.cimcitech.cimcly.bean;

/**
 * Created by lyw on 2017/7/26.
 */

public class Users {
    private boolean success;
    private String msg;
    private Data data;
    public boolean getsuccess() {
        return success;
    }
    public String getmsg() {
        return msg;
    }
    public Data getdata() {
        return data;
    }
    public void setdata(Data data) {
        this.data = data;
    }
    public void setsuccess(boolean success) {
        this.success = success;
    }
    public void setmsg(String msg) {
        this.msg = msg;
    }
    public class Data {
        private String token;
        private Integer userId;
        public Integer getuserId() {
            return userId;
        }
        public String gettoken() {
            return token;
        }
        public void setuserId(Integer userId) {
            this.userId = userId;
        }
        public void settoken(String token) {
            this.token = token;
        }
    }
}
    /*Foo03 foo = new Gson().fromJson(getStrFromAssets("Json02"), Users.class);
        System.out.println("name = " + foo.childFoo.name);*/