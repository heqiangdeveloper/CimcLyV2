package com.cimcitech.cimcly.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 所有分页
 */
public class ListPaymentDetailPagers<T> implements Serializable {


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
