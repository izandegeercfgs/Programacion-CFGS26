package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practicaInicial {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;
        int resultado = 0;

        try {
            System.out.print("> Introduce el multiplicando (3 cifras): "); // Pide el primer número
            multiplicando = teclado.nextInt();

            while (multiplicando < 100 || multiplicando > 999) { // Controla que tenga 3 cifras
                System.out.print("");
                System.err.println("x ERROR. Introduce un número de 3 cifras, positivo y mayor que 0.");
                multiplicando = teclado.nextInt();
                System.out.print("> Introduce el multiplicando (3 cifras): "); // Vuelve a pedir el primer número
            }
            System.out.println("* Tu primer número es " + multiplicando);

            System.out.print("> Introduce otro multiplicando (3 cifras): "); // Pedir segundo número
            multiplicador = teclado.nextInt();

            while (multiplicador < 100 || multiplicador > 999) { // Controla que tenga 3 cifras
                System.out.print("");
                System.err.println("x ERROR. Introduce un número de 3 cifras.");
                System.out.print("> Introduce el multiplicador (3 cifras): "); // Vuelve a pedir el segundo número
                multiplicador = teclado.nextInt();
            }
            System.out.println("* Tu segundo número es " + multiplicador);

            resultado = multiplicador * multiplicando;

            System.out.println("> El producto de la multiplicación es: " + resultado);

        } catch (InputMismatchException e) {
            System.err.println("x ERROR. Introduce un formato valido.");
        }

        // Empezamos el proceso del desglose

        System.out.println("> El proceso es:");

        System.out.println("   " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("--------");

        String multiplicadorStr = Integer.toString(multiplicador);

        int multiplicador1 = Integer.parseInt(multiplicadorStr.substring(0,1));
        int multiplicador2 = Integer.parseInt(multiplicadorStr.substring(1,2));
        int multiplicador3 = Integer.parseInt(multiplicadorStr.substring(2,3));

        String resultado1 = "   " + Integer.toString(multiplicando * multiplicador3);
        String resultado2 = "  " + Integer.toString(multiplicando * multiplicador2) + "x";
        String resultado3 = " " + Integer.toString(multiplicando * multiplicador1) + "xx";

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println("--------");
        System.out.println(" " + resultado);
    }
}
