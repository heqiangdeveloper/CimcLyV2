package com.cimcitech.cimcly.bean.quoted_price;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/8.
 */

public class QuotedPriceDetailReq {

    /**
     * quoteopport : 3
     * quotestandprice : 185000.00
     * protocolprice : 195000
     * quoteprice : 195000
     * baseversion : 3
     * version : 3
     * creater : 555555924
     * deposit : 40000
     * quoteDetailList : [{"quotekey":"SPECIAL69","quotevalue":"111111"},{"quotekey":"SPECIAL65","quotevalue":"222222"},{"quotekey":"MHQX_Z034","quotevalue":"00"}]
     */

    private int quoteid;
    private String chassismodel;
    private String quoteopport;
    private double quotestandprice;
    private double protocolprice;
    private double quoteprice;
    private String baseversion;
    private String version;
    private String creater;
    private int deposit;
    private String isbringchassis;

    private List<QuoteDetailListBean> quoteDetailList;

    public QuotedPriceDetailReq(int quoteid, String chassismodel, String quoteopport,
                                double quotestandprice, double protocolprice, double quoteprice,
                                String baseversion, String version, String creater,
                                int deposit, List<QuoteDetailListBean> quoteDetailList,String isbringchassis) {
        this.quoteid = quoteid;
        this.chassismodel = chassismodel;
        this.quoteopport = quoteopport;
        this.quotestandprice = quotestandprice;
        this.protocolprice = protocolprice;
        this.quoteprice = quoteprice;
        this.baseversion = baseversion;
        this.version = version;
        this.creater = creater;
        this.deposit = deposit;
        this.quoteDetailList = quoteDetailList;
        this.isbringchassis = isbringchassis;
    }

    public QuotedPriceDetailReq(String chassismodel, String quoteopport, double quotestandprice, double protocolprice, double quoteprice, String baseversion, String version, String creater, int deposit, String isbringchassis, List<QuoteDetailListBean> quoteDetailList) {
        this.chassismodel = chassismodel;
        this.quoteopport = quoteopport;
        this.quotestandprice = quotestandprice;
        this.protocolprice = protocolprice;
        this.quoteprice = quoteprice;
        this.baseversion = baseversion;
        this.version = version;
        this.creater = creater;
        this.deposit = deposit;
        this.isbringchassis = isbringchassis;
        this.quoteDetailList = quoteDetailList;
    }


    public String getQuoteopport() {
        return quoteopport;
    }

    public void setQuoteopport(String quoteopport) {
        this.quoteopport = quoteopport;
    }

    public double getQuotestandprice() {
        return quotestandprice;
    }

    public void setQuotestandprice(double quotestandprice) {
        this.quotestandprice = quotestandprice;
    }

    public double getProtocolprice() {
        return protocolprice;
    }

    public void setProtocolprice(double protocolprice) {
        this.protocolprice = protocolprice;
    }

    public double getQuoteprice() {
        return quoteprice;
    }

    public void setQuoteprice(double quoteprice) {
        this.quoteprice = quoteprice;
    }

    public String getBaseversion() {
        return baseversion;
    }

    public void setBaseversion(String baseversion) {
        this.baseversion = baseversion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public List<QuoteDetailListBean> getQuoteDetailList() {
        return quoteDetailList;
    }

    public void setQuoteDetailList(List<QuoteDetailListBean> quoteDetailList) {
        this.quoteDetailList = quoteDetailList;
    }

    public int getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(int quoteid) {
        this.quoteid = quoteid;
    }

    public String getChassismodel() {
        return chassismodel;
    }

    public void setChassismodel(String chassismodel) {
        this.chassismodel = chassismodel;
    }

    public String getIsbringchassis() {
        return isbringchassis;
    }

    public void setIsbringchassis(String isbringchassis) {
        this.isbringchassis = isbringchassis;
    }


    public static class QuoteDetailListBean {
        /**
         * quotekey : SPECIAL69
         * quotevalue : 111111
         */

        private String quotekey;
        private String quotevalue;

        public QuoteDetailListBean(String quotekey, String quotevalue) {
            this.quotekey = quotekey;
            this.quotevalue = quotevalue;
        }

        public QuoteDetailListBean() {
        }

        public String getQuotekey() {
            return quotekey;
        }

        public void setQuotekey(String quotekey) {
            this.quotekey = quotekey;
        }

        public String getQuotevalue() {
            return quotevalue;
        }

        public void setQuotevalue(String quotevalue) {
            this.quotevalue = quotevalue;
        }
    }
}
