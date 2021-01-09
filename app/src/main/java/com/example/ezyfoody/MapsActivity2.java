package com.example.ezyfoody;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayL = new ArrayList<LatLng>();
    LatLng EzyFoodyJakarta = new LatLng( -6.1385, 106.8647);
    LatLng EzyFoodyAlamSutera = new LatLng(-6.2206, 106.6439);
    LatLng EzyFoodyBekasi = new LatLng(-6.2153, 106.8713);
    LatLng EzyFoodyPV = new LatLng(-6.1164, 106.7896);
    LatLng EzyFoodyBlokM = new LatLng(-6.2435,  106.8022);
    LatLng EzyFoodyGadingSerpong = new LatLng(-6.2405, 106.6297);

    private String[] place = {"EzyFoody Jakarta", "EzyFoody Alam Sutera", "EzyFoody Bandung",
            "EzyFoody PV", "EzyFoody BlokM", "EzyFoody Gading Serpong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        arrayL.add(EzyFoodyJakarta);
        arrayL.add(EzyFoodyAlamSutera);
        arrayL.add(EzyFoodyBekasi);
        arrayL.add(EzyFoodyPV);
        arrayL.add(EzyFoodyBlokM);
        arrayL.add(EzyFoodyGadingSerpong);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        for (int i = 0;i<arrayL.size();i++) {
            mMap.addMarker(new MarkerOptions().position(arrayL.get(i)).title(place[i]));
            CameraPosition cameraPosition = new CameraPosition.Builder().target(arrayL.get(i)).zoom(100).build();
            mMap.moveCamera(CameraUpdateFactory.newLatLng(arrayL.get(i)));
        }
    }
}