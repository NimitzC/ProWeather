package com.project001.proweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zengzhaoyu on 2018/5/19.
 */

public class County extends DataSupport {
    private int id;
    private String countyName; //记录县的名字
    private int countyCode; //记录县的代号
    private int cityId; //记录当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}