package com.bekiratas16.foursqureapi.models;

import java.util.ArrayList;

/**
 * Created by ACER on 6.03.2017.
 */

public class Location {


    public Location() {
        formattedAddress = new ArrayList<String>();
    }

    private String address;
    private double lat;
    private double lng;
    private int distance;
    private String cc;
    private String city;
    private String state;
    private String country;
    private ArrayList<String> formattedAddress;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(ArrayList<String> formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}
