package com.project001.proweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zengzhaoyu on 2018/5/19.
 */

public class City extends DataSupport {
    private int id;
    private String cityName; //记录省的名字
    private int cityCode; //记录省的代号
    private int provinceId; //记录当前市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}