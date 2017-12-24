package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Zhou on 2017/12/23.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI api;
    public  Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
