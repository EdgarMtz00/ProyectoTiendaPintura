package com.example.edgarmartinez.proyectotiendapintura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void articuloClick(View v){
        Intent articuloIntent = new Intent(getApplicationContext(), Articulo.class);
        startActivity(articuloIntent);
    }
}
