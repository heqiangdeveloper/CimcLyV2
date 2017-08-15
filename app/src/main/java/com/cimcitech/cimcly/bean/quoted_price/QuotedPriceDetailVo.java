package com.cimcitech.cimcly.bean.quoted_price;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/8.
 */

public class QuotedPriceDetailVo {
    /**
     * data : {"baseversion":"104","chassismodel":null,"confirmdate":null,"createdate":"2017-06-09 10:50:23","creater":"555555764","creatorName":"张乐","custName":"赵亚栋0406","deposit":40000,"divison":null,"doctype":null,"dpprice":null,"forecastdate":null,"isbringchassis":"N","issendmail":"F","isspecial":null,"mmdate":null,"oalcurl":null,"opportNo":null,"opportSubject":null,"planMoney":null,"priceVersion":"20170511154344038","productCount":4,"protocolprice":"333","quoteCarType":"CLY9405GYYA","quoteDetailList":null,"quoteStatusValue":null,"quoteid":497,"quoteopport":"426","quoteprice":"198000.00","quotestandprice":"198000.00","quotestatus":"DS1","saleArea":null,"singleprice":null,"specialmm":null,"status":"T","technote":null,"unitid":"1","version":"104","viewLabelList":[{"modelFeatureDetailList":[{"description":"罐体容积特性","disp":null,"featurelid":376,"featurevalues":"GTRJ_Z035","id":4676,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 罐容42.5方","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容42.5方（负偏差）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容44.5方","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTRJ_Z035","id":null,"spread":"2000","type":null,"unit":null},{"enumerationdesc":"选装 罐容46方（负偏差）","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTRJ_Z035","id":null,"spread":"3000","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体分仓特性","disp":null,"featurelid":376,"featurevalues":"GTFC_Z034","id":4677,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 通仓","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTFC_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2仓","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTFC_Z034","id":null,"spread":"8300","type":null,"unit":null},{"enumerationdesc":"选装 3仓","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTFC_Z034","id":null,"spread":"15200","type":null,"unit":null},{"enumerationdesc":"选装 4仓","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTFC_Z034","id":null,"spread":"22150","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体材料特性","disp":null,"featurelid":376,"featurevalues":"GTCL_Z034","id":4678,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金板5083","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金板5454","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTCL_Z034","id":null,"spread":"1000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5083","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTCL_Z034","id":null,"spread":"3000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5182","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTCL_Z034","id":null,"spread":"4000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5454","enumerationlid":null,"enumerationvalues":"04","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"围板特性","disp":null,"featurelid":376,"featurevalues":"WB_Z034","id":4679,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 开放式围板","enumerationlid":null,"enumerationvalues":"00","featurevalues":"WB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 封闭式围板","enumerationlid":null,"enumerationvalues":"01","featurevalues":"WB_Z034","id":null,"spread":"2400","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"人孔特性","disp":null,"featurelid":376,"featurevalues":"RK_Z034","id":4680,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防爆人孔（国产）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他国外品牌","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶护栏特性","disp":null,"featurelid":376,"featurevalues":"GDHL_Z034","id":4681,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 矮护栏","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 气支撑升降护栏","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶走台特性","disp":null,"featurelid":376,"featurevalues":"GDZT_Z034","id":4682,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防滑网","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金镂空走道","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"行走机构特性","disp":null,"featurelid":376,"featurevalues":"XZJG_Z034","id":4683,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢板悬挂","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 空气悬挂","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮胎特性","disp":null,"featurelid":376,"featurevalues":"LT_Z034","id":4684,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 玲珑 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玲珑 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮辋特性","disp":null,"featurelid":376,"featurevalues":"LW_Z034","id":4685,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 兴民钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 兴民钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"07","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"08","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"09","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富成铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"10","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"11","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"升降支腿特性","disp":null,"featurelid":376,"featurevalues":"SJZT_Z034","id":4686,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇联动","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇单动","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德联动","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德单动","enumerationlid":null,"enumerationvalues":"03","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST联动C200","enumerationlid":null,"enumerationvalues":"04","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST单动C200","enumerationlid":null,"enumerationvalues":"05","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"ABS特性","disp":null,"featurelid":376,"featurevalues":"ABS_Z034","id":4687,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 科密 ABS","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO ABS","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO EBS","enumerationlid":null,"enumerationvalues":"02","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"紧急切断阀特性","disp":null,"featurelid":376,"featurevalues":"HDF_Z034","id":4688,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产4寸气控铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"03","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"下装料及油气回收系统特性","disp":null,"featurelid":376,"featurevalues":"XZL_Z034","id":4689,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 无下装系统","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"油气回收特性","disp":null,"featurelid":376,"featurevalues":"YQHS_Z034","id":4690,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产油气回收","enumerationlid":null,"enumerationvalues":"00","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 进口油气回收","enumerationlid":null,"enumerationvalues":"01","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"软管箱及软管特性","disp":null,"featurelid":376,"featurevalues":"RGX_Z034","id":4691,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 6米PVC+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米PVC+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米不锈钢（201）+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"02","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米不锈钢（201）+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"03","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"04","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"05","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+4寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"06","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+4寸4米输油软管","enumerationlid":null,"enumerationvalues":"07","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"工具箱特性","disp":null,"featurelid":376,"featurevalues":"GJX_Z034","id":4692,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金 900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他尺寸及材料","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"侧防护特性","disp":null,"featurelid":376,"featurevalues":"CFH_Z034","id":4693,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金护栏杆，装配式支腿","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金护栏杆，翻转式支腿","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"备胎架特性","disp":null,"featurelid":376,"featurevalues":"BTJ_Z034","id":4694,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 1件备胎架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2件备胎架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"挡泥板特性","disp":null,"featurelid":376,"featurevalues":"DNB_Z034","id":4695,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 塑料半圆形","enumerationlid":null,"enumerationvalues":"00","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金型材自制","enumerationlid":null,"enumerationvalues":"01","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金圆弧","enumerationlid":null,"enumerationvalues":"02","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢圆弧","enumerationlid":null,"enumerationvalues":"03","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"后保险杠特性","disp":null,"featurelid":376,"featurevalues":"HBXG_Z034","id":4696,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金上杠，碳钢下杠","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金上杠，铝合金下杠","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"爬梯特性","disp":null,"featurelid":376,"featurevalues":"PT_Z034","id":4697,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无前爬梯，装后爬梯","enumerationlid":null,"enumerationvalues":"00","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前爬梯，无后爬梯","enumerationlid":null,"enumerationvalues":"01","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前后爬梯","enumerationlid":null,"enumerationvalues":"02","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"灭火器箱特性","disp":null,"featurelid":376,"featurevalues":"MHQX_Z034","id":4698,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制支架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢灭火器筒","enumerationlid":null,"enumerationvalues":"01","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玻璃钢灭火器箱","enumerationlid":null,"enumerationvalues":"02","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸油箱特性","disp":null,"featurelid":376,"featurevalues":"XYX_Z034","id":4699,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金其他尺寸","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"独立水箱特征","disp":null,"featurelid":376,"featurevalues":"SX_Z034","id":4700,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无水箱","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢500L","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金400L","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸料阀特性","disp":null,"featurelid":376,"featurevalues":"XLF_Z034","id":4701,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸铝合金球阀","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸铝合金球阀","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"04","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"主车架特性","disp":null,"featurelid":376,"featurevalues":"ZCJ_Z035","id":4702,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制主车架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝制主车架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"车轴特性","disp":null,"featurelid":376,"featurevalues":"CZ_Z035","id":4703,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈，50万免维护","enumerationlid":null,"enumerationvalues":"06","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华10T（180），配铝圈，40万免维护","enumerationlid":null,"enumerationvalues":"07","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配钢圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220）400K，配铝圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配钢圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配铝圈","enumerationlid":null,"enumerationvalues":"16","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌及型号","enumerationlid":null,"enumerationvalues":"17","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"空气悬挂特性","disp":null,"featurelid":376,"featurevalues":"KQXG_Z034","id":4704,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"06","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"07","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，钢圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，铝圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T三轴空悬+BPW12T空悬车轴，无前提，铝","enumerationlid":null,"enumerationvalues":"16","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌空悬","enumerationlid":null,"enumerationvalues":"17","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null}],"viewLabel":"QP05","viewLabelName":"选装配置"},{"modelFeatureDetailList":[{"description":"特改需求1","disp":null,"featurelid":376,"featurevalues":"SPECIAL2","id":4648,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求2","disp":null,"featurelid":376,"featurevalues":"SPECIAL3","id":4649,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求3","disp":null,"featurelid":376,"featurevalues":"SPECIAL4","id":4650,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求4","disp":null,"featurelid":376,"featurevalues":"SPECIAL5","id":4651,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求5","disp":null,"featurelid":376,"featurevalues":"SPECIAL6","id":4652,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求6","disp":null,"featurelid":376,"featurevalues":"SPECIAL7","id":4653,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求7","disp":null,"featurelid":376,"featurevalues":"SPECIAL8","id":4654,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求8","disp":null,"featurelid":376,"featurevalues":"SPECIAL9","id":4655,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求9","disp":null,"featurelid":376,"featurevalues":"SPECIAL10","id":4656,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求10","disp":null,"featurelid":376,"featurevalues":"SPECIAL11","id":4657,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求11","disp":null,"featurelid":376,"featurevalues":"SPECIAL12","id":4658,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求12","disp":null,"featurelid":376,"featurevalues":"SPECIAL13","id":4659,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求13","disp":null,"featurelid":376,"featurevalues":"SPECIAL14","id":4660,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求14","disp":null,"featurelid":376,"featurevalues":"SPECIAL15","id":4661,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求15","disp":null,"featurelid":376,"featurevalues":"SPECIAL16","id":4662,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP06","viewLabelName":"特殊要求"},{"modelFeatureDetailList":[{"description":"图案要求1","disp":null,"featurelid":376,"featurevalues":"SPECIAL61","id":4638,"intype":"1","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求2","disp":null,"featurelid":376,"featurevalues":"SPECIAL62","id":4639,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求3","disp":null,"featurelid":376,"featurevalues":"SPECIAL63","id":4640,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求4","disp":null,"featurelid":376,"featurevalues":"SPECIAL64","id":4641,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求5","disp":null,"featurelid":376,"featurevalues":"SPECIAL65","id":4642,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求6","disp":null,"featurelid":376,"featurevalues":"SPECIAL66","id":4643,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求7","disp":null,"featurelid":376,"featurevalues":"SPECIAL67","id":4644,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求8","disp":null,"featurelid":376,"featurevalues":"SPECIAL68","id":4645,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求9","disp":null,"featurelid":376,"featurevalues":"SPECIAL69","id":4646,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求10","disp":null,"featurelid":376,"featurevalues":"SPECIAL70","id":4647,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP08","viewLabelName":"图案要求"},{"modelFeatureDetailList":[{"description":"底盘厂家","disp":null,"featurelid":376,"featurevalues":"DIPANCHANGJIA","id":4663,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘型号","disp":null,"featurelid":376,"featurevalues":"DIPANXINGHAO","id":4664,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"发动机","disp":null,"featurelid":376,"featurevalues":"FADONGJI","id":4665,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"鞍高","disp":null,"featurelid":376,"featurevalues":"ANGAO","id":4666,"intype":"1","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"轮胎","disp":null,"featurelid":376,"featurevalues":"LUNTAI","id":4667,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"轴距","disp":null,"featurelid":376,"featurevalues":"ZHOUJU","id":4668,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"变速箱","disp":null,"featurelid":376,"featurevalues":"BIANSUXIANG","id":4669,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求1","disp":null,"featurelid":376,"featurevalues":"DIPANSP01","id":4670,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求2","disp":null,"featurelid":376,"featurevalues":"DIPANSP02","id":4671,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求3","disp":null,"featurelid":376,"featurevalues":"DIPANSP03","id":4672,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求4","disp":null,"featurelid":376,"featurevalues":"DIPANSP04","id":4673,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求5","disp":null,"featurelid":376,"featurevalues":"DIPANSP05","id":4674,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求6","disp":null,"featurelid":376,"featurevalues":"DIPANDCSJ","id":4675,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP09","viewLabelName":"底盘特性"}]}
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
         * baseversion : 104
         * chassismodel : null
         * confirmdate : null
         * createdate : 2017-06-09 10:50:23
         * creater : 555555764
         * creatorName : 张乐
         * custName : 赵亚栋0406
         * deposit : 40000
         * divison : null
         * doctype : null
         * dpprice : null
         * forecastdate : null
         * isbringchassis : N
         * issendmail : F
         * isspecial : null
         * mmdate : null
         * oalcurl : null
         * opportNo : null
         * opportSubject : null
         * planMoney : null
         * priceVersion : 20170511154344038
         * productCount : 4
         * protocolprice : 333
         * quoteCarType : CLY9405GYYA
         * quoteDetailList : null
         * quoteStatusValue : null
         * quoteid : 497
         * quoteopport : 426
         * quoteprice : 198000.00
         * quotestandprice : 198000.00
         * quotestatus : DS1
         * saleArea : null
         * singleprice : null
         * specialmm : null
         * status : T
         * technote : null
         * unitid : 1
         * version : 104
         * viewLabelList : [{"modelFeatureDetailList":[{"description":"罐体容积特性","disp":null,"featurelid":376,"featurevalues":"GTRJ_Z035","id":4676,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 罐容42.5方","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容42.5方（负偏差）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容44.5方","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTRJ_Z035","id":null,"spread":"2000","type":null,"unit":null},{"enumerationdesc":"选装 罐容46方（负偏差）","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTRJ_Z035","id":null,"spread":"3000","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体分仓特性","disp":null,"featurelid":376,"featurevalues":"GTFC_Z034","id":4677,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 通仓","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTFC_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2仓","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTFC_Z034","id":null,"spread":"8300","type":null,"unit":null},{"enumerationdesc":"选装 3仓","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTFC_Z034","id":null,"spread":"15200","type":null,"unit":null},{"enumerationdesc":"选装 4仓","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTFC_Z034","id":null,"spread":"22150","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体材料特性","disp":null,"featurelid":376,"featurevalues":"GTCL_Z034","id":4678,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金板5083","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金板5454","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTCL_Z034","id":null,"spread":"1000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5083","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTCL_Z034","id":null,"spread":"3000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5182","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTCL_Z034","id":null,"spread":"4000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5454","enumerationlid":null,"enumerationvalues":"04","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"围板特性","disp":null,"featurelid":376,"featurevalues":"WB_Z034","id":4679,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 开放式围板","enumerationlid":null,"enumerationvalues":"00","featurevalues":"WB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 封闭式围板","enumerationlid":null,"enumerationvalues":"01","featurevalues":"WB_Z034","id":null,"spread":"2400","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"人孔特性","disp":null,"featurelid":376,"featurevalues":"RK_Z034","id":4680,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防爆人孔（国产）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他国外品牌","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶护栏特性","disp":null,"featurelid":376,"featurevalues":"GDHL_Z034","id":4681,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 矮护栏","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 气支撑升降护栏","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶走台特性","disp":null,"featurelid":376,"featurevalues":"GDZT_Z034","id":4682,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防滑网","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金镂空走道","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"行走机构特性","disp":null,"featurelid":376,"featurevalues":"XZJG_Z034","id":4683,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢板悬挂","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 空气悬挂","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮胎特性","disp":null,"featurelid":376,"featurevalues":"LT_Z034","id":4684,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 玲珑 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玲珑 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮辋特性","disp":null,"featurelid":376,"featurevalues":"LW_Z034","id":4685,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 兴民钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 兴民钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"07","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"08","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"09","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富成铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"10","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"11","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"升降支腿特性","disp":null,"featurelid":376,"featurevalues":"SJZT_Z034","id":4686,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇联动","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇单动","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德联动","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德单动","enumerationlid":null,"enumerationvalues":"03","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST联动C200","enumerationlid":null,"enumerationvalues":"04","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST单动C200","enumerationlid":null,"enumerationvalues":"05","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"ABS特性","disp":null,"featurelid":376,"featurevalues":"ABS_Z034","id":4687,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 科密 ABS","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO ABS","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO EBS","enumerationlid":null,"enumerationvalues":"02","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"紧急切断阀特性","disp":null,"featurelid":376,"featurevalues":"HDF_Z034","id":4688,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产4寸气控铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"03","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"下装料及油气回收系统特性","disp":null,"featurelid":376,"featurevalues":"XZL_Z034","id":4689,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 无下装系统","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"油气回收特性","disp":null,"featurelid":376,"featurevalues":"YQHS_Z034","id":4690,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产油气回收","enumerationlid":null,"enumerationvalues":"00","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 进口油气回收","enumerationlid":null,"enumerationvalues":"01","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"软管箱及软管特性","disp":null,"featurelid":376,"featurevalues":"RGX_Z034","id":4691,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 6米PVC+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米PVC+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米不锈钢（201）+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"02","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米不锈钢（201）+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"03","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"04","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"05","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+4寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"06","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+4寸4米输油软管","enumerationlid":null,"enumerationvalues":"07","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"工具箱特性","disp":null,"featurelid":376,"featurevalues":"GJX_Z034","id":4692,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金 900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他尺寸及材料","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"侧防护特性","disp":null,"featurelid":376,"featurevalues":"CFH_Z034","id":4693,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金护栏杆，装配式支腿","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金护栏杆，翻转式支腿","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"备胎架特性","disp":null,"featurelid":376,"featurevalues":"BTJ_Z034","id":4694,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 1件备胎架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2件备胎架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"挡泥板特性","disp":null,"featurelid":376,"featurevalues":"DNB_Z034","id":4695,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 塑料半圆形","enumerationlid":null,"enumerationvalues":"00","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金型材自制","enumerationlid":null,"enumerationvalues":"01","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金圆弧","enumerationlid":null,"enumerationvalues":"02","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢圆弧","enumerationlid":null,"enumerationvalues":"03","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"后保险杠特性","disp":null,"featurelid":376,"featurevalues":"HBXG_Z034","id":4696,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金上杠，碳钢下杠","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金上杠，铝合金下杠","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"爬梯特性","disp":null,"featurelid":376,"featurevalues":"PT_Z034","id":4697,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无前爬梯，装后爬梯","enumerationlid":null,"enumerationvalues":"00","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前爬梯，无后爬梯","enumerationlid":null,"enumerationvalues":"01","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前后爬梯","enumerationlid":null,"enumerationvalues":"02","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"灭火器箱特性","disp":null,"featurelid":376,"featurevalues":"MHQX_Z034","id":4698,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制支架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢灭火器筒","enumerationlid":null,"enumerationvalues":"01","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玻璃钢灭火器箱","enumerationlid":null,"enumerationvalues":"02","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸油箱特性","disp":null,"featurelid":376,"featurevalues":"XYX_Z034","id":4699,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金其他尺寸","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"独立水箱特征","disp":null,"featurelid":376,"featurevalues":"SX_Z034","id":4700,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无水箱","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢500L","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金400L","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸料阀特性","disp":null,"featurelid":376,"featurevalues":"XLF_Z034","id":4701,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸铝合金球阀","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸铝合金球阀","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"04","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"主车架特性","disp":null,"featurelid":376,"featurevalues":"ZCJ_Z035","id":4702,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制主车架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝制主车架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"车轴特性","disp":null,"featurelid":376,"featurevalues":"CZ_Z035","id":4703,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈，50万免维护","enumerationlid":null,"enumerationvalues":"06","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华10T（180），配铝圈，40万免维护","enumerationlid":null,"enumerationvalues":"07","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配钢圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220）400K，配铝圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配钢圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配铝圈","enumerationlid":null,"enumerationvalues":"16","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌及型号","enumerationlid":null,"enumerationvalues":"17","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"空气悬挂特性","disp":null,"featurelid":376,"featurevalues":"KQXG_Z034","id":4704,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"06","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"07","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，钢圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，铝圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T三轴空悬+BPW12T空悬车轴，无前提，铝","enumerationlid":null,"enumerationvalues":"16","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌空悬","enumerationlid":null,"enumerationvalues":"17","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null}],"viewLabel":"QP05","viewLabelName":"选装配置"},{"modelFeatureDetailList":[{"description":"特改需求1","disp":null,"featurelid":376,"featurevalues":"SPECIAL2","id":4648,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求2","disp":null,"featurelid":376,"featurevalues":"SPECIAL3","id":4649,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求3","disp":null,"featurelid":376,"featurevalues":"SPECIAL4","id":4650,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求4","disp":null,"featurelid":376,"featurevalues":"SPECIAL5","id":4651,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求5","disp":null,"featurelid":376,"featurevalues":"SPECIAL6","id":4652,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求6","disp":null,"featurelid":376,"featurevalues":"SPECIAL7","id":4653,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求7","disp":null,"featurelid":376,"featurevalues":"SPECIAL8","id":4654,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求8","disp":null,"featurelid":376,"featurevalues":"SPECIAL9","id":4655,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求9","disp":null,"featurelid":376,"featurevalues":"SPECIAL10","id":4656,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求10","disp":null,"featurelid":376,"featurevalues":"SPECIAL11","id":4657,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求11","disp":null,"featurelid":376,"featurevalues":"SPECIAL12","id":4658,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求12","disp":null,"featurelid":376,"featurevalues":"SPECIAL13","id":4659,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求13","disp":null,"featurelid":376,"featurevalues":"SPECIAL14","id":4660,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求14","disp":null,"featurelid":376,"featurevalues":"SPECIAL15","id":4661,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"特改需求15","disp":null,"featurelid":376,"featurevalues":"SPECIAL16","id":4662,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP06","viewLabelName":"特殊要求"},{"modelFeatureDetailList":[{"description":"图案要求1","disp":null,"featurelid":376,"featurevalues":"SPECIAL61","id":4638,"intype":"1","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求2","disp":null,"featurelid":376,"featurevalues":"SPECIAL62","id":4639,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求3","disp":null,"featurelid":376,"featurevalues":"SPECIAL63","id":4640,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求4","disp":null,"featurelid":376,"featurevalues":"SPECIAL64","id":4641,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求5","disp":null,"featurelid":376,"featurevalues":"SPECIAL65","id":4642,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求6","disp":null,"featurelid":376,"featurevalues":"SPECIAL66","id":4643,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求7","disp":null,"featurelid":376,"featurevalues":"SPECIAL67","id":4644,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求8","disp":null,"featurelid":376,"featurevalues":"SPECIAL68","id":4645,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求9","disp":null,"featurelid":376,"featurevalues":"SPECIAL69","id":4646,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"图案要求10","disp":null,"featurelid":376,"featurevalues":"SPECIAL70","id":4647,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP08","viewLabelName":"图案要求"},{"modelFeatureDetailList":[{"description":"底盘厂家","disp":null,"featurelid":376,"featurevalues":"DIPANCHANGJIA","id":4663,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘型号","disp":null,"featurelid":376,"featurevalues":"DIPANXINGHAO","id":4664,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"发动机","disp":null,"featurelid":376,"featurevalues":"FADONGJI","id":4665,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"鞍高","disp":null,"featurelid":376,"featurevalues":"ANGAO","id":4666,"intype":"1","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"轮胎","disp":null,"featurelid":376,"featurevalues":"LUNTAI","id":4667,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"轴距","disp":null,"featurelid":376,"featurevalues":"ZHOUJU","id":4668,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"变速箱","disp":null,"featurelid":376,"featurevalues":"BIANSUXIANG","id":4669,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求1","disp":null,"featurelid":376,"featurevalues":"DIPANSP01","id":4670,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求2","disp":null,"featurelid":376,"featurevalues":"DIPANSP02","id":4671,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求3","disp":null,"featurelid":376,"featurevalues":"DIPANSP03","id":4672,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求4","disp":null,"featurelid":376,"featurevalues":"DIPANSP04","id":4673,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求5","disp":null,"featurelid":376,"featurevalues":"DIPANSP05","id":4674,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null},{"description":"底盘特殊要求6","disp":null,"featurelid":376,"featurevalues":"DIPANDCSJ","id":4675,"intype":"1","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[],"quoteValue":null,"viewlabel":null,"viewlabelName":null}],"viewLabel":"QP09","viewLabelName":"底盘特性"}]
         */

