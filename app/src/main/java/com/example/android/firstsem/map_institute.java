package com.example.android.firstsem;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map_institute extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_institute);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0773099,12.1062652)).title("Institut für Informatik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0770536,12.1135974)).title("Institut für Allgemeine Elektrotechnik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.077377,12.1136832)).title("Institut für Elektrische Energietechnik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.077639,12.1142136)).title("Institut für Gerätesysteme und Schaltungstechnik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.1703493,12.0815306)).title("Institut Mikroelektronik und Datentechnik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.1718742,12.0784157)).title("Institut für Nachrichtentechnik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.1704692,12.0783032)).title("Institut für Automatisierungstechnik"));
    }
}
