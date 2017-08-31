package com.cimcitech.cimcly.bean.quoted_price;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/9.
 */

public class GetChassisVo {
    /**
     * data : [{"isBringChassis":"N","deposit":40000,"chassisDesc":"公司采购"},{"isBringChassis":"Y","deposit":20000,"chassisDesc":"客户自带"}]
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
         * isBringChassis : N
         * deposit : 40000
         * chassisDesc : 公司采购
         */

        private String isBringChassis;
        private int deposit;
        private String chassisDesc;

        public String getIsBringChassis() {
            return isBringChassis;
        }

        public void setIsBringChassis(String isBringChassis) {
            this.isBringChassis = isBringChassis;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public String getChassisDesc() {
            return chassisDesc;
        }

        public void setChassisDesc(String chassisDesc) {
            this.chassisDesc = chassisDesc;
        }
    }
}