        private String baseversion;
        private Object chassismodel;
        private Object confirmdate;
        private String createdate;
        private String creater;
        private String creatorName;
        private String custName;
        private int deposit;
        private Object divison;
        private Object doctype;
        private Object dpprice;
        private Object forecastdate;
        private String isbringchassis;
        private String issendmail;
        private Object isspecial;
        private Object mmdate;
        private Object oalcurl;
        private Object opportNo;
        private Object opportSubject;
        private Object planMoney;
        private String priceVersion;
        private int productCount;
        private String protocolprice;
        private String quoteCarType;
        private Object quoteDetailList;
        private Object quoteStatusValue;
        private int quoteid;
        private String quoteopport;
        private String quoteprice;
        private String quotestandprice;
        private String quotestatus;
        private Object saleArea;
        private Object singleprice;
        private Object specialmm;
        private String status;
        private Object technote;
        private String unitid;
        private String version;
        private List<ViewLabelListBean> viewLabelList;

        public String getBaseversion() {
            return baseversion;
        }

        public void setBaseversion(String baseversion) {
            this.baseversion = baseversion;
        }

        public Object getChassismodel() {
            return chassismodel;
        }

        public void setChassismodel(Object chassismodel) {
            this.chassismodel = chassismodel;
        }

        public Object getConfirmdate() {
            return confirmdate;
        }

