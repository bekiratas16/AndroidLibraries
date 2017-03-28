package com.bekiratas16.foursqureapi.models;

/**
 * Created by ACER on 28.03.2017.
 */

public class Notification {

    private String type;
    private NotificationItem item;

    public Notification() {
        item = new NotificationItem();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NotificationItem getItem() {
        return item;
    }

    public void setItem(NotificationItem item) {
        this.item = item;
    }
}
