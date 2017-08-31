package com.cimcitech.cimcly.bean;

/**
 * Created by lyw on 2017/7/26.
 */

public class Loginback {

        /**
         * userId : 2
         * token : 2FD08ED0-E53B-48B1-B8E6-E6B4290A2770
         */
    private int userId;
    private String userName;
    private String token = "";
    private String appAuth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAppAuth() {
        return appAuth;
    }

    public void setAppAuth(String appAuth) {
        this.appAuth = appAuth;
    }

    public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }


}