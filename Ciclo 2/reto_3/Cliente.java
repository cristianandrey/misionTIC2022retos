package com.mycompany.reto3;

public class Cliente {

    private long documento;
    private String nombre;
    private String correo;
    private long celular;
    private String direccion;

    public Cliente(long documento, String nombre, String correo, long celular, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Cliente() {

    }

}
