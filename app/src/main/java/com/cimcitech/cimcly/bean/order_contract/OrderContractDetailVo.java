package com.cimcitech.cimcly.bean.order_contract;

/**
 * Created by apple on 2017/8/12.
 */

public class OrderContractDetailVo {
    /**
     * data : {"afftercantilever":null,"allquality":null,"areaid":null,"arrivaldate":null,"axisnumber":null,"bodytype":null,"braketype":null,"carriercity":null,"cartype":null,"changeoption":null,"chassiscount":0,"chassismodel":"自带","codes":null,"companyid":null,"confirmdate":null,"contractTypeDesc":"列表","contractno":"Z17-00004","contracttype":null,"count":1,"createdate":null,"creator":null,"currency":"RMB","currencyDesc":"人民币","custName":"哈尔滨润成汽车销售有限公司","custTypeDesc":"经销商T","custid":1102,"custsigndate":null,"custsignperson":null,"deposit":20000,"depositAmount":null,"divison":null,"doctype":null,"dpprice":0,"enclosureid":null,"estimatedeliverydate":null,"fStateName":"审核通过","file":null,"financialprice":20500,"fstate":"FS05","handoffMoney":null,"hasFinish":null,"height":null,"isactive":null,"isbringchassis":"Y","isbringmaterial":"N","iscommit":"Y","isdeposit":null,"ishascodes":null,"isoverseasorder":null,"isperform":null,"issendmail":null,"isspecial":"F","isspecialdep":null,"issysncarinfo":null,"modifyby":null,"modifydate":null,"notFinish":null,"oalchturl":null,"opportNo":null,"opportid":null,"opportprice":null,"orderno":"2017404","ordertype":"OT01","orgid":null,"otherconventions":null,"owner":555555764,"ownerName":"张乐","ownmaterial":null,"paymentMethodDesc":"全款","paymentarrears":null,"paymentmethod":"PAM01","paymethod":null,"paymethodDesc":null,"prodtypecode":"CLY9407GYYD","productCategoryDesc":"液罐车","productVarietyDesc":"液罐半挂","productcategory":"PC01","productseries":null,"productvariety":"PV02","protocolPrice":205000,"quoteid":null,"receiptparty":null,"remark":null,"requiredate":null,"residual":185000,"residualAmount":null,"sapexecutestatus":null,"shipPartyName":"哈尔滨润成汽车销售有限公司","shipparty":"1102","signName":null,"signdate":1492992000000,"signperson":null,"signplace":"洛阳","singlePrice":205000,"singlemileage":null,"siteMethodDesc":"配送","sitecode":null,"sitemethod":"SM02","soldtoparty":null,"sorderid":5,"status":null,"strikeMoney":null,"subjects":null,"systemprice":189700,"technicalmemo":null,"technote":null,"totalmass":null,"totalprice":205000,"trailerlength":null,"trailertype":null,"vehiclelenth":null,"version":null,"wheelbase":null}
     * msg :
     * success : true
     */

