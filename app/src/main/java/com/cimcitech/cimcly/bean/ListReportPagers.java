package com.cimcitech.cimcly.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 所有分页
 */
public class ListReportPagers<T> implements Serializable {


    private String region;
    private String regionDesc;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionDesc() {
        return regionDesc;
    }

    public void setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
    }

    private List<T> list;
    public List<T> getList()
    {
        return list;
    }
    public void setList(List<T> results)
    {
        this.list = results;
    }

}
