/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #06
 */

package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {

    public static void main(String[] args) {
        // Jeddah => 21.543333, 39.172778

        City city = new City();
        city.getWeatherInfo("Jeddah");

        Geo geo = new Geo();
        geo.getWeatherInfo(21.543333, 39.172778);
    }
}

