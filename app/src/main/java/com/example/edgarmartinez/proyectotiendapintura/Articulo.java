package com.example.edgarmartinez.proyectotiendapintura;

public class Articulo {
    private int precio;
    private String nombre, desc;

    Articulo(){
        nombre = "DEFAULT";
        precio = 0;
        desc = "DEFAULT";
    }
    Articulo(String nombre, String desc, int precio){
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
