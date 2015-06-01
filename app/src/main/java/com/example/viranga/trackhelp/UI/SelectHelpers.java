package com.example.viranga.trackhelp.UI;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.viranga.trackhelp.R;

/**
 * Created by Viranga on 6/15/2015.
 */
public class SelectHelpers extends Activity implements LocationListener {
    Button btnPolice,btnFire,btnAmbulance;
    double longitude,latitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_select_helpers);
        btnPolice=(Button)findViewById(R.id.btnPolice);
        btnAmbulance=(Button)findViewById(R.id.btnAmpulance);
        btnFire=(Button)findViewById(R.id.btnFire);

        btnPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onLocationChanged(Location location) {
        longitude=location.getLongitude();
        latitude=location.getLatitude();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
