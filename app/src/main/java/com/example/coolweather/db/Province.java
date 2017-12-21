package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Zhou on 2017/12/21.
 * 存放省的数据信息
 * 在LitePal中每一个实体类都是必须要继承自DataSupport类的。
 */

public class Province extends DataSupport{
    private int id;//id是每个实体类中都应该有的字段
    private String provinceName;//省的名字
    private int provinceCode;//省的代号
    public int getId(){
        return id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void  setId(int id){
        this.id=id;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
