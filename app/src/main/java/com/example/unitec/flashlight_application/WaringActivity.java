package com.example.unitec.flashlight_application;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class WaringActivity extends AppCompatActivity {
    ToggleButton btnwaring;
    Handler handler;
    Timer timer;
    Boolean checkwaring = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waring);
        btnwaring =  (ToggleButton) findViewById(R.id.tgwaring);
        handler = new Handler();
        btnwaring.setChecked(true);
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if(checkwaring==false){
                    checkwaring = true;
                } else {
                    checkwaring = false;
                }
                btnwaring.setChecked(checkwaring);
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            handler.sendEmptyMessage(0);
            }
        },500,500);
    }
}
