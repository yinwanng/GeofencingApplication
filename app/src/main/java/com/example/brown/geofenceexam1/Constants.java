package com.example.brown.geofenceexam1;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public class Constants {
    public static final String GEOFENCE_ID_BCIT= "BCIT";
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;

    public static final HashMap<String, LatLng> AREA_PLACES = new HashMap<String, LatLng>();

    static {
        // bcit area
        AREA_PLACES.put(GEOFENCE_ID_BCIT, new LatLng(49.2502195, -123.0031086));

        // inside bcit
        // -123.0031086
        // 49.2502195

        // outside bcit
        // -123.0039377
        // 49.251539
    }
}
