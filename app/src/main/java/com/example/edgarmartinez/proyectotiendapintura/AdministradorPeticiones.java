package com.example.edgarmartinez.proyectotiendapintura;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class AdministradorPeticiones {

    private String url;
    private JSONArray jsonArray;
    private JSONObject jsonObject;
    private RequestQueue x;

    public AdministradorPeticiones(String url, Context context) {
        this.url = url;
        x=Volley.newRequestQueue(context);
    }

    public void setUrl (String url){
        this.url = url;
    }

    public JSONArray getJsonArray() {
        JsonArrayRequest peticionArray = new JsonArrayRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        jsonArray = response;
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        AñadirPeticion(peticionArray, x);
        return jsonArray;
    }
    public JSONObject getJsonObject() {
        JsonObjectRequest peticionObject = new JsonObjectRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                            jsonObject = response;
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        AñadirPeticion(peticionObject, x);
        return jsonObject;
    }

    public static <T extends JsonRequest> T AñadirPeticion(T peticion, RequestQueue x){
        x.add(peticion);
        x.start();
        return null;
    }

}
