package com.cimcitech.cimcly.bean.opport_unit;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class OpportUnitVo {


    /**
     * data : {"opportAmountTotal":0,"opportCount":0,"orderAmountTotal":0,"orderCount":0,"pageInfo":{"endRow":8,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"cityName":"北京市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"中工工程机械成套有限公司","custid":5482,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":390,"opportno":"17894273","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GRY","productvariety":"PV01","remark":"1","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"西安市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"陕西重型汽车有限公司（环卫产品）","custid":5795,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":391,"opportno":"17-000001","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490659200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GYY","productvariety":"PV01","remark":null,"stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"遵义市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"贵州源岭汽车贸易有限责任公司","custid":5437,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":392,"opportno":"17-","opportsubject":"2","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":2,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5251GYY","productvariety":"PV01","remark":"2","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"12","modifyby":null,"modifydate":null,"opportid":393,"opportno":"17-00000","opportsubject":"测试编号","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":99999,"plansigndate":1490832000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5250GRY","productvariety":"PV01","remark":"12","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":394,"opportno":"000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1490140800000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"112","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"123","modifyby":null,"modifydate":null,"opportid":395,"opportno":"17-000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":22,"plansigndate":1489449600000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":22,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"rty","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"昆明市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"刘玉伟","custid":5815,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":396,"opportno":"17244765","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1489104000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5310GRY","productvariety":"PV01","remark":"t","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":397,"opportno":"17-000003","opportsubject":"ceshi","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY9405GYYA","productvariety":"PV01","remark":"2","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":8,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":10,"pages":1,"prePage":0,"size":8,"startRow":1,"total":8}}
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
         * opportAmountTotal : 0
         * opportCount : 0
         * orderAmountTotal : 0
         * orderCount : 0
         * pageInfo : {"endRow":8,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"cityName":"北京市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"中工工程机械成套有限公司","custid":5482,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":390,"opportno":"17894273","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GRY","productvariety":"PV01","remark":"1","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"西安市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"陕西重型汽车有限公司（环卫产品）","custid":5795,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":391,"opportno":"17-000001","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490659200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GYY","productvariety":"PV01","remark":null,"stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"遵义市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"贵州源岭汽车贸易有限责任公司","custid":5437,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":392,"opportno":"17-","opportsubject":"2","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":2,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5251GYY","productvariety":"PV01","remark":"2","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"12","modifyby":null,"modifydate":null,"opportid":393,"opportno":"17-00000","opportsubject":"测试编号","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":99999,"plansigndate":1490832000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5250GRY","productvariety":"PV01","remark":"12","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":394,"opportno":"000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1490140800000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"112","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"123","modifyby":null,"modifydate":null,"opportid":395,"opportno":"17-000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":22,"plansigndate":1489449600000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":22,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"rty","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"昆明市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"刘玉伟","custid":5815,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":396,"opportno":"17244765","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1489104000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5310GRY","productvariety":"PV01","remark":"t","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":397,"opportno":"17-000003","opportsubject":"ceshi","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY9405GYYA","productvariety":"PV01","remark":"2","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":8,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":10,"pages":1,"prePage":0,"size":8,"startRow":1,"total":8}
         */

        private int opportAmountTotal;
        private int opportCount;
        private int orderAmountTotal;
        private int orderCount;
        private PageInfoBean pageInfo;

        public int getOpportAmountTotal() {
            return opportAmountTotal;
        }

        public void setOpportAmountTotal(int opportAmountTotal) {
            this.opportAmountTotal = opportAmountTotal;
        }

        public int getOpportCount() {
            return opportCount;
        }

        public void setOpportCount(int opportCount) {
            this.opportCount = opportCount;
        }

        public int getOrderAmountTotal() {
            return orderAmountTotal;
        }

        public void setOrderAmountTotal(int orderAmountTotal) {
            this.orderAmountTotal = orderAmountTotal;
        }

        public int getOrderCount() {
            return orderCount;
        }

        public void setOrderCount(int orderCount) {
            this.orderCount = orderCount;
        }

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public static class PageInfoBean {
            /**
             * endRow : 8
             * firstPage : 1
             * hasNextPage : false
             * hasPreviousPage : false
             * isFirstPage : true
             * isLastPage : true
             * lastPage : 1
             * list : [{"cityName":"北京市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"中工工程机械成套有限公司","custid":5482,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":390,"opportno":"17894273","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GRY","productvariety":"PV01","remark":"1","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"西安市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"陕西重型汽车有限公司（环卫产品）","custid":5795,"custstatus":null,"detail":"1","modifyby":null,"modifydate":null,"opportid":391,"opportno":"17-000001","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490659200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY5251GYY","productvariety":"PV01","remark":null,"stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"遵义市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"贵州源岭汽车贸易有限责任公司","custid":5437,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":392,"opportno":"17-","opportsubject":"2","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":2,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5251GYY","productvariety":"PV01","remark":"2","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"12","modifyby":null,"modifydate":null,"opportid":393,"opportno":"17-00000","opportsubject":"测试编号","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":99999,"plansigndate":1490832000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5250GRY","productvariety":"PV01","remark":"12","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":394,"opportno":"000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1490140800000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":11,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"112","stage":"ST01","stageValue":"初期跟踪","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"123","modifyby":null,"modifydate":null,"opportid":395,"opportno":"17-000002","opportsubject":"1111","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":22,"plansigndate":1489449600000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":22,"productid":"CLY5251GYYA","productvariety":"PV01","remark":"rty","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"昆明市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"刘玉伟","custid":5815,"custstatus":null,"detail":"2","modifyby":null,"modifydate":null,"opportid":396,"opportno":"17244765","opportsubject":"1","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":111,"plansigndate":1489104000000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":2,"productid":"CLY5310GRY","productvariety":"PV01","remark":"t","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"},{"cityName":"本溪市","companyid":null,"contactId":null,"createdate":1489104000000,"creator":555555954,"currency":"RMB","currentStageValue":"已转订单合同","currentstage":"CS03","custName":"本溪市平安车业有限责任公司","custid":6307,"custstatus":null,"detail":"111","modifyby":null,"modifydate":null,"opportid":397,"opportno":"17-000003","opportsubject":"ceshi","opporttype":"OT01","ordersource":null,"orgid":null,"paymentmethod":"PAM01","planmoney":1,"plansigndate":1490227200000,"possibility":"PS01","possibilityValue":"低","productCategoryName":"液罐车","productcategory":"PC01","productcount":1,"productid":"CLY9405GYYA","productvariety":"PV01","remark":"2","stage":"ST02","stageValue":"意向跟进","status":"T","unitid":null,"userName":"李青松"}]
             * navigateFirstPage : 1
             * navigateLastPage : 1
             * navigatePages : 8
             * navigatepageNums : [1]
             * nextPage : 0
             * pageNum : 1
             * pageSize : 10
             * pages : 1
             * prePage : 0
             * size : 8
             * startRow : 1
             * total : 8
             */

            private int endRow;
            private int firstPage;
            private boolean hasNextPage;
            private boolean hasPreviousPage;
            private boolean isFirstPage;
            private boolean isLastPage;
            private int lastPage;
            private int navigateFirstPage;
            private int navigateLastPage;
            private int navigatePages;
            private int nextPage;
            private int pageNum;
            private int pageSize;
            private int pages;
            private int prePage;
            private int size;
            private int startRow;
            private int total;
            private List<ListBean> list;
            private List<Integer> navigatepageNums;

            public int getEndRow() {
                return endRow;
            }

            public void setEndRow(int endRow) {
                this.endRow = endRow;
            }

            public int getFirstPage() {
                return firstPage;
            }

            public void setFirstPage(int firstPage) {
                this.firstPage = firstPage;
            }

            public boolean isHasNextPage() {
                return hasNextPage;
            }

            public void setHasNextPage(boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
            }

            public boolean isHasPreviousPage() {
                return hasPreviousPage;
            }

            public void setHasPreviousPage(boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
            }

            public boolean isIsFirstPage() {
                return isFirstPage;
            }

            public void setIsFirstPage(boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
            }

            public boolean isIsLastPage() {
                return isLastPage;
            }

            public void setIsLastPage(boolean isLastPage) {
                this.isLastPage = isLastPage;
            }

            public int getLastPage() {
                return lastPage;
            }

            public void setLastPage(int lastPage) {
                this.lastPage = lastPage;
            }

            public int getNavigateFirstPage() {
                return navigateFirstPage;
            }

            public void setNavigateFirstPage(int navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
            }

            public int getNavigateLastPage() {
                return navigateLastPage;
            }

            public void setNavigateLastPage(int navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
            }

            public int getNavigatePages() {
                return navigatePages;
            }

            public void setNavigatePages(int navigatePages) {
                this.navigatePages = navigatePages;
            }

            public int getNextPage() {
                return nextPage;
            }

            public void setNextPage(int nextPage) {
                this.nextPage = nextPage;
            }

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getPages() {
                return pages;
            }

            public void setPages(int pages) {
                this.pages = pages;
            }

            public int getPrePage() {
                return prePage;
            }

            public void setPrePage(int prePage) {
                this.prePage = prePage;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getStartRow() {
                return startRow;
            }

            public void setStartRow(int startRow) {
                this.startRow = startRow;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public List<Integer> getNavigatepageNums() {
                return navigatepageNums;
            }

            public void setNavigatepageNums(List<Integer> navigatepageNums) {
                this.navigatepageNums = navigatepageNums;
            }

            public static class ListBean {
                /**
                 * cityName : 北京市
                 * companyid : null
                 * contactId : null
                 * createdate : 1489104000000
                 * creator : 555555954
                 * currency : RMB
                 * currentStageValue : 已转订单合同
                 * currentstage : CS03
                 * custName : 中工工程机械成套有限公司
                 * custid : 5482
                 * custstatus : null
                 * detail : 1
                 * modifyby : null
                 * modifydate : null
                 * opportid : 390
                 * opportno : 17894273
                 * opportsubject : 1
                 * opporttype : OT01
                 * ordersource : null
                 * orgid : null
                 * paymentmethod : PAM01
                 * planmoney : 1
                 * plansigndate : 1490227200000
                 * possibility : PS01
                 * possibilityValue : 低
                 * productCategoryName : 液罐车
                 * productcategory : PC01
                 * productcount : 1
                 * productid : CLY5251GRY
                 * productvariety : PV01
                 * remark : 1
                 * stage : ST01
                 * stageValue : 初期跟踪
                 * status : T
                 * unitid : null
                 * userName : 李青松
                 */

                private String cityName;
                private Object companyid;
                private Object contactId;
                private long createdate;
                private int creator;
                private String currency;
                private String currentStageValue;
                private String currentstage;
                private String custName;
                private int custid;
                private Object custstatus;
                private String detail;
                private Object modifyby;
                private Object modifydate;
                private int opportid;
                private String opportno;
                private String opportsubject;
                private String opporttype;
                private Object ordersource;
                private Object orgid;
                private String paymentmethod;
                private int planmoney;
                private long plansigndate;
                private String possibility;
                private String possibilityValue;
                private String productCategoryName;
                private String productcategory;
                private int productcount;
                private String productid;
                private String productvariety;
                private String remark;
                private String stage;
                private String stageValue;
                private String status;
                private Object unitid;
                private String userName;

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public Object getCompanyid() {
                    return companyid;
                }

                public void setCompanyid(Object companyid) {
                    this.companyid = companyid;
                }

                public Object getContactId() {
                    return contactId;
                }

                public void setContactId(Object contactId) {
                    this.contactId = contactId;
                }

                public long getCreatedate() {
                    return createdate;
                }

                public void setCreatedate(long createdate) {
                    this.createdate = createdate;
                }

                public int getCreator() {
                    return creator;
                }

                public void setCreator(int creator) {
                    this.creator = creator;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }

                public String getCurrentStageValue() {
                    return currentStageValue;
                }

                public void setCurrentStageValue(String currentStageValue) {
                    this.currentStageValue = currentStageValue;
                }

                public String getCurrentstage() {
                    return currentstage;
                }

                public void setCurrentstage(String currentstage) {
                    this.currentstage = currentstage;
                }

                public String getCustName() {
                    return custName;
                }

                public void setCustName(String custName) {
                    this.custName = custName;
                }

                public int getCustid() {
                    return custid;
                }

                public void setCustid(int custid) {
                    this.custid = custid;
                }

                public Object getCuststatus() {
                    return custstatus;
                }

                public void setCuststatus(Object custstatus) {
                    this.custstatus = custstatus;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
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

                public int getOpportid() {
                    return opportid;
                }

                public void setOpportid(int opportid) {
                    this.opportid = opportid;
                }

                public String getOpportno() {
                    return opportno;
                }

                public void setOpportno(String opportno) {
                    this.opportno = opportno;
                }

                public String getOpportsubject() {
                    return opportsubject;
                }

                public void setOpportsubject(String opportsubject) {
                    this.opportsubject = opportsubject;
                }

                public String getOpporttype() {
                    return opporttype;
                }

                public void setOpporttype(String opporttype) {
                    this.opporttype = opporttype;
                }

                public Object getOrdersource() {
                    return ordersource;
                }

                public void setOrdersource(Object ordersource) {
                    this.ordersource = ordersource;
                }

                public Object getOrgid() {
                    return orgid;
                }

                public void setOrgid(Object orgid) {
                    this.orgid = orgid;
                }

                public String getPaymentmethod() {
                    return paymentmethod;
                }

                public void setPaymentmethod(String paymentmethod) {
                    this.paymentmethod = paymentmethod;
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

                public String getPossibilityValue() {
                    return possibilityValue;
                }

                public void setPossibilityValue(String possibilityValue) {
                    this.possibilityValue = possibilityValue;
                }

                public String getProductCategoryName() {
                    return productCategoryName;
                }

                public void setProductCategoryName(String productCategoryName) {
                    this.productCategoryName = productCategoryName;
                }

                public String getProductcategory() {
                    return productcategory;
                }

                public void setProductcategory(String productcategory) {
                    this.productcategory = productcategory;
                }

                public int getProductcount() {
                    return productcount;
                }

                public void setProductcount(int productcount) {
                    this.productcount = productcount;
                }

                public String getProductid() {
                    return productid;
                }

                public void setProductid(String productid) {
                    this.productid = productid;
                }

                public String getProductvariety() {
                    return productvariety;
                }

                public void setProductvariety(String productvariety) {
                    this.productvariety = productvariety;
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

                public String getStageValue() {
                    return stageValue;
                }

                public void setStageValue(String stageValue) {
                    this.stageValue = stageValue;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public Object getUnitid() {
                    return unitid;
                }

                public void setUnitid(Object unitid) {
                    this.unitid = unitid;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }
            }
        }
    }
}
