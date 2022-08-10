package com.mycompany.reto3;

public class CuentaCorriente extends Cliente {

    private long n_cuenta;
    private String fecha_apertura;
    private double saldo;
    private double interes;
    private double sobregiro;

    public CuentaCorriente(long n_cuenta, String fecha_apertura, double saldo, double interes, double sobregiro) {
        this.n_cuenta = n_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.interes = interes;
        this.sobregiro = sobregiro;
    }

    public CuentaCorriente(long n_cuenta, String fecha_apertura, double saldo, double interes, double sobregiro, long documento, String nombre, String correo, long celular, String direccion) {
        super(documento, nombre, correo, celular, direccion);
        this.n_cuenta = n_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.interes = interes;
        this.sobregiro = sobregiro;
    }

    public double calcular_interes() {
        double interes = 0;
        interes = this.saldo * this.interes / 100;
        return interes;
    }

}
