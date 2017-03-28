package com.bekiratas16.foursqureapi.models;

import com.bekiratas16.foursqureapi.models.Tips;
import com.bekiratas16.foursqureapi.models.Venue;

import java.util.ArrayList;

/**
 * Created by ACER on 6.03.2017.
 */

public class ApiResponse {

    private ArrayList<Venue> venues;
    private Tips tips;


    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public void setVenues(ArrayList<Venue> venues) {
        this.venues = venues;
    }

    public Tips getTips() {
        return tips;
    }

    public void setTips(Tips tips) {
        this.tips = tips;
    }
}
