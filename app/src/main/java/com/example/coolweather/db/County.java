package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Zhou on 2017/12/21.
 * 存放县的数据信息
 */

public class County extends DataSupport {
    private int id;//id是每个实体类中都应该有的字段
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气id
    private int cityId;//当前县所属市的id值
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
