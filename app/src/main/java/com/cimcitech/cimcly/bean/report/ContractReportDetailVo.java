package com.cimcitech.cimcly.bean.report;

import com.cimcitech.cimcly.bean.opport_unit.OpportUnitVo;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/4.
 */

public class ContractReportDetailVo {
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
        private boolean hasNextPage;
        private boolean isLastPage;
        private int lastPage;
        private int pages;
        private int total;
        private List<PageInfoBean> list;

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }

        public boolean isLastPage() {
            return isLastPage;
        }

        public void setLastPage(boolean lastPage) {
            isLastPage = lastPage;
        }

        public int getLastPage() {
            return lastPage;
        }

        public void setLastPage(int lastPage) {
            this.lastPage = lastPage;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<PageInfoBean> getList() {
            return list;
        }

        public void setList(List<PageInfoBean> list) {
            this.list = list;
        }

        public static class PageInfoBean {
            private int sorderid;
            private int opportid;
            private String contractno;
            private String orderno;
            private int custid;
            private String custName;
            private double totalprice;
            private String signName;
            private long confirmDate;
            private String sitecode;
            private String fstate;
            private String fStateName;
            private String iscommit;
            private double deposit;
            private int count;
            private String prodtypecode;
            private String productVarietyDesc;
            private String contractTypeDesc;
            private long signdate;
            private String ownerName;

            public int getSorderid() {
                return sorderid;
            }

            public void setSorderid(int sorderid) {
                this.sorderid = sorderid;
            }

            public int getOpportid() {
                return opportid;
            }

            public void setOpportid(int opportid) {
                this.opportid = opportid;
            }

            public String getContractno() {
                return contractno;
            }

            public void setContractno(String contractno) {
                this.contractno = contractno;
            }

            public String getOrderno() {
                return orderno;
            }

            public void setOrderno(String orderno) {
                this.orderno = orderno;
            }

            public int getCustid() {
                return custid;
            }

            public void setCustid(int custid) {
                this.custid = custid;
            }

            public String getCustName() {
                return custName;
            }

            public void setCustName(String custName) {
                this.custName = custName;
            }

            public double getTotalprice() {
                return totalprice;
            }

            public void setTotalprice(double totalprice) {
                this.totalprice = totalprice;
            }

            public String getSignName() {
                return signName;
            }

            public void setSignName(String signName) {
                this.signName = signName;
            }

            public long getConfirmDate() {
                return confirmDate;
            }

            public void setConfirmDate(long confirmDate) {
                this.confirmDate = confirmDate;
            }

            public String getSitecode() {
                return sitecode;
            }

            public void setSitecode(String sitecode) {
                this.sitecode = sitecode;
            }

            public String getFstate() {
                return fstate;
            }

            public void setFstate(String fstate) {
                this.fstate = fstate;
            }

            public String getfStateName() {
                return fStateName;
            }

            public void setfStateName(String fStateName) {
                this.fStateName = fStateName;
            }

            public String getIscommit() {
                return iscommit;
            }

            public void setIscommit(String iscommit) {
                this.iscommit = iscommit;
            }

            public double getDeposit() {
                return deposit;
            }

            public void setDeposit(double deposit) {
                this.deposit = deposit;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getProdtypecode() {
                return prodtypecode;
            }

            public void setProdtypecode(String prodtypecode) {
                this.prodtypecode = prodtypecode;
            }

            public String getProductVarietyDesc() {
                return productVarietyDesc;
            }

            public void setProductVarietyDesc(String productVarietyDesc) {
                this.productVarietyDesc = productVarietyDesc;
            }

            public String getContractTypeDesc() {
                return contractTypeDesc;
            }

            public void setContractTypeDesc(String contractTypeDesc) {
                this.contractTypeDesc = contractTypeDesc;
            }

            public long getSigndate() {
                return signdate;
            }

            public void setSigndate(long signdate) {
                this.signdate = signdate;
            }

            public String getOwnerName() {
                return ownerName;
            }

            public void setOwnerName(String ownerName) {
                this.ownerName = ownerName;
            }
        }

    }

}
