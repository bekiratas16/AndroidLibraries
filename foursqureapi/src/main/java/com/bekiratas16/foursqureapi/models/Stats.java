package com.bekiratas16.foursqureapi.models;

/**
 * Created by ACER on 6.03.2017.
 */

public class Stats {

    private int checkinsCount;
    private int usersCount;
    private int tipCount;

    public int getTipCount() {
        return tipCount;
    }

    public void setTipCount(int tipCount) {
        this.tipCount = tipCount;
    }

    public int getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(int checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

}
