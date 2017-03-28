package com.bekiratas16.foursqureapi;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bekiratas16.foursqureapi.FoursquareAPI;
import com.bekiratas16.foursqureapi.exceptions.FoursquareAPIException;
import com.bekiratas16.foursqureapi.models.ApiResult;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ACER on 28.03.2017.
 */

public class APIRequest<T> {


    private APIRequestData apıRequestData;
    private Gson gson;
    private FoursquareAPI.APIResponseListener<T> listener;
    private RequestQueue queue;

    public APIRequest(APIRequestData apıRequestData, RequestQueue queue, FoursquareAPI.APIResponseListener<T> listener) {
        this.apıRequestData = apıRequestData;
        this.listener = listener;
        this.queue = queue;
        gson = new Gson();
    }

    public void doAPIRequest(int method) throws JsonSyntaxException, FoursquareAPIException, MalformedURLException {

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    Type collectionType = new TypeToken<ApiResult<T>>() {
                    }.getType();
                    ApiResult<T> apiResult = gson.fromJson(response, collectionType);
                    listener.onResponse(apiResult);

                } catch (JsonSyntaxException e) {
                    throw new JsonSyntaxException(e);
                }
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };
        StringRequest stringRequest = null;


        if (method == Request.Method.GET)
            stringRequest = new StringRequest(method, apıRequestData.getgUrl(), responseListener, errorListener);
        else {

            stringRequest = new StringRequest(method, apıRequestData.getpUrl(), responseListener, errorListener) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    return new HashMap<String, String>(apıRequestData.getParams());
                }
            };
        }

        queue.add(stringRequest);


    }

}
