package com.example.edgarmartinez.proyectotiendapintura;

import android.app.Activity;
import android.os.Bundle;

public class InformacionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
