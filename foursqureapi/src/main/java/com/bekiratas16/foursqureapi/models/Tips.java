package com.bekiratas16.foursqureapi.models;

import java.util.ArrayList;

/**
 * Created by ACER on 28.03.2017.
 */

public class Tips {

    private Integer count;
    private ArrayList<Tip> items;

    public Tips() {
        items = new ArrayList<Tip>();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArrayList<Tip> getItems() {
        return items;
    }

    public void setItems(ArrayList<Tip> items) {
        this.items = items;
    }
}
