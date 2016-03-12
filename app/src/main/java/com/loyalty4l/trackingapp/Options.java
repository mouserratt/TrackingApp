package com.loyalty4l.trackingapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void OnClick_GetLocation (View v)
    {
        if(v.getId() == R.id.Btn_GetLocation)
        {
            Intent iLocation = new Intent(Options.this, GetLocation.class);
            startActivity(iLocation);
        }
    }

    public void OnClick_Battery (View v)
    {
        if(v.getId() == R.id.Btn_Battery)
        {
            Intent iBattery = new Intent(Options.this, BatteryInfo.class);
            startActivity(iBattery);
        }
    }

    public void OnClick_DistanceAlarm (View v)
    {
        if(v.getId() == R.id.Btn_DistanceAlarm)
        {
            Intent iAlarm = new Intent(Options.this, DistanceAlarm.class);
            startActivity(iAlarm);
        }
    }

    public void OnClick_PlaySound (View v)
    {
        if(v.getId() == R.id.Btn_PlaySound)
        {
            Intent iPlaySound = new Intent(Options.this, PlaySound.class);
            startActivity(iPlaySound);
        }
    }

}
