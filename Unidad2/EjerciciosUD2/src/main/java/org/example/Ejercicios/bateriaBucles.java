package org.example.Ejercicios;

import java.util.Scanner;

public class bateriaBucles {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su contraseña: ");
        String contrasenya = teclado.nextLine();

        String contrasenya2;

        do {
            System.out.println("Vuelva a introducir su contraseña: ");
            contrasenya2 = teclado.nextLine();

            if (contrasenya2.equals(contrasenya)) {
                System.out.println("Bienvenido.");
                break;
            }
        } while (true);
    } // Validar una contraseña

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(numero);
            numero--;
        }
    } // Números de N al 1

    public static void ejercicio3() {
        int numero = 50;

        for (int i = 0; i < numero; i++) {
            int numero2 = numero - i;
            if (numero2 % 3 == 1) {
                int numc = numero2 - 1;
                System.out.println(numc);
            }
        }
    } // Números del 1 al 50 que son múltiplos de 3

    public static void ejercicio4() {
        System.out.println("Introduce una cadena: ");

        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    } // Imprimir carácteres de una cadena

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numInt = teclado.nextInt();
        int num = 10;

        for (int i = 1; i <= num; i++) {
            int resultado = numInt * i;
            System.out.println(numInt + "*" + i + "=" + resultado);
        }
    } // Tabla de multiplicar

    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números a sumar: ");
        int numero = teclado.nextInt();
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.println("Inserta nº" + i);
            resultado += teclado.nextInt();
            System.out.println(resultado);
        }
    } // Programa que pida N números desde teclado y muestre la suma total de todos ellos

    public static void ejercicio7() {
    Scanner teclado = new Scanner (System.in);

        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();
        long resultado = 1;

        for (int i = numero; i > 0; i--) {
            System.out.print(i);
            resultado *= i;

            if (i != 1) {
                System.out.print(" x ");
            } else {
                System.out.println(" = " + resultado);
            }
        }

    } // Factorial de un número

    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        String palabra = teclado.nextLine();
        String palabra2 = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabra2 += palabra.charAt(i);
        }
        System.out.println(palabra2);
    } // Invertir una cadena
}
