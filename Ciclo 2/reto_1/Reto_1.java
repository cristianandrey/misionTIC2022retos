package com.mycompany.reto_1;

import java.util.Scanner;

/**
 *
 * @author mendoza
 */
public class Reto_1 {

    public static void main(String[] args) {

        Scanner L = new Scanner(System.in);

        int N_Cu = L.nextInt();

        double total_intereses = 0;
        double total_saldo = 0;

        for (int i = 0; i < N_Cu; i++)
        {

            long numero_cuenta = 0;
            String fecha_apertura;
            int tipo_cuenta = 0;
            double saldo_cuenta = 0;
            double interes = 0;

            numero_cuenta = L.nextLong();
            fecha_apertura = L.next();
            tipo_cuenta = L.nextInt();
            saldo_cuenta = L.nextDouble();

            switch (tipo_cuenta)
            {
                case 1:
                    interes = saldo_cuenta * 0.015;

                    break;

                case 2:
                    interes = Math.round(saldo_cuenta * 0.017);

                    break;
                case 3:
                    interes = saldo_cuenta * 0.016;

                    break;

            }
            saldo_cuenta = saldo_cuenta + interes;
            total_intereses = total_intereses + interes;
            total_saldo = total_saldo + saldo_cuenta;

            System.out.println(numero_cuenta);
            System.out.println(interes);
            System.out.println(saldo_cuenta);

        }

        System.out.println(total_intereses);
        System.out.println(total_saldo);
    }
}
