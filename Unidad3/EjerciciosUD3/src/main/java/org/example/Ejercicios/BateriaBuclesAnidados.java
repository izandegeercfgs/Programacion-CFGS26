package org.example.Ejercicios;

import java.util.Scanner;

public class BateriaBuclesAnidados {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** ARBOL DE NAVIDAD ***");
        System.out.println("------------------------");

        System.out.print("Introduce altura del arbol: ");
        int num = teclado.nextInt();
        System.out.println("------------------------");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** TABLA DE MULTIPLICAR ***");
        System.out.println("----------------------------");

        System.out.print("Introduce número máximo: ");
        int num = teclado.nextInt();
        System.out.println("------------------------");

        int resultado = 0;

        bucle_fuera:
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                resultado = i * j;

                if (resultado > num) {
                    System.out.print(i + "x" + j + " = " + resultado + " --> Se supera el máximo (" + num + ")");
                    break bucle_fuera;
                } else {
                    System.out.println(i + "x" + j + " = " + resultado);
                }
            }
            System.out.println();
        }
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** PRIMOS ***");
        System.out.println("--------------");

        System.out.print("Introduzca el valor m: ");
        int m = teclado.nextInt();

        System.out.println("--------------");

        bucleFuera:
        for (int i = 2; i <= m; i++) { // Recorre los números desde 2 hasta m
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // Comprueba si es primo
                    continue bucleFuera;
                }
            }
            System.out.print(i + " ");
        }
    }
}