    private DataBean data;
    private String msg;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * afftercantilever : null
         * allquality : null
         * areaid : null
         * arrivaldate : null
         * axisnumber : null
         * bodytype : null
         * braketype : null
         * carriercity : null
         * cartype : null
         * changeoption : null
         * chassiscount : 0
         * chassismodel : 自带
         * codes : null
         * companyid : null
         * confirmdate : null
         * contractTypeDesc : 列表
         * contractno : Z17-00004
         * contracttype : null
         * count : 1
         * createdate : null
         * creator : null
         * currency : RMB
         * currencyDesc : 人民币
         * custName : 哈尔滨润成汽车销售有限公司
         * custTypeDesc : 经销商T
         * custid : 1102
         * custsigndate : null
         * custsignperson : null
         * deposit : 20000.0
         * depositAmount : null
         * divison : null
         * doctype : null
         * dpprice : 0.0
         * enclosureid : null
         * estimatedeliverydate : null
         * fStateName : 审核通过
         * file : null
         * financialprice : 20500.0
         * fstate : FS05
         * handoffMoney : null
         * hasFinish : null
         * height : null
         * isactive : null
         * isbringchassis : Y
         * isbringmaterial : N
         * iscommit : Y
         * isdeposit : null
         * ishascodes : null
         * isoverseasorder : null
         * isperform : null
         * issendmail : null
         * isspecial : F
         * isspecialdep : null
         * issysncarinfo : null
         * modifyby : null
         * modifydate : null
         * notFinish : null
         * oalchturl : null
         * opportNo : null
         * opportid : null
         * opportprice : null
         * orderno : 2017404
         * ordertype : OT01
         * orgid : null
         * otherconventions : null
         * owner : 555555764
         * ownerName : 张乐
         * ownmaterial : null
         * paymentMethodDesc : 全款
         * paymentarrears : null
         * paymentmethod : PAM01
         * paymethod : null
         * paymethodDesc : null
         * prodtypecode : CLY9407GYYD
         * productCategoryDesc : 液罐车
         * productVarietyDesc : 液罐半挂
         * productcategory : PC01
         * productseries : null
         * productvariety : PV02
         * protocolPrice : 205000.0
         * quoteid : null
         * receiptparty : null
         * remark : null
         * requiredate : null
         * residual : 185000.0
         * residualAmount : null
         * sapexecutestatus : null
         * shipPartyName : 哈尔滨润成汽车销售有限公司
         * shipparty : 1102
         * signName : null
         * signdate : 1492992000000
         * signperson : null
         * signplace : 洛阳
         * singlePrice : 205000.0
         * singlemileage : null
         * siteMethodDesc : 配送
         * sitecode : null
         * sitemethod : SM02
         * soldtoparty : null
         * sorderid : 5
         * status : null
         * strikeMoney : null
         * subjects : null
         * systemprice : 189700.0
         * technicalmemo : null
         * technote : null
         * totalmass : null
         * totalprice : 205000.0
         * trailerlength : null
         * trailertype : null
         * vehiclelenth : null
         * version : null
         * wheelbase : null
         */

        private String orderTypeDesc;
        private Object afftercantilever;
        private Object allquality;
        private Object areaid;
        private Object arrivaldate;
        private Object axisnumber;
        private Object bodytype;
        private Object braketype;
        private Object carriercity;
        private Object cartype;
        private Object changeoption;
        private int chassiscount;
        private String chassismodel;
        private Object codes;
        private Object companyid;
        private Object confirmdate;
        private String contractTypeDesc;
        private String contractno;
        private Object contracttype;
        private int count;
        private Object createdate;
        private Object creator;
        private String currency;
        private String currencyDesc;
        private String custName;
        private String custTypeDesc;
        private int custid;
        private Object custsigndate;
        private Object custsignperson;
        private double deposit;
        private Object depositAmount;
        private Object divison;
        private Object doctype;
        private double dpprice;
        private Object enclosureid;
        private long estimatedeliverydate;
        private String fStateName;
        private Object file;
        private double financialprice;
        private String fstate;
        private Object handoffMoney;
        private Object hasFinish;
        private Object height;
        private Object isactive;
        private String isbringchassis;
        private String isbringmaterial;
        private String iscommit;
        private Object isdeposit;
        private Object ishascodes;
        private Object isoverseasorder;
        private Object isperform;
        private Object issendmail;
        private String isspecial;
        private Object isspecialdep;
        private Object issysncarinfo;
        private Object modifyby;
        private Object modifydate;
        private Object notFinish;
        private Object oalchturl;
        private Object opportNo;
        private Object opportid;
        private Object opportprice;
        private String orderno;
        private String ordertype;
        private Object orgid;
        private Object otherconventions;
        private int owner;
        private String ownerName;
        private Object ownmaterial;
        private String paymentMethodDesc;
        private Object paymentarrears;
        private String paymentmethod;
        private Object paymethod;
        private Object paymethodDesc;
        private String prodtypecode;
        private String productCategoryDesc;
        private String productVarietyDesc;
        private String productcategory;
        private Object productseries;
        private String productvariety;
        private double protocolPrice;
        private Object quoteid;
        private Object receiptparty;
        private Object remark;
        private Object requiredate;
        private double residual;
        private Object residualAmount;
        private Object sapexecutestatus;
        private String shipPartyName;
        private String shipparty;
        private Object signName;
        private long signdate;
        private Object signperson;
        private String signplace;
        private double singlePrice;
        private Object singlemileage;
        private String siteMethodDesc;
        private Object sitecode;
        private String sitemethod;
        private Object soldtoparty;
        private int sorderid;
        private Object status;
        private Object strikeMoney;
        private Object subjects;
        private double systemprice;
        private Object technicalmemo;
        private Object technote;
        private Object totalmass;
        private double totalprice;
        private Object trailerlength;
        private Object trailertype;
        private Object vehiclelenth;
        private Object version;
        private Object wheelbase;

