package com.nischay.sondersync;

import android.app.Fragment;
import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by devfloater12-xl on 2013-10-22.
 */
public class startFragment extends Fragment implements View.OnClickListener {

    private double longitude;
    private double latitude;
    private Location location;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_start, container, false);

        Button locationButton = (Button) view.findViewById(R.id.location_button);
        locationButton.setOnClickListener(this);

        LocationManager lm = (LocationManager)getActivity().getSystemService(getActivity().LOCATION_SERVICE);
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 10, locationListener);
//        location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

//        ViewPager viewPager = new ViewPager;



        return view;
    }

    @Override
    public void onClick(View v) {
//        longitude = location.getLongitude();
//        latitude = location.getLatitude();
        Toast.makeText(getActivity(), "Location Button Clicked" + longitude + " " + latitude, Toast.LENGTH_SHORT).show();
    }

    private final LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
                Log.d("Location Listener", "On Location Changed");
                longitude = location.getLongitude();
                latitude = location.getLatitude();
            }


        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            Log.d("Location Listener", "On Status Changed");
        }

        @Override
        public void onProviderEnabled(String provider) {
            Log.d("Location Listener", "On Provider Enabled");
        }

        @Override
        public void onProviderDisabled(String provider) {
            Log.d("Location Listener", "On Provider Disabled");
        }
    };



}



