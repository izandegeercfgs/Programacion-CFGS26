package org.example.Ejercicios;

import java.util.Objects;
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
        } while (!Objects.equals(contrasenya, contrasenya2));

        System.out.println("Bienvenido.");
    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(numero);
            numero--;
        }
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(numero);
            numero--;
        }
    }
}
