package com.bekiratas16.foursqureapi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ACER on 28.03.2017.
 */

public class APIRequestData {
    private Map params;
    private String gUrl;
    private String pUrl;

    public APIRequestData() {
        params = new HashMap<String,String>();
    }

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }

    public String getgUrl() {
        return gUrl;
    }

    public void setgUrl(String gUrl) {
        this.gUrl = gUrl;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }
}
