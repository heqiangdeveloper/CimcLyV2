package com.cimcitech.cimcly.bean.feed_back;

import java.util.List;

/**
 * Created by apple on 2017/8/14.
 */

public class QuestionTypeVo {
    /**
     * data : [{"active":null,"codeValueList":null,"codeid":"QT01","codetype":null,"codevalue":"产品质量","ecodevalue":null,"itemid":null,"parentid":null},{"active":null,"codeValueList":null,"codeid":"QT02","codetype":null,"codevalue":"售后服务","ecodevalue":null,"itemid":null,"parentid":null},{"active":null,"codeValueList":null,"codeid":"QT03","codetype":null,"codevalue":"运输服务","ecodevalue":null,"itemid":null,"parentid":null},{"active":null,"codeValueList":null,"codeid":"QT04","codetype":null,"codevalue":"其它","ecodevalue":null,"itemid":null,"parentid":null}]
     * msg :
     * success : true
     */

    private String msg;
    private boolean success;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * active : null
         * codeValueList : null
         * codeid : QT01
         * codetype : null
         * codevalue : 产品质量
         * ecodevalue : null
         * itemid : null
         * parentid : null
         */

        private Object active;
        private Object codeValueList;
        private String codeid;
        private Object codetype;
        private String codevalue;
        private Object ecodevalue;
        private Object itemid;
        private Object parentid;

        public Object getActive() {
            return active;
        }

        public void setActive(Object active) {
            this.active = active;
        }

        public Object getCodeValueList() {
            return codeValueList;
        }

        public void setCodeValueList(Object codeValueList) {
            this.codeValueList = codeValueList;
        }

        public String getCodeid() {
            return codeid;
        }

        public void setCodeid(String codeid) {
            this.codeid = codeid;
        }

        public Object getCodetype() {
            return codetype;
        }

        public void setCodetype(Object codetype) {
            this.codetype = codetype;
        }

        public String getCodevalue() {
            return codevalue;
        }

        public void setCodevalue(String codevalue) {
            this.codevalue = codevalue;
        }

        public Object getEcodevalue() {
            return ecodevalue;
        }

        public void setEcodevalue(Object ecodevalue) {
            this.ecodevalue = ecodevalue;
        }

        public Object getItemid() {
            return itemid;
        }

        public void setItemid(Object itemid) {
            this.itemid = itemid;
        }

        public Object getParentid() {
            return parentid;
        }

        public void setParentid(Object parentid) {
            this.parentid = parentid;
        }
    }
}
