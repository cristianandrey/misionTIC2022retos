package com.mycompany.reto3;

/**
 *
 * @author mendo
 */
public class Reto3 {

    public static void main(String[] args) {
    Cuenta cue=new Cuenta(10, "2010/10/16", 1, 600000);
        System.out.println(cue.calcular_interes());
        
        CuentaCorriente cuecor=new CuentaCorriente(10, "20/10/16", 600000, 2.5, 100000);
        System.out.println(cuecor.calcular_interes());

        Cuenta cue=new Cuenta(10, "2010/10/16", 1, 600000, 91243, "luisa", "luesa@gmail.com", 313264647, "calle 20 no 30-40");
        System.out.println(cue.calcular_interes());
        }
}
