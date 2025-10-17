package org.example.Practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practicaInicial {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        int multiplicando;
        int multiplicador;
        int resultado;

        try {
            System.out.print("Introduce el multiplicando (3 cifras): "); // Pide el primer número
            multiplicando = teclado.nextInt();

            if (multiplicando > 0) { // En caso de que sea positivo
                while (multiplicando < 100 || multiplicando > 999) { // Controla que tenga 3 cifras
                    System.err.print("ERROR. Introduce un número de 3 cifras: ");
                    multiplicando = teclado.nextInt();
                }
            } else if (multiplicando < 0) { // En caso de que sea negativo
                while (multiplicando < -999 || multiplicando > -100) { // Controla que tenga 3 cifras
                    System.err.print("ERROR. Introduce un número de 3 cifras: ");
                    multiplicando = teclado.nextInt();
                }
            }
        } catch (InputMismatchException e) { // Salta la excepción, se ha detectado entrada NO numérica
            System.err.println("ERROR. Introduce un formato valido.");
            return;
        }

        try {
            System.out.print("Introduce el multiplicador (3 cifras): "); // Pedir segundo número
            multiplicador = teclado.nextInt();

            if (multiplicador > 0) { // En caso de que sea positivo
                while (multiplicador < 100 || multiplicador > 999) { // Controla que tenga 3 cifras
                    System.err.print("ERROR. Introduce un número de 3 cifras: ");
                    multiplicador = teclado.nextInt();
                }
            } else if (multiplicador < 0) { // En caso de que sea negativo
                while (multiplicador > -100 || multiplicador < -999) { // Controla que tenga 3 cifras
                    System.err.print("ERROR. Introduce un número de 3 cifras: ");
                    multiplicador = teclado.nextInt();
                }
            }
        } catch (InputMismatchException e) { // Salta la excepción, se ha detectado entrada NO numérica
            System.err.println("ERROR. Introduce un formato valido.");
            return;
        }

        resultado = multiplicador * multiplicando;

        System.out.println("\nEl producto de la multiplicación es: " + resultado);

        // Empezamos el proceso del desglose

        System.out.println("El proceso es:");

        System.out.println("   " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("-------");

        String multiplicadorStr = Integer.toString(multiplicador);

        int multiplicador1 = 0;
        int multiplicador2 = 0;
        int multiplicador3 = 0;

        if (multiplicador > 0) { // Si el numero es positivo, coge las posiciones (0,1), (1,2) y (2,3)
            multiplicador1 = Integer.parseInt(multiplicadorStr.substring(0, 1));
            multiplicador2 = Integer.parseInt(multiplicadorStr.substring(1, 2));
            multiplicador3 = Integer.parseInt(multiplicadorStr.substring(2, 3));
        } else if (multiplicador < 0) { // Si el numero es negativo, coge las posiciones (1,2), (2,3) y (3,4) para evitar coger el "-"
            multiplicador1 = Integer.parseInt(multiplicadorStr.substring(1, 2));
            multiplicador2 = Integer.parseInt(multiplicadorStr.substring(2, 3));
            multiplicador3 = Integer.parseInt(multiplicadorStr.substring(3, 4));
        }

        int resultadoLength = Integer.toString(resultado).length();

        // Imprimimos el resultado
        int resultado1 = multiplicando * multiplicador3;
        int resultado2 = multiplicando * multiplicador2;
        int resultado3 = multiplicando * multiplicador1;

        System.out.println("  " + resultado1);
        System.out.println(" " +resultado2 + "x");
        System.out.println(resultado3 + "xx");

        System.out.println("-------");

        System.out.println(resultado);
    }
}
