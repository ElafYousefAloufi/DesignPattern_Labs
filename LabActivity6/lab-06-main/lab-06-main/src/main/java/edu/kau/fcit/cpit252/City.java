/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #06
 */

package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class City implements WeatherCity {

    @Override
    public String getWeatherInfo(String city) {
        WeatherDBI w = new WeatherDBI();
        return w.getWeatherInfo(city);
    }
}

