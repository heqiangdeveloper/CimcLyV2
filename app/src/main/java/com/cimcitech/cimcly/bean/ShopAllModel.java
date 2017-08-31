package com.cimcitech.cimcly.bean;

/**
 * Created by xfc on 2016/8/25.
 */
public class ShopAllModel {

    private String id;
    private String name;
    private String num;
    private String sales;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "ShopAllModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", sales='" + sales + '\'' +
                '}';
    }

    public ShopAllModel() {
    }

    public ShopAllModel(String id, String name, String num, String sales) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.sales = sales;
    }
}
