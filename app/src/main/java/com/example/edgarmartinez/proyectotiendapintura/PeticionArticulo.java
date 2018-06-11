package com.example.edgarmartinez.proyectotiendapintura;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class PeticionArticulo {
    public ArrayList<Articulo> Data;
    private Articulo x;
    public Context context;
    private AdministradorPeticiones peticiones = new AdministradorPeticiones("http://192.168.1.72/ProyectoTienda/ConsultaArticulos.php", context);

    public ArrayList<Articulo> getData(){
        try {
            JSONArray jsonArray = peticiones.getJsonArray();
            JSONObject object;
            for (int i = 0; i < jsonArray.length(); i++) {
                object = jsonArray.getJSONObject(i);
                x = new Articulo();
                x.setNombre(object.getString("Nombre"));
                x.setPrecio(object.getInt("Precio"));
                x.setDesc(object.getString("Descripcion"));
                Data.add(x);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        return Data;
    }

    public ArrayList<Articulo> getData(int cantidad){
        try {
            JSONArray jsonArray = peticiones.getJsonArray();
            JSONObject object;
            for (int i = 0; i < cantidad; i++) {
                object = jsonArray.getJSONObject(i);
                x = new Articulo();
                x.setNombre(object.getString("Nombre"));
                x.setPrecio(object.getInt("Precio"));
                x.setDesc(object.getString("Descripcion"));
                Data.add(x);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        return Data;
    }
}