        public Object getAfftercantilever() {
            return afftercantilever;
        }

        public void setAfftercantilever(Object afftercantilever) {
            this.afftercantilever = afftercantilever;
        }

        public Object getAllquality() {
            return allquality;
        }

        public void setAllquality(Object allquality) {
            this.allquality = allquality;
        }

        public Object getAreaid() {
            return areaid;
        }

        public void setAreaid(Object areaid) {
            this.areaid = areaid;
        }

        public Object getArrivaldate() {
            return arrivaldate;
        }

        public void setArrivaldate(Object arrivaldate) {
            this.arrivaldate = arrivaldate;
        }

        public Object getAxisnumber() {
            return axisnumber;
        }

        public void setAxisnumber(Object axisnumber) {
            this.axisnumber = axisnumber;
        }

        public Object getBodytype() {
            return bodytype;
        }

        public void setBodytype(Object bodytype) {
            this.bodytype = bodytype;
        }

        public Object getBraketype() {
            return braketype;
        }

        public void setBraketype(Object braketype) {
            this.braketype = braketype;
        }

        public Object getCarriercity() {
            return carriercity;
        }

        public void setCarriercity(Object carriercity) {
            this.carriercity = carriercity;
        }

        public Object getCartype() {
            return cartype;
        }

        public void setCartype(Object cartype) {
            this.cartype = cartype;
        }

        public Object getChangeoption() {
            return changeoption;
        }

        public void setChangeoption(Object changeoption) {
            this.changeoption = changeoption;
        }

        public int getChassiscount() {
            return chassiscount;
        }

        public void setChassiscount(int chassiscount) {
            this.chassiscount = chassiscount;
        }

        public String getChassismodel() {
            return chassismodel;
        }

        public void setChassismodel(String chassismodel) {
            this.chassismodel = chassismodel;
        }

        public Object getCodes() {
            return codes;
        }

        public void setCodes(Object codes) {
            this.codes = codes;
        }

        public Object getCompanyid() {
            return companyid;
        }

        public void setCompanyid(Object companyid) {
            this.companyid = companyid;
        }

        public Object getConfirmdate() {
            return confirmdate;
        }

        public void setConfirmdate(Object confirmdate) {
            this.confirmdate = confirmdate;
        }

        public String getContractTypeDesc() {
            return contractTypeDesc;
        }

        public void setContractTypeDesc(String contractTypeDesc) {
            this.contractTypeDesc = contractTypeDesc;
        }

        public String getContractno() {
            return contractno;
        }

        public void setContractno(String contractno) {
            this.contractno = contractno;
        }

        public Object getContracttype() {
            return contracttype;
        }

