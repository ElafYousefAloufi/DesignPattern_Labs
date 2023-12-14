/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #06
 */

package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class Geo implements WeatherGeo {

    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        GeoLocation g = new GeoLocation();
        WeatherDBI w = new WeatherDBI();

        return w.getWeatherInfo(g.search(latitude, longitude));
    }
}