        public void setConfirmdate(Object confirmdate) {
            this.confirmdate = confirmdate;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getCreater() {
            return creater;
        }

        public void setCreater(String creater) {
            this.creater = creater;
        }

        public String getCreatorName() {
            return creatorName;
        }

        public void setCreatorName(String creatorName) {
            this.creatorName = creatorName;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
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

        public Object getDpprice() {
            return dpprice;
        }

        public void setDpprice(Object dpprice) {
            this.dpprice = dpprice;
        }

        public Object getForecastdate() {
            return forecastdate;
        }

        public void setForecastdate(Object forecastdate) {
            this.forecastdate = forecastdate;
        }

        public String getIsbringchassis() {
            return isbringchassis;
        }

        public void setIsbringchassis(String isbringchassis) {
            this.isbringchassis = isbringchassis;
        }

        public String getIssendmail() {
            return issendmail;
        }

        public void setIssendmail(String issendmail) {
            this.issendmail = issendmail;
        }

        public Object getIsspecial() {
            return isspecial;
        }

        public void setIsspecial(Object isspecial) {
            this.isspecial = isspecial;
        }

        public Object getMmdate() {
            return mmdate;
        }

        public void setMmdate(Object mmdate) {
            this.mmdate = mmdate;
        }

        public Object getOalcurl() {
            return oalcurl;
        }

        public void setOalcurl(Object oalcurl) {
            this.oalcurl = oalcurl;
        }

        public Object getOpportNo() {
            return opportNo;
        }

        public void setOpportNo(Object opportNo) {
            this.opportNo = opportNo;
        }

        public Object getOpportSubject() {
            return opportSubject;
        }

        public void setOpportSubject(Object opportSubject) {
            this.opportSubject = opportSubject;
        }

        public Object getPlanMoney() {
            return planMoney;
        }

        public void setPlanMoney(Object planMoney) {
            this.planMoney = planMoney;
        }

        public String getPriceVersion() {
            return priceVersion;
        }

        public void setPriceVersion(String priceVersion) {
            this.priceVersion = priceVersion;
        }

        public int getProductCount() {
            return productCount;
        }

        public void setProductCount(int productCount) {
            this.productCount = productCount;
        }

        public String getProtocolprice() {
            return protocolprice;
        }

        public void setProtocolprice(String protocolprice) {
            this.protocolprice = protocolprice;
        }

        public String getQuoteCarType() {
            return quoteCarType;
        }

        public void setQuoteCarType(String quoteCarType) {
            this.quoteCarType = quoteCarType;
        }

        public Object getQuoteDetailList() {
            return quoteDetailList;
        }

        public void setQuoteDetailList(Object quoteDetailList) {
            this.quoteDetailList = quoteDetailList;
        }

        public Object getQuoteStatusValue() {
            return quoteStatusValue;
        }

        public void setQuoteStatusValue(Object quoteStatusValue) {
            this.quoteStatusValue = quoteStatusValue;
        }

        public int getQuoteid() {
            return quoteid;
        }

        public void setQuoteid(int quoteid) {
            this.quoteid = quoteid;
        }

        public String getQuoteopport() {
            return quoteopport;
        }

        public void setQuoteopport(String quoteopport) {
            this.quoteopport = quoteopport;
        }

        public String getQuoteprice() {
            return quoteprice;
        }

        public void setQuoteprice(String quoteprice) {
            this.quoteprice = quoteprice;
        }

        public String getQuotestandprice() {
            return quotestandprice;
        }

        public void setQuotestandprice(String quotestandprice) {
            this.quotestandprice = quotestandprice;
        }

        public String getQuotestatus() {
            return quotestatus;
        }

        public void setQuotestatus(String quotestatus) {
            this.quotestatus = quotestatus;
        }

        public Object getSaleArea() {
            return saleArea;
        }

        public void setSaleArea(Object saleArea) {
            this.saleArea = saleArea;
        }

        public Object getSingleprice() {
            return singleprice;
        }

        public void setSingleprice(Object singleprice) {
            this.singleprice = singleprice;
        }

        public Object getSpecialmm() {
            return specialmm;
        }

        public void setSpecialmm(Object specialmm) {
            this.specialmm = specialmm;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getTechnote() {
            return technote;
        }

        public void setTechnote(Object technote) {
            this.technote = technote;
        }

        public String getUnitid() {
            return unitid;
        }

        public void setUnitid(String unitid) {
            this.unitid = unitid;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<ViewLabelListBean> getViewLabelList() {
            return viewLabelList;
        }

        public void setViewLabelList(List<ViewLabelListBean> viewLabelList) {
            this.viewLabelList = viewLabelList;
        }

        public static class ViewLabelListBean {
            /**
             * modelFeatureDetailList : [{"description":"罐体容积特性","disp":null,"featurelid":376,"featurevalues":"GTRJ_Z035","id":4676,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 罐容42.5方","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容42.5方（负偏差）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容44.5方","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTRJ_Z035","id":null,"spread":"2000","type":null,"unit":null},{"enumerationdesc":"选装 罐容46方（负偏差）","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTRJ_Z035","id":null,"spread":"3000","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体分仓特性","disp":null,"featurelid":376,"featurevalues":"GTFC_Z034","id":4677,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 通仓","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTFC_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2仓","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTFC_Z034","id":null,"spread":"8300","type":null,"unit":null},{"enumerationdesc":"选装 3仓","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTFC_Z034","id":null,"spread":"15200","type":null,"unit":null},{"enumerationdesc":"选装 4仓","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTFC_Z034","id":null,"spread":"22150","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐体材料特性","disp":null,"featurelid":376,"featurevalues":"GTCL_Z034","id":4678,"intype":"2","isother":null,"isrequired":"T","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金板5083","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金板5454","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTCL_Z034","id":null,"spread":"1000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5083","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTCL_Z034","id":null,"spread":"3000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5182","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTCL_Z034","id":null,"spread":"4000","type":null,"unit":null},{"enumerationdesc":"选装 奥科宁可铝合金板5454","enumerationlid":null,"enumerationvalues":"04","featurevalues":"GTCL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"围板特性","disp":null,"featurelid":376,"featurevalues":"WB_Z034","id":4679,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 开放式围板","enumerationlid":null,"enumerationvalues":"00","featurevalues":"WB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 封闭式围板","enumerationlid":null,"enumerationvalues":"01","featurevalues":"WB_Z034","id":null,"spread":"2400","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"人孔特性","disp":null,"featurelid":376,"featurevalues":"RK_Z034","id":4680,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防爆人孔（国产）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他国外品牌","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RK_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶护栏特性","disp":null,"featurelid":376,"featurevalues":"GDHL_Z034","id":4681,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 矮护栏","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 气支撑升降护栏","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDHL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"罐顶走台特性","disp":null,"featurelid":376,"featurevalues":"GDZT_Z034","id":4682,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金防滑网","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金镂空走道","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GDZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"行走机构特性","disp":null,"featurelid":376,"featurevalues":"XZJG_Z034","id":4683,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢板悬挂","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 空气悬挂","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZJG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮胎特性","disp":null,"featurelid":376,"featurevalues":"LT_Z034","id":4684,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 玲珑 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玲珑 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 双钱 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 12R22.5 12**PR","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 金冠 11R22.5 12**PR","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"轮辋特性","disp":null,"featurelid":376,"featurevalues":"LW_Z034","id":4685,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 兴民钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"00","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 兴民钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"01","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X9.00","enumerationlid":null,"enumerationvalues":"02","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 正兴钢圈22.5X8.25","enumerationlid":null,"enumerationvalues":"03","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"04","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 宝石铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"05","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"06","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 威尔耐铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"07","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"08","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 美铝铝圈22.5X8.25","enumerationlid":null,"enumerationvalues":"09","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富成铝圈22.5X9.00","enumerationlid":null,"enumerationvalues":"10","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"11","featurevalues":"LW_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"升降支腿特性","disp":null,"featurelid":376,"featurevalues":"SJZT_Z034","id":4686,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇联动","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇单动","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德联动","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 华兰德单动","enumerationlid":null,"enumerationvalues":"03","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST联动C200","enumerationlid":null,"enumerationvalues":"04","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 JOST单动C200","enumerationlid":null,"enumerationvalues":"05","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"06","featurevalues":"SJZT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"ABS特性","disp":null,"featurelid":376,"featurevalues":"ABS_Z034","id":4687,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 科密 ABS","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO ABS","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 WABCO EBS","enumerationlid":null,"enumerationvalues":"02","featurevalues":"ABS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"紧急切断阀特性","disp":null,"featurelid":376,"featurevalues":"HDF_Z034","id":4688,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产4寸气控铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产4寸气控不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌","enumerationlid":null,"enumerationvalues":"03","featurevalues":"HDF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"下装料及油气回收系统特性","disp":null,"featurelid":376,"featurevalues":"XZL_Z034","id":4689,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产铝合金（丁晴橡胶）","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产铝合金（四氟包覆）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 国产不锈钢","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 无下装系统","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XZL_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"油气回收特性","disp":null,"featurelid":376,"featurevalues":"YQHS_Z034","id":4690,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 国产油气回收","enumerationlid":null,"enumerationvalues":"00","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 进口油气回收","enumerationlid":null,"enumerationvalues":"01","featurevalues":"YQHS_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"软管箱及软管特性","disp":null,"featurelid":376,"featurevalues":"RGX_Z034","id":4691,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 6米PVC+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"00","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米PVC+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"01","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米不锈钢（201）+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"02","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米不锈钢（201）+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"03","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+3寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"04","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+3寸4米输油软管","enumerationlid":null,"enumerationvalues":"05","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 6米铝合金+4寸5.5米输油软管","enumerationlid":null,"enumerationvalues":"06","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4.5米铝合金+4寸4米输油软管","enumerationlid":null,"enumerationvalues":"07","featurevalues":"RGX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"工具箱特性","disp":null,"featurelid":376,"featurevalues":"GJX_Z034","id":4692,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金 900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他尺寸及材料","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GJX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"侧防护特性","disp":null,"featurelid":376,"featurevalues":"CFH_Z034","id":4693,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金护栏杆，装配式支腿","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金护栏杆，翻转式支腿","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CFH_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"备胎架特性","disp":null,"featurelid":376,"featurevalues":"BTJ_Z034","id":4694,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 1件备胎架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 2件备胎架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"BTJ_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"挡泥板特性","disp":null,"featurelid":376,"featurevalues":"DNB_Z034","id":4695,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 塑料半圆形","enumerationlid":null,"enumerationvalues":"00","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金型材自制","enumerationlid":null,"enumerationvalues":"01","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金圆弧","enumerationlid":null,"enumerationvalues":"02","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢圆弧","enumerationlid":null,"enumerationvalues":"03","featurevalues":"DNB_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"后保险杠特性","disp":null,"featurelid":376,"featurevalues":"HBXG_Z034","id":4696,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金上杠，碳钢下杠","enumerationlid":null,"enumerationvalues":"00","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金上杠，铝合金下杠","enumerationlid":null,"enumerationvalues":"01","featurevalues":"HBXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"爬梯特性","disp":null,"featurelid":376,"featurevalues":"PT_Z034","id":4697,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无前爬梯，装后爬梯","enumerationlid":null,"enumerationvalues":"00","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前爬梯，无后爬梯","enumerationlid":null,"enumerationvalues":"01","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 装前后爬梯","enumerationlid":null,"enumerationvalues":"02","featurevalues":"PT_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"灭火器箱特性","disp":null,"featurelid":376,"featurevalues":"MHQX_Z034","id":4698,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制支架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢灭火器筒","enumerationlid":null,"enumerationvalues":"01","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 玻璃钢灭火器箱","enumerationlid":null,"enumerationvalues":"02","featurevalues":"MHQX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸油箱特性","disp":null,"featurelid":376,"featurevalues":"XYX_Z034","id":4699,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 铝合金900长","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金其他尺寸","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XYX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"独立水箱特征","disp":null,"featurelid":376,"featurevalues":"SX_Z034","id":4700,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无水箱","enumerationlid":null,"enumerationvalues":"00","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 碳钢500L","enumerationlid":null,"enumerationvalues":"01","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝合金400L","enumerationlid":null,"enumerationvalues":"02","featurevalues":"SX_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"卸料阀特性","disp":null,"featurelid":376,"featurevalues":"XLF_Z034","id":4701,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 无","enumerationlid":null,"enumerationvalues":"00","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸铝合金球阀","enumerationlid":null,"enumerationvalues":"01","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸铝合金球阀","enumerationlid":null,"enumerationvalues":"02","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 3寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"03","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 4寸不锈钢球阀","enumerationlid":null,"enumerationvalues":"04","featurevalues":"XLF_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"主车架特性","disp":null,"featurelid":376,"featurevalues":"ZCJ_Z035","id":4702,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 钢制主车架","enumerationlid":null,"enumerationvalues":"00","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 铝制主车架","enumerationlid":null,"enumerationvalues":"01","featurevalues":"ZCJ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"车轴特性","disp":null,"featurelid":376,"featurevalues":"CZ_Z035","id":4703,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"标配 凌宇13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 凌宇13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（180），配铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华13T（220），配铝圈，50万免维护","enumerationlid":null,"enumerationvalues":"06","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 富华10T（180），配铝圈，40万免维护","enumerationlid":null,"enumerationvalues":"07","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配钢圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（200），配铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220），配铝圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW13T（220）400K，配铝圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180）400K，配铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配钢圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T（180），配铝圈","enumerationlid":null,"enumerationvalues":"16","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌及型号","enumerationlid":null,"enumerationvalues":"17","featurevalues":"CZ_Z035","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null},{"description":"空气悬挂特性","disp":null,"featurelid":376,"featurevalues":"KQXG_Z034","id":4704,"intype":"2","isother":null,"isrequired":"F","isshow":null,"priceFeatureDetailList":[{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"00","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"01","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"02","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"03","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"04","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"05","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"06","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW10T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"07","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，铝圈","enumerationlid":null,"enumerationvalues":"08","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，铝圈","enumerationlid":null,"enumerationvalues":"09","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，前提，钢圈","enumerationlid":null,"enumerationvalues":"10","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T鼓式3轴空悬，无前提，钢圈","enumerationlid":null,"enumerationvalues":"11","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，钢圈","enumerationlid":null,"enumerationvalues":"12","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，钢圈","enumerationlid":null,"enumerationvalues":"13","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），无前提，铝圈","enumerationlid":null,"enumerationvalues":"14","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 BPW12T三轴空悬（200），前提，铝圈","enumerationlid":null,"enumerationvalues":"15","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 永力泰12T三轴空悬+BPW12T空悬车轴，无前提，铝","enumerationlid":null,"enumerationvalues":"16","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 其他品牌空悬","enumerationlid":null,"enumerationvalues":"17","featurevalues":"KQXG_Z034","id":null,"spread":"0","type":null,"unit":null}],"quoteValue":"00","viewlabel":null,"viewlabelName":null}]
             * viewLabel : QP05
             * viewLabelName : 选装配置
             */

            private String viewLabel;
            private String viewLabelName;
            private List<ModelFeatureDetailListBean> modelFeatureDetailList;

            public String getViewLabel() {
                return viewLabel;
            }

            public void setViewLabel(String viewLabel) {
                this.viewLabel = viewLabel;
            }

            public String getViewLabelName() {
                return viewLabelName;
            }

            public void setViewLabelName(String viewLabelName) {
                this.viewLabelName = viewLabelName;
            }

            public List<ModelFeatureDetailListBean> getModelFeatureDetailList() {
                return modelFeatureDetailList;
            }

            public void setModelFeatureDetailList(List<ModelFeatureDetailListBean> modelFeatureDetailList) {
                this.modelFeatureDetailList = modelFeatureDetailList;
            }

            public static class ModelFeatureDetailListBean {
                /**
                 * description : 罐体容积特性
                 * disp : null
                 * featurelid : 376
                 * featurevalues : GTRJ_Z035
                 * id : 4676
                 * intype : 2
                 * isother : null
                 * isrequired : T
                 * isshow : null
                 * priceFeatureDetailList : [{"enumerationdesc":"标配 罐容42.5方","enumerationlid":null,"enumerationvalues":"00","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容42.5方（负偏差）","enumerationlid":null,"enumerationvalues":"01","featurevalues":"GTRJ_Z035","id":null,"spread":"0","type":null,"unit":null},{"enumerationdesc":"选装 罐容44.5方","enumerationlid":null,"enumerationvalues":"02","featurevalues":"GTRJ_Z035","id":null,"spread":"2000","type":null,"unit":null},{"enumerationdesc":"选装 罐容46方（负偏差）","enumerationlid":null,"enumerationvalues":"03","featurevalues":"GTRJ_Z035","id":null,"spread":"3000","type":null,"unit":null}]
                 * quoteValue : 00
                 * viewlabel : null
                 * viewlabelName : null
                 */

                private String description;
                private Object disp;
                private int featurelid;
                private String featurevalues;
                private int id;
                private String intype;
                private Object isother;
                private String isrequired;
                private Object isshow;
                private String quoteValue;
                private Object viewlabel;
                private Object viewlabelName;
                private List<PriceFeatureDetailListBean> priceFeatureDetailList;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public Object getDisp() {
                    return disp;
                }

                public void setDisp(Object disp) {
                    this.disp = disp;
                }

                public int getFeaturelid() {
                    return featurelid;
                }

                public void setFeaturelid(int featurelid) {
                    this.featurelid = featurelid;
                }

                public String getFeaturevalues() {
                    return featurevalues;
                }

                public void setFeaturevalues(String featurevalues) {
                    this.featurevalues = featurevalues;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIntype() {
                    return intype;
                }

                public void setIntype(String intype) {
                    this.intype = intype;
                }

                public Object getIsother() {
                    return isother;
                }

                public void setIsother(Object isother) {
                    this.isother = isother;
                }

                public String getIsrequired() {
                    return isrequired;
                }

                public void setIsrequired(String isrequired) {
                    this.isrequired = isrequired;
                }

                public Object getIsshow() {
                    return isshow;
                }

                public void setIsshow(Object isshow) {
                    this.isshow = isshow;
                }

                public String getQuoteValue() {
                    return quoteValue;
                }

                public void setQuoteValue(String quoteValue) {
                    this.quoteValue = quoteValue;
                }

                public Object getViewlabel() {
                    return viewlabel;
                }

                public void setViewlabel(Object viewlabel) {
                    this.viewlabel = viewlabel;
                }

                public Object getViewlabelName() {
                    return viewlabelName;
                }

                public void setViewlabelName(Object viewlabelName) {
                    this.viewlabelName = viewlabelName;
                }

                public List<PriceFeatureDetailListBean> getPriceFeatureDetailList() {
                    return priceFeatureDetailList;
                }

                public void setPriceFeatureDetailList(List<PriceFeatureDetailListBean> priceFeatureDetailList) {
                    this.priceFeatureDetailList = priceFeatureDetailList;
                }

                public static class PriceFeatureDetailListBean {
                    /**
                     * enumerationdesc : 标配 罐容42.5方
                     * enumerationlid : null
                     * enumerationvalues : 00
                     * featurevalues : GTRJ_Z035
                     * id : null
                     * spread : 0
                     * type : null
                     * unit : null
                     */

                    private String enumerationdesc;
                    private Object enumerationlid;
                    private String enumerationvalues;
                    private String featurevalues;
                    private Object id;
                    private String spread;
                    private Object type;
                    private Object unit;

                    public String getEnumerationdesc() {
                        return enumerationdesc;
                    }

                    public void setEnumerationdesc(String enumerationdesc) {
                        this.enumerationdesc = enumerationdesc;
                    }

                    public Object getEnumerationlid() {
                        return enumerationlid;
                    }

                    public void setEnumerationlid(Object enumerationlid) {
                        this.enumerationlid = enumerationlid;
                    }

                    public String getEnumerationvalues() {
                        return enumerationvalues;
                    }

                    public void setEnumerationvalues(String enumerationvalues) {
                        this.enumerationvalues = enumerationvalues;
                    }

                    public String getFeaturevalues() {
                        return featurevalues;
                    }

                    public void setFeaturevalues(String featurevalues) {
                        this.featurevalues = featurevalues;
                    }

                    public Object getId() {
                        return id;
                    }

                    public void setId(Object id) {
                        this.id = id;
                    }

                    public String getSpread() {
                        return spread;
                    }

                    public void setSpread(String spread) {
                        this.spread = spread;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }

                    public Object getUnit() {
                        return unit;
                    }

                    public void setUnit(Object unit) {
                        this.unit = unit;
                    }
                }
            }
        }
    }
}
