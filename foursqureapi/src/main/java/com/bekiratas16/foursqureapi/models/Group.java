package com.bekiratas16.foursqureapi.models;

import java.util.ArrayList;

/**
 * Created by ACER on 6.03.2017.
 */

public class Group {

    private String type;
    private Integer count;
    private ArrayList<GroupItem> items;


    public Group() {
        items=new ArrayList<GroupItem>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArrayList<GroupItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<GroupItem> items) {
        this.items = items;
    }


}
