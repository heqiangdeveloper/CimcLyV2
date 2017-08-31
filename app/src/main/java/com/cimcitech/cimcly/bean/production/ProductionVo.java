package com.cimcitech.cimcly.bean.production;

import java.util.Date;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class ProductionVo {

    private Data data;
    private String msg;
    private boolean success;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Data{
        private long actualbegindate;
        private long actualenddate;
        private Object batchno ;
        private Object ccisprint;
        private Object companyid ;
        private long confirmdate ;
        private Object createpeople ;
        private Object createtime ;
        private Object  departurestatus ;
        private Object  disporder ;
        private Object inwarehousedate ;
        private Object inwarehouseperson ;
        private Object  isbuildvin ;
        private Object  isfinish ;
        private Object  isinstorage ;
        private Object  ordertype ;
        private long  planbegindate ;
        private long  planenddate ;
        private long    prodorderdetid ;
        private Object   prodorderno ;
        private Object    productionstages ;
        private Object   productmodel ;
        private Object  productstages ;
        private Object  qcisprint ;
        private Object   sorderno ;
        private Object   stockallquality ;
        private Object   stockaxisnumber ;
        private Object  stockbodytype ;
        private Object  stockbraketype ;
        private Object  stockcartype ;
        private Object  stockcodes ;
        private Object    stocktotalmass ;
        private Object     stocktrailerlength ;
        private Object    stocktrailertype ;
        private Object   unitid ;
        private Object     updatepeople ;
        private Object  updatetime ;
        private Object   vehicleno ;
        private Object   vin ;

        public long getActualbegindate() {
            return actualbegindate;
        }

        public void setActualbegindate(long actualbegindate) {
            this.actualbegindate = actualbegindate;
        }

        public long getActualenddate() {
            return actualenddate;
        }

        public void setActualenddate(long actualenddate) {
            this.actualenddate = actualenddate;
        }

        public Object getBatchno() {
            return batchno;
        }

        public void setBatchno(Object batchno) {
            this.batchno = batchno;
        }

        public Object getCcisprint() {
            return ccisprint;
        }

        public void setCcisprint(Object ccisprint) {
            this.ccisprint = ccisprint;
        }

        public Object getCompanyid() {
            return companyid;
        }

        public void setCompanyid(Object companyid) {
            this.companyid = companyid;
        }

        public long getConfirmdate() {
            return confirmdate;
        }

        public void setConfirmdate(long confirmdate) {
            this.confirmdate = confirmdate;
        }

        public Object getCreatepeople() {
            return createpeople;
        }

        public void setCreatepeople(Object createpeople) {
            this.createpeople = createpeople;
        }

        public Object getCreatetime() {
            return createtime;
        }

        public void setCreatetime(Object createtime) {
            this.createtime = createtime;
        }

        public Object getDeparturestatus() {
            return departurestatus;
        }

        public void setDeparturestatus(Object departurestatus) {
            this.departurestatus = departurestatus;
        }

        public Object getDisporder() {
            return disporder;
        }

        public void setDisporder(Object disporder) {
            this.disporder = disporder;
        }

        public Object getInwarehousedate() {
            return inwarehousedate;
        }

        public void setInwarehousedate(Object inwarehousedate) {
            this.inwarehousedate = inwarehousedate;
        }

        public Object getInwarehouseperson() {
            return inwarehouseperson;
        }

        public void setInwarehouseperson(Object inwarehouseperson) {
            this.inwarehouseperson = inwarehouseperson;
        }

        public Object getIsbuildvin() {
            return isbuildvin;
        }

        public void setIsbuildvin(Object isbuildvin) {
            this.isbuildvin = isbuildvin;
        }

        public Object getIsfinish() {
            return isfinish;
        }

        public void setIsfinish(Object isfinish) {
            this.isfinish = isfinish;
        }

        public Object getIsinstorage() {
            return isinstorage;
        }

        public void setIsinstorage(Object isinstorage) {
            this.isinstorage = isinstorage;
        }

        public Object getOrdertype() {
            return ordertype;
        }

        public void setOrdertype(Object ordertype) {
            this.ordertype = ordertype;
        }

        public long getPlanbegindate() {
            return planbegindate;
        }

        public void setPlanbegindate(long planbegindate) {
            this.planbegindate = planbegindate;
        }

        public long getPlanenddate() {
            return planenddate;
        }

        public void setPlanenddate(long planenddate) {
            this.planenddate = planenddate;
        }

        public long getProdorderdetid() {
            return prodorderdetid;
        }

        public void setProdorderdetid(long prodorderdetid) {
            this.prodorderdetid = prodorderdetid;
        }

        public Object getProdorderno() {
            return prodorderno;
        }

        public void setProdorderno(Object prodorderno) {
            this.prodorderno = prodorderno;
        }

        public Object getProductionstages() {
            return productionstages;
        }

        public void setProductionstages(Object productionstages) {
            this.productionstages = productionstages;
        }

        public Object getProductmodel() {
            return productmodel;
        }

        public void setProductmodel(Object productmodel) {
            this.productmodel = productmodel;
        }

        public Object getProductstages() {
            return productstages;
        }

        public void setProductstages(Object productstages) {
            this.productstages = productstages;
        }

        public Object getQcisprint() {
            return qcisprint;
        }

        public void setQcisprint(Object qcisprint) {
            this.qcisprint = qcisprint;
        }

        public Object getSorderno() {
            return sorderno;
        }

        public void setSorderno(Object sorderno) {
            this.sorderno = sorderno;
        }

        public Object getStockallquality() {
            return stockallquality;
        }

        public void setStockallquality(Object stockallquality) {
            this.stockallquality = stockallquality;
        }

        public Object getStockaxisnumber() {
            return stockaxisnumber;
        }

        public void setStockaxisnumber(Object stockaxisnumber) {
            this.stockaxisnumber = stockaxisnumber;
        }

        public Object getStockbodytype() {
            return stockbodytype;
        }

        public void setStockbodytype(Object stockbodytype) {
            this.stockbodytype = stockbodytype;
        }

        public Object getStockbraketype() {
            return stockbraketype;
        }

        public void setStockbraketype(Object stockbraketype) {
            this.stockbraketype = stockbraketype;
        }

        public Object getStockcartype() {
            return stockcartype;
        }

        public void setStockcartype(Object stockcartype) {
            this.stockcartype = stockcartype;
        }

        public Object getStockcodes() {
            return stockcodes;
        }

        public void setStockcodes(Object stockcodes) {
            this.stockcodes = stockcodes;
        }

        public Object getStocktotalmass() {
            return stocktotalmass;
        }

        public void setStocktotalmass(Object stocktotalmass) {
            this.stocktotalmass = stocktotalmass;
        }

        public Object getStocktrailerlength() {
            return stocktrailerlength;
        }

        public void setStocktrailerlength(Object stocktrailerlength) {
            this.stocktrailerlength = stocktrailerlength;
        }

        public Object getStocktrailertype() {
            return stocktrailertype;
        }

        public void setStocktrailertype(Object stocktrailertype) {
            this.stocktrailertype = stocktrailertype;
        }

        public Object getUnitid() {
            return unitid;
        }

        public void setUnitid(Object unitid) {
            this.unitid = unitid;
        }

        public Object getUpdatepeople() {
            return updatepeople;
        }

        public void setUpdatepeople(Object updatepeople) {
            this.updatepeople = updatepeople;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public Object getVehicleno() {
            return vehicleno;
        }

        public void setVehicleno(Object vehicleno) {
            this.vehicleno = vehicleno;
        }

        public Object getVin() {
            return vin;
        }

        public void setVin(Object vin) {
            this.vin = vin;
        }
    }
}
