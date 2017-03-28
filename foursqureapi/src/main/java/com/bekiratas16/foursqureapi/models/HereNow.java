package com.bekiratas16.foursqureapi.models;

import java.util.ArrayList;

/**
 * Created by ACER on 6.03.2017.
 */

public class HereNow {



    private  int count;
    private  String summary;
    private ArrayList<Group> groups;

    public HereNow() {

        groups=new ArrayList<Group>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
