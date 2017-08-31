package com.cimcitech.cimcly.bean.opport_unit;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/10.
 */

public class IntentionTrackRecordingVo {
    /**
     * data : [{"contacts":null,"createtime":1502192599000,"followdescript":null,"followstyle":"FOLLOW01","opportid":506,"opportsubject":null,"planmoney":5454,"plansigndate":1483545660000,"possibility":"PS02","productcount":"5454","productid":"CLY5040XLC","recordid":686,"remark":"","stage":"CS01"},{"contacts":null,"createtime":1502191173000,"followdescript":null,"followstyle":"FOLLOW01","opportid":506,"opportsubject":null,"planmoney":5454,"plansigndate":1483632060000,"possibility":"PS02","productcount":"5454","productid":"CLY5310XLC","recordid":683,"remark":"","stage":"CS01"},{"contacts":null,"createtime":1502191139000,"followdescript":null,"followstyle":"FOLLOW01","opportid":506,"opportsubject":null,"planmoney":5454,"plansigndate":1483718460000,"possibility":"PS02","productcount":"5454","productid":"CLY5310XLC","recordid":682,"remark":"","stage":"CS01"},{"contacts":null,"createtime":1502190086000,"followdescript":null,"followstyle":"FOLLOW01","opportid":506,"opportsubject":null,"planmoney":5454,"plansigndate":1502121600000,"possibility":"PS02","productcount":"5454","productid":"CLY5310XLC","recordid":677,"remark":"","stage":"CS01"},{"contacts":null,"createtime":1502189891000,"followdescript":null,"followstyle":"FOLLOW01","opportid":506,"opportsubject":null,"planmoney":5454,"plansigndate":1502121600000,"possibility":"PS02","productcount":"5454","productid":"CLY5310XLC","recordid":675,"remark":"","stage":"CS03"}]
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
         * contacts : null
         * createtime : 1502192599000
         * followdescript : null
         * followstyle : FOLLOW01
         * opportid : 506
         * opportsubject : null
         * planmoney : 5454
         * plansigndate : 1483545660000
         * possibility : PS02
         * productcount : 5454
         * productid : CLY5040XLC
         * recordid : 686
         * remark :
         * stage : CS01
         */

        private Object contacts;
        private long createtime;
        private Object followdescript;
        private String followstyle;
        private int opportid;
        private Object opportsubject;
        private int planmoney;
        private long plansigndate;
        private String possibility;
        private String productcount;
        private String productid;
        private int recordid;
        private String remark;
        private String stage;

        public Object getContacts() {
            return contacts;
        }

        public void setContacts(Object contacts) {
            this.contacts = contacts;
        }

        public long getCreatetime() {
            return createtime;
        }

        public void setCreatetime(long createtime) {
            this.createtime = createtime;
        }

        public Object getFollowdescript() {
            return followdescript;
        }

        public void setFollowdescript(Object followdescript) {
            this.followdescript = followdescript;
        }

        public String getFollowstyle() {
            return followstyle;
        }

        public void setFollowstyle(String followstyle) {
            this.followstyle = followstyle;
        }

        public int getOpportid() {
            return opportid;
        }

        public void setOpportid(int opportid) {
            this.opportid = opportid;
        }

        public Object getOpportsubject() {
            return opportsubject;
        }

        public void setOpportsubject(Object opportsubject) {
            this.opportsubject = opportsubject;
        }

        public int getPlanmoney() {
            return planmoney;
        }

        public void setPlanmoney(int planmoney) {
            this.planmoney = planmoney;
        }

        public long getPlansigndate() {
            return plansigndate;
        }

        public void setPlansigndate(long plansigndate) {
            this.plansigndate = plansigndate;
        }

        public String getPossibility() {
            return possibility;
        }

        public void setPossibility(String possibility) {
            this.possibility = possibility;
        }

        public String getProductcount() {
            return productcount;
        }

        public void setProductcount(String productcount) {
            this.productcount = productcount;
        }

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public int getRecordid() {
            return recordid;
        }

        public void setRecordid(int recordid) {
            this.recordid = recordid;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }
    }
}
