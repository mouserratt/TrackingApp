package com.loyalty4l.trackingapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.content.Intent;

public class TurnOn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_on);

        Switch Switch_TurnOn = (Switch) findViewById(R.id.Switch_TurnOn);

        Switch_TurnOn.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    Intent i = new Intent(TurnOn.this, Options.class);
                    startActivity (i);
                    Toast.makeText(getApplicationContext(), "Tracking device is on", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Tracking device is off", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}