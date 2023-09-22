package com.brainstorm.springboot2.app.springbootapp.models;

//Esta clase no debe heredar de ninguna interfaz 
//o clase extrerna al core JDK, ajena a cualquier 
//framework o api externa al core de JAva
public class Usuarios {
    private String nombre;
    private String apellido;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
