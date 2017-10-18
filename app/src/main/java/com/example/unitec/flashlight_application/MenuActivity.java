package com.example.unitec.flashlight_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Unitec on 18/10/2017.
 */

public class MenuActivity extends Activity implements View.OnClickListener{
    ImageButton btnlight;
    ImageButton btnNeon,btnwaring;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);
        btnlight = (ImageButton)findViewById(R.id.butonlight);
        btnNeon =  (ImageButton)findViewById(R.id.butonneon);
        btnwaring = (ImageButton)findViewById(R.id.butonwaring);
        btnlight.setOnClickListener(this);
        btnNeon.setOnClickListener(this);
        btnwaring.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.butonlight:
                Intent intentligt = new Intent(MenuActivity.this,LightActivity.class);
                startActivity(intentligt);
                break;
           case R.id.butonneon:
               Intent intentNeon = new Intent(MenuActivity.this,NeOnActivity.class);
               startActivity(intentNeon);
               break;
            case R.id.butonwaring:
                Intent intentwaring = new Intent(MenuActivity.this,WaringActivity.class);
                startActivity(intentwaring);
        }
    }
}
