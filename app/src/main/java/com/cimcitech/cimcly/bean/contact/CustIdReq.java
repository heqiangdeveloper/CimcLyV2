package com.cimcitech.cimcly.bean.contact;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class CustIdReq {

    private Long custid;

    public CustIdReq(Long custid) {
        this.custid = custid;
    }


    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }
}