        public void setContracttype(Object contracttype) {
            this.contracttype = contracttype;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Object getCreatedate() {
            return createdate;
        }

        public void setCreatedate(Object createdate) {
            this.createdate = createdate;
        }

        public Object getCreator() {
            return creator;
        }

        public void setCreator(Object creator) {
            this.creator = creator;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCurrencyDesc() {
            return currencyDesc;
        }

        public void setCurrencyDesc(String currencyDesc) {
            this.currencyDesc = currencyDesc;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getCustTypeDesc() {
            return custTypeDesc;
        }

        public void setCustTypeDesc(String custTypeDesc) {
            this.custTypeDesc = custTypeDesc;
        }

        public int getCustid() {
            return custid;
        }

        public void setCustid(int custid) {
            this.custid = custid;
        }

        public Object getCustsigndate() {
            return custsigndate;
        }

        public void setCustsigndate(Object custsigndate) {
            this.custsigndate = custsigndate;
        }

        public Object getCustsignperson() {
            return custsignperson;
        }

        public void setCustsignperson(Object custsignperson) {
            this.custsignperson = custsignperson;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public Object getDepositAmount() {
            return depositAmount;
        }

        public void setDepositAmount(Object depositAmount) {
            this.depositAmount = depositAmount;
        }

        public Object getDivison() {
            return divison;
        }

        public void setDivison(Object divison) {
            this.divison = divison;
        }

        public Object getDoctype() {
            return doctype;
        }

        public void setDoctype(Object doctype) {
            this.doctype = doctype;
        }

        public double getDpprice() {
            return dpprice;
        }

        public void setDpprice(double dpprice) {
            this.dpprice = dpprice;
        }

        public Object getEnclosureid() {
            return enclosureid;
        }

        public void setEnclosureid(Object enclosureid) {
            this.enclosureid = enclosureid;
        }

        public long getEstimatedeliverydate() {
            return estimatedeliverydate;
        }

        public void setEstimatedeliverydate(long estimatedeliverydate) {
            this.estimatedeliverydate = estimatedeliverydate;
        }

        public String getFStateName() {
            return fStateName;
        }

        public void setFStateName(String fStateName) {
            this.fStateName = fStateName;
        }

        public Object getFile() {
            return file;
        }

        public void setFile(Object file) {
            this.file = file;
        }

        public double getFinancialprice() {
            return financialprice;
        }

        public void setFinancialprice(double financialprice) {
            this.financialprice = financialprice;
        }

        public String getFstate() {
            return fstate;
        }

        public void setFstate(String fstate) {
            this.fstate = fstate;
        }

        public Object getHandoffMoney() {
            return handoffMoney;
        }

        public void setHandoffMoney(Object handoffMoney) {
            this.handoffMoney = handoffMoney;
        }

        public Object getHasFinish() {
            return hasFinish;
        }

        public void setHasFinish(Object hasFinish) {
            this.hasFinish = hasFinish;
        }

        public Object getHeight() {
            return height;
        }

        public void setHeight(Object height) {
            this.height = height;
        }

        public Object getIsactive() {
            return isactive;
        }

        public void setIsactive(Object isactive) {
            this.isactive = isactive;
        }

        public String getIsbringchassis() {
            return isbringchassis;
        }

        public void setIsbringchassis(String isbringchassis) {
            this.isbringchassis = isbringchassis;
        }

        public String getIsbringmaterial() {
            return isbringmaterial;
        }

        public void setIsbringmaterial(String isbringmaterial) {
            this.isbringmaterial = isbringmaterial;
        }

        public String getIscommit() {
            return iscommit;
        }

        public void setIscommit(String iscommit) {
            this.iscommit = iscommit;
        }

        public Object getIsdeposit() {
            return isdeposit;
        }

        public void setIsdeposit(Object isdeposit) {
            this.isdeposit = isdeposit;
        }

        public Object getIshascodes() {
            return ishascodes;
        }

        public void setIshascodes(Object ishascodes) {
            this.ishascodes = ishascodes;
        }

        public Object getIsoverseasorder() {
            return isoverseasorder;
        }

        public void setIsoverseasorder(Object isoverseasorder) {
            this.isoverseasorder = isoverseasorder;
        }

        public Object getIsperform() {
            return isperform;
        }

        public void setIsperform(Object isperform) {
            this.isperform = isperform;
        }

        public Object getIssendmail() {
            return issendmail;
        }

        public void setIssendmail(Object issendmail) {
            this.issendmail = issendmail;
        }

        public String getIsspecial() {
            return isspecial;
        }

        public void setIsspecial(String isspecial) {
            this.isspecial = isspecial;
        }

        public Object getIsspecialdep() {
            return isspecialdep;
        }

        public void setIsspecialdep(Object isspecialdep) {
            this.isspecialdep = isspecialdep;
        }

        public Object getIssysncarinfo() {
            return issysncarinfo;
        }

        public void setIssysncarinfo(Object issysncarinfo) {
            this.issysncarinfo = issysncarinfo;
        }

        public Object getModifyby() {
            return modifyby;
        }

        public void setModifyby(Object modifyby) {
            this.modifyby = modifyby;
        }

        public Object getModifydate() {
            return modifydate;
        }

        public void setModifydate(Object modifydate) {
            this.modifydate = modifydate;
        }

        public Object getNotFinish() {
            return notFinish;
        }

        public void setNotFinish(Object notFinish) {
            this.notFinish = notFinish;
        }

        public Object getOalchturl() {
            return oalchturl;
        }

        public void setOalchturl(Object oalchturl) {
            this.oalchturl = oalchturl;
        }

        public Object getOpportNo() {
            return opportNo;
        }

        public void setOpportNo(Object opportNo) {
            this.opportNo = opportNo;
        }

        public Object getOpportid() {
            return opportid;
        }

        public void setOpportid(Object opportid) {
            this.opportid = opportid;
        }

        public Object getOpportprice() {
            return opportprice;
        }

        public void setOpportprice(Object opportprice) {
            this.opportprice = opportprice;
        }

        public String getOrderno() {
            return orderno;
        }

        public void setOrderno(String orderno) {
            this.orderno = orderno;
        }

        public String getOrdertype() {
            return ordertype;
        }

        public void setOrdertype(String ordertype) {
            this.ordertype = ordertype;
        }

        public Object getOrgid() {
            return orgid;
        }

        public void setOrgid(Object orgid) {
            this.orgid = orgid;
        }

        public Object getOtherconventions() {
            return otherconventions;
        }

        public void setOtherconventions(Object otherconventions) {
            this.otherconventions = otherconventions;
        }

        public int getOwner() {
            return owner;
        }

        public void setOwner(int owner) {
            this.owner = owner;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public Object getOwnmaterial() {
            return ownmaterial;
        }

        public void setOwnmaterial(Object ownmaterial) {
            this.ownmaterial = ownmaterial;
        }

        public String getPaymentMethodDesc() {
            return paymentMethodDesc;
        }

        public void setPaymentMethodDesc(String paymentMethodDesc) {
            this.paymentMethodDesc = paymentMethodDesc;
        }

        public Object getPaymentarrears() {
            return paymentarrears;
        }

        public void setPaymentarrears(Object paymentarrears) {
            this.paymentarrears = paymentarrears;
        }

        public String getPaymentmethod() {
            return paymentmethod;
        }

        public void setPaymentmethod(String paymentmethod) {
            this.paymentmethod = paymentmethod;
        }

        public Object getPaymethod() {
            return paymethod;
        }

        public void setPaymethod(Object paymethod) {
            this.paymethod = paymethod;
        }

        public Object getPaymethodDesc() {
            return paymethodDesc;
        }

        public void setPaymethodDesc(Object paymethodDesc) {
            this.paymethodDesc = paymethodDesc;
        }

        public String getProdtypecode() {
            return prodtypecode;
        }

        public void setProdtypecode(String prodtypecode) {
            this.prodtypecode = prodtypecode;
        }

        public String getProductCategoryDesc() {
            return productCategoryDesc;
        }

        public void setProductCategoryDesc(String productCategoryDesc) {
            this.productCategoryDesc = productCategoryDesc;
        }

        public String getProductVarietyDesc() {
            return productVarietyDesc;
        }

        public void setProductVarietyDesc(String productVarietyDesc) {
            this.productVarietyDesc = productVarietyDesc;
        }

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        public Object getProductseries() {
            return productseries;
        }

        public void setProductseries(Object productseries) {
            this.productseries = productseries;
        }

        public String getProductvariety() {
            return productvariety;
        }

        public void setProductvariety(String productvariety) {
            this.productvariety = productvariety;
        }

        public double getProtocolPrice() {
            return protocolPrice;
        }

        public void setProtocolPrice(double protocolPrice) {
            this.protocolPrice = protocolPrice;
        }

        public Object getQuoteid() {
            return quoteid;
        }

        public void setQuoteid(Object quoteid) {
            this.quoteid = quoteid;
        }

        public Object getReceiptparty() {
            return receiptparty;
        }

        public void setReceiptparty(Object receiptparty) {
            this.receiptparty = receiptparty;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getRequiredate() {
            return requiredate;
        }

        public void setRequiredate(Object requiredate) {
            this.requiredate = requiredate;
        }

        public double getResidual() {
            return residual;
        }

        public void setResidual(double residual) {
            this.residual = residual;
        }

        public Object getResidualAmount() {
            return residualAmount;
        }

        public void setResidualAmount(Object residualAmount) {
            this.residualAmount = residualAmount;
        }

        public Object getSapexecutestatus() {
            return sapexecutestatus;
        }

        public void setSapexecutestatus(Object sapexecutestatus) {
            this.sapexecutestatus = sapexecutestatus;
        }

        public String getShipPartyName() {
            return shipPartyName;
        }

        public void setShipPartyName(String shipPartyName) {
            this.shipPartyName = shipPartyName;
        }

        public String getShipparty() {
            return shipparty;
        }

        public void setShipparty(String shipparty) {
            this.shipparty = shipparty;
        }

        public Object getSignName() {
            return signName;
        }

        public void setSignName(Object signName) {
            this.signName = signName;
        }

        public long getSigndate() {
            return signdate;
        }

        public void setSigndate(long signdate) {
            this.signdate = signdate;
        }

        public Object getSignperson() {
            return signperson;
        }

        public void setSignperson(Object signperson) {
            this.signperson = signperson;
        }

        public String getSignplace() {
            return signplace;
        }

        public void setSignplace(String signplace) {
            this.signplace = signplace;
        }

        public double getSinglePrice() {
            return singlePrice;
        }

        public void setSinglePrice(double singlePrice) {
            this.singlePrice = singlePrice;
        }

        public Object getSinglemileage() {
            return singlemileage;
        }

        public void setSinglemileage(Object singlemileage) {
            this.singlemileage = singlemileage;
        }

        public String getSiteMethodDesc() {
            return siteMethodDesc;
        }

        public void setSiteMethodDesc(String siteMethodDesc) {
            this.siteMethodDesc = siteMethodDesc;
        }

        public Object getSitecode() {
            return sitecode;
        }

        public void setSitecode(Object sitecode) {
            this.sitecode = sitecode;
        }

        public String getSitemethod() {
            return sitemethod;
        }

        public void setSitemethod(String sitemethod) {
            this.sitemethod = sitemethod;
        }

        public Object getSoldtoparty() {
            return soldtoparty;
        }

        public void setSoldtoparty(Object soldtoparty) {
            this.soldtoparty = soldtoparty;
        }

        public int getSorderid() {
            return sorderid;
        }

        public void setSorderid(int sorderid) {
            this.sorderid = sorderid;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getStrikeMoney() {
            return strikeMoney;
        }

        public void setStrikeMoney(Object strikeMoney) {
            this.strikeMoney = strikeMoney;
        }

        public Object getSubjects() {
            return subjects;
        }

        public void setSubjects(Object subjects) {
            this.subjects = subjects;
        }

        public double getSystemprice() {
            return systemprice;
        }

        public void setSystemprice(double systemprice) {
            this.systemprice = systemprice;
        }

        public Object getTechnicalmemo() {
            return technicalmemo;
        }

        public void setTechnicalmemo(Object technicalmemo) {
            this.technicalmemo = technicalmemo;
        }

        public Object getTechnote() {
            return technote;
        }

        public void setTechnote(Object technote) {
            this.technote = technote;
        }

        public Object getTotalmass() {
            return totalmass;
        }

        public void setTotalmass(Object totalmass) {
            this.totalmass = totalmass;
        }

        public double getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(double totalprice) {
            this.totalprice = totalprice;
        }

        public Object getTrailerlength() {
            return trailerlength;
        }

        public void setTrailerlength(Object trailerlength) {
            this.trailerlength = trailerlength;
        }

        public Object getTrailertype() {
            return trailertype;
        }

        public void setTrailertype(Object trailertype) {
            this.trailertype = trailertype;
        }

        public Object getVehiclelenth() {
            return vehiclelenth;
        }

        public void setVehiclelenth(Object vehiclelenth) {
            this.vehiclelenth = vehiclelenth;
        }

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public Object getWheelbase() {
            return wheelbase;
        }

        public void setWheelbase(Object wheelbase) {
            this.wheelbase = wheelbase;
        }

        public String getOrderTypeDesc() {
            return orderTypeDesc;
        }

        public void setOrderTypeDesc(String orderTypeDesc) {
            this.orderTypeDesc = orderTypeDesc;
        }

        public String getfStateName() {
            return fStateName;
        }

        public void setfStateName(String fStateName) {
            this.fStateName = fStateName;
        }
    }
}
