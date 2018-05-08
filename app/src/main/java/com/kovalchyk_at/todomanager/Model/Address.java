package com.kovalchyk_at.todomanager.Model;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String suite;
    private String zipcode;
    private Geo geo;

    public Address() {
    }

    public Address(String country, String region, String city, String street, String suite, String zipcode, double lat, double lon) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = new Geo(lat, lon);
    }

    public String getCountry() {
        if (country != null) {
            return country;
        } else {
            return "empty";
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        if (region != null) {
            return region;
        } else {
            return "empty";
        }
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        if (city != null) {
            return city;
        } else {
            return "empty";
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        if (street != null) {
            return street;
        } else {
            return "empty";
        }
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        if (suite != null) {
            return suite;
        } else {
            return "empty";
        }
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getZipcode() {
        if (zipcode != null) {
            return zipcode;
        } else {
            return "empty";
        }
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        if (geo != null) {
            return geo;
        } else {
            return new Geo(0, 0);
        }
    }

    public void setGeo(Geo geo) {

        this.geo = geo;
    }
}
