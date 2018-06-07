package com.example.edgarmartinez.proyectotiendapintura;

import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexion extends AsyncTask<> {

    String urlServidor="";

    @Override
    protected  void onPreExecute(){
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        try {
            ObtenerDatos(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            URL url = new URL(urlServidor);
            HttpURLConnection con = (HttpURLConnection) URL.openConnection();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String json;
            while((json = bufferedReader.readLine())!=null){
                sb.append(json + "\n");
            }
            return sb.toString().trim();
        } catch (Exception e){
            return null;
        }

    }
}
