package com.bekiratas16.foursqureapi.exceptions;

import java.io.IOException;

/**
 * Created by ACER on 28.03.2017.
 */

public class FoursquareAPIException extends RuntimeException {


    public FoursquareAPIException() {
    }

    public FoursquareAPIException(String message) {
        super(message);
    }

    public FoursquareAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoursquareAPIException(Throwable cause) {
        super(cause);
    }
}
