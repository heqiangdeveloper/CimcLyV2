package com.cimcitech.cimcly.bean.RequestBean;

/**
 * Created by cimcitech on 2017/7/31.
 */

public class LoginReq {

    /**
     * Created by lyw on 2017/7/30.
     */



        /**
         * pageNum : 1
         * pageSize : 10
         * orderBy :
         * customerVisit : {"creator":"2"}
         */

        private String userName;
        private String passwd;

        public LoginReq(String userName, String passwd) {
            this.userName = userName;
            this.passwd = passwd;
        }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

//    public static class CustomerVisitBean {
//            public CustomerVisitBean(String creator) {
//                this.creator = creator;
//            }
//
//            /**
//             * creator : 2
//             */
//
//            private String creator;
//
//            public String getCreator() {
//                return creator;
//            }
//
//            public void setCreator(String creator) {
//                this.creator = creator;
//            }
//        }

}
