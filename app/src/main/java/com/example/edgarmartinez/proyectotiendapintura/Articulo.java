package com.example.edgarmartinez.proyectotiendapintura;

public class Articulo {
    private int precio, id;
    private String nombre;

    Articulo(){
        nombre = "DEFAULT";
        precio = 0;
        id = 0;
    }
    Articulo(String nombre, int id, int precio){
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
