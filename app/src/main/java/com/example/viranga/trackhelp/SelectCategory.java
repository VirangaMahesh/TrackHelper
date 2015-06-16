package com.example.viranga.trackhelp;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationListener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.viranga.trackhelp.UI.SelectHelpers;


public class SelectCategory extends ActionBarActivity implements LocationListener {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven;
    double longitude,latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);


        btnOne=(Button)findViewById(R.id.btn1);
        btnTwo=(Button)findViewById(R.id.btn2);
        btnThree=(Button)findViewById(R.id.btn3);
        btnFour=(Button)findViewById(R.id.btn4);
        btnFive=(Button)findViewById(R.id.btn5);
        btnSix=(Button)findViewById(R.id.btn6);
        btnSeven=(Button)findViewById(R.id.btn7);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), longitude + " " + latitude, Toast.LENGTH_LONG).show();
                Intent vp = new Intent(SelectCategory.this, SelectHelpers.class);
                startActivity(vp);

            }

        });

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        //locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 4000, 0, listener);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0,0, this);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
