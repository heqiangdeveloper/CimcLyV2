package com.cimcitech.cimcly.bean.car_in_storage;

/**
 * Created by lyw on 2017/7/28.
 */

public class WaitInStorageDataBean {
    private int userId;
    private String vehicleNos;

    public WaitInStorageDataBean(int userId, String vehicleNos) {
        this.userId = userId;
        this.vehicleNos = vehicleNos;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVehicleNos() {
        return vehicleNos;
    }

    public void setVehicleNos(String vehicleNos) {
        this.vehicleNos = vehicleNos;
    }
}
