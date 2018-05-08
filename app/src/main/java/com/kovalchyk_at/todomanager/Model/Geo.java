package com.kovalchyk_at.todomanager.Model;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Geo {
    private double lat;
    private double lon;

    public Geo(){
    }

    public Geo(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
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
}
