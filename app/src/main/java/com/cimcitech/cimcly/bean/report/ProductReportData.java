package com.cimcitech.cimcly.bean.report;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 客户实体类
 *
 * @author 00014092
 * @version 1.0
 * @date 2017年7月24日 上午11:32:41
 */
public class ProductReportData implements Serializable{

    public  int  count = 0;
    public  int  highCount = 0;
    public  int  midCount = 0;
    public  int  lowCount = 0;
    public  int  sureCount = 0;

    private String variety;
    private String varietyDesc;
    private ArrayList<Cell> opportUnityVos;

    public int getHighCount() {
        return highCount;
    }

    public void setHighCount(int highCount) {
        this.highCount = highCount;
    }

    public int getMidCount() {
        return midCount;
    }

    public void setMidCount(int midCount) {
        this.midCount = midCount;
    }

    public int getLowCount() {
        return lowCount;
    }

    public void setLowCount(int lowCount) {
        this.lowCount = lowCount;
    }

    public int getSureCount() {
        return sureCount;
    }

    public void setSureCount(int sureCount) {
        this.sureCount = sureCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getVarietyDesc() {
        return varietyDesc;
    }

    public void setVarietyDesc(String varietyDesc) {
        this.varietyDesc = varietyDesc;
    }

    public ArrayList<Cell> getOpportUnityVos() {
        return opportUnityVos;
    }

    public void setOpportUnityVos(ArrayList<Cell> opportUnityVos) {
        this.opportUnityVos = opportUnityVos;
    }
}