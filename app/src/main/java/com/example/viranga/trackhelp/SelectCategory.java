package com.example.viranga.trackhelp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class SelectCategory extends ActionBarActivity {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven;


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
}
