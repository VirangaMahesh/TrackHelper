package com.example.viranga.trackhelp.UI;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.viranga.trackhelp.R;

/**
 * Created by Viranga on 6/15/2015.
 */
public class SelectHelpers extends Activity implements LocationListener {
    Button btnPolice,btnFire,btnAmbulance;
    double longitude2,latitude2;
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
                Toast.makeText(getApplicationContext(),longitude2+" "+latitude2,Toast.LENGTH_LONG).show();

            }


        });

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        //locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 4000, 0, listener);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0,0, this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_select_helpers, menu);
        return true;


    }

    @Override
    public void onLocationChanged(Location location) {
        longitude2=location.getLongitude();
        latitude2=location.getLatitude();
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
