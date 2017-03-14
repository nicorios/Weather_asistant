
import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Envy
 */
public class Weather {
        
    
        private double weatherC;
        private double weatherF;
        private double lat;
        private double lon;

    public double getWeatherC() {
        return weatherC;
    }

    public void setWeatherC(double weatherC) {
        this.weatherC = weatherC;
    }

    public double getWeatherF() {
        return weatherF;
    }

    public void setWeatherF(double weatherF) {
        this.weatherF = weatherF;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Weather{" + "weatherC=" + weatherC + ", weatherF=" + weatherF + ", lat=" + lat + ", lon=" + lon + '}';
    }
        
        
    }
    

