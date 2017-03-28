package com.bekiratas16.foursqureapi.models;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by ACER on 6.03.2017.
 */

public class ApiResult<T> {

    public static final Type VENUE_SEARCH = new TypeToken<ApiResult<Venue>>(){}.getType();
    public static final Type VENUE_TIPS = new TypeToken<ApiResult<Tips>>(){}.getType();

    private Meta meta;
    private Notification notification;
    private ApiResponse response;


    public ApiResult() {
        meta=new Meta();
        notification=new Notification();
        response=new ApiResponse();

    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public ApiResponse getResponse() {
        return response;
    }

    public void setResponse(ApiResponse response) {
        this.response = response;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
