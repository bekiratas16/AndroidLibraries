package com.bekiratas16.foursqureapi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.bekiratas16.foursqureapi.exceptions.FoursquareAPIException;
import com.bekiratas16.foursqureapi.models.ApiResult;
import com.bekiratas16.foursqureapi.models.Tips;
import com.bekiratas16.foursqureapi.models.Venue;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by ACER on 28.03.2017.
 */

public class FoursquareAPI {


    private static String PATH_VENUE_SEARCH = "venues/search";
    private static String PATH_VENUE_TIPS = "venues/%s/tips";

    public interface APIResponseListener<T> {
        void onResponse(ApiResult<T> result);

        void onError(VolleyError error);

    }


    private Gson gson;
    private RequestQueue queue;
    private Context context;


    private static final String APIURL = "https://api.foursquare.com/v2/";
    private static final String DEFAULT_VERSION = "20140131";

    private String clientId;
    private String clientSecret;
    private String oAuthToken;
    private String version;


    public FoursquareAPI(Context context, @Nullable String version, @NonNull String clientId, @NonNull String clientSecret) {
        this.context = context;
        this.version = version != null ? version : DEFAULT_VERSION;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        init();


    }

    public FoursquareAPI(Context context, @Nullable String version, @NonNull String oAuthToken) {
        this.context = context;
        this.version = version != null ? version : DEFAULT_VERSION;
        this.oAuthToken = oAuthToken;
        init();

    }

    private void init() {
        gson = new Gson();
        queue = Volley.newRequestQueue(context);
    }

    public void searchVenues(String ll, APIResponseListener<Venue> listener, Object... params) throws FoursquareAPIException {

        ArrayList<Object> paramList = new ArrayList<Object>();
        paramList.add("ll");
        paramList.add(ll);
        for (Object param : params)
            paramList.add(param);
        try {
            APIRequestData apiRequestData = getApiRequestData(PATH_VENUE_SEARCH, false, paramList.toArray());
            APIRequest apiRequest = new APIRequest(apiRequestData, queue, listener);
            apiRequest.doAPIRequest(Request.Method.GET);
        } catch (Exception e) {
            throw new FoursquareAPIException(e);
        }

    }

    public void venueTips(String id, APIResponseListener<Tips> listener, Object... params) throws FoursquareAPIException {


        try {
            APIRequestData apiRequestData = getApiRequestData(String.format(PATH_VENUE_TIPS, id), false, params);
            APIRequest apiRequest = new APIRequest(apiRequestData, queue, listener);
            apiRequest.doAPIRequest(Request.Method.GET);
        } catch (Exception e) {
            throw new FoursquareAPIException(e);
        }

    }


    private APIRequestData getApiRequestData(@NonNull String path, boolean auth, Object... params) throws FoursquareAPIException {
        APIRequestData apıRequestData = new APIRequestData();
        StringBuilder urlBuilder = new StringBuilder(APIURL);
        urlBuilder.append(path);
        apıRequestData.setpUrl(urlBuilder.toString());

        urlBuilder.append('?');

        if (params.length > 1) {
            int paramIndex = 0;
            try {
                while (paramIndex < params.length) {
                    Object key = params[paramIndex];
                    Object value = params[paramIndex + 1];
                    if (value != null) {
                        urlBuilder.append(key.toString());
                        urlBuilder.append('=');
                        urlBuilder.append(URLEncoder.encode(value.toString(), "UTF-8"));
                        urlBuilder.append('&');
                        apıRequestData.getParams().put(key.toString(), value.toString());
                    }

                    paramIndex += 2;
                }
            } catch (UnsupportedEncodingException e) {
                throw new FoursquareAPIException(e);
            }
        }

        if (auth) {
            urlBuilder.append("oauth_token=");
            urlBuilder.append(getOAuthToken());
            apıRequestData.getParams().put("oauth_token", getOAuthToken());
        } else {
            urlBuilder.append("client_id=");
            urlBuilder.append(clientId);
            urlBuilder.append("&client_secret=");
            urlBuilder.append(clientSecret);
            apıRequestData.getParams().put("client_id", clientId);
            apıRequestData.getParams().put("client_secret", clientSecret);

        }

        urlBuilder.append("&v=" + version);
        apıRequestData.getParams().put("v", version);

        apıRequestData.setgUrl(urlBuilder.toString());

        return apıRequestData;
    }


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getOAuthToken() {
        return oAuthToken;
    }

    public void setOAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RequestQueue getQueue() {
        return queue;
    }

    public void setQueue(RequestQueue queue) {
        this.queue = queue;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getoAuthToken() {
        return oAuthToken;
    }

    public void setoAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }
}
