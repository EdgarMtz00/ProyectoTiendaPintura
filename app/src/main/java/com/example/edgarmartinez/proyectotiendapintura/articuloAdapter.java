package com.example.edgarmartinez.proyectotiendapintura;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class articuloAdapter extends BaseAdapter {
    public ArrayList<Articulo> Data;
    public Context context;
    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater link = LayoutInflater.from(context);

        View v = link.inflate(R.layout.articulo, null);

        TextView txtView = v.findViewById(R.id.txtNombre);
        txtView.setText(Data.get(position).getNombre());

        txtView = v.findViewById(R.id.txtPrecio);
        txtView.setText(Data.get(position).getPrecio());

        return v;
    }
}
