package com.mycompany.reto3;

public class Cuenta extends Cliente {

    private long numero_cuenta;
    private String fecha_apertura;
    private int tipo_cuenta;
    private double saldo_cuenta;

    public Cuenta(long numero_cuenta, String fecha_apertura, int tipo_cuenta, double saldo_cuenta) {
        this.numero_cuenta = numero_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.tipo_cuenta = tipo_cuenta;
        this.saldo_cuenta = saldo_cuenta;
    }

    public Cuenta(long numero_cuenta, String fecha_apertura, int tipo_cuenta, double saldo_cuenta, long documento, String nombre, String correo, long celular, String direccion) {
        super(documento, nombre, correo, celular, direccion);
        this.numero_cuenta = numero_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.tipo_cuenta = tipo_cuenta;
        this.saldo_cuenta = saldo_cuenta;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public int getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(int tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public double getSaldo_cuenta() {
        return saldo_cuenta;
    }

    public void setSaldo_cuenta(double saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }

    public double calcular_interes() {

        double interes;

        if (this.tipo_cuenta == 1)
        {
            interes = this.saldo_cuenta * 0.015;
        } else
        {
            if (this.tipo_cuenta == 2)
            {
                interes = Math.round(this.saldo_cuenta * 0.017);
            } else
            {
                interes = this.saldo_cuenta * 0.016;

            }
        }
        return interes;

    }

}
