package Cuenta;

public class PruebaCuenta {

    public static void main(String[] args) {
        Cuenta objeto_cuenta = new Cuenta(10, "2010/10/06/", 1, 600000);
        System.out.println(objeto_cuenta.calcular_interes());

        objeto_cuenta = new Cuenta(20, "2015/11/26/", 2, 700000);
        System.out.println(objeto_cuenta.calcular_interes());

        objeto_cuenta = new Cuenta(30, "2016/10/06/", 3, 800000);
        System.out.println(objeto_cuenta.calcular_interes());

        objeto_cuenta = new Cuenta(50, "2017/11/06/", 2, 800000);
        System.out.println(objeto_cuenta.calcular_interes());
    }

}
