package org.example.Ejercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

public class actividadExcepciones {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();

        final int anyoMinimo = 1900;
        int anyoActual = hoy.getYear();
        int anyoNacimiento = 0;


        System.out.println("MODOS DISPONIBLES");
        System.out.println("-----------------");
        System.out.println("1. Comprobar si el año es válido");
        System.out.println("2. Calcular el año de nacimiento");
        System.out.print("Escoja un modo: ");

        int modo;

        if (!teclado.hasNextInt()) {
            System.out.println("x ERROR. Introduce un modo válido.");
            return;
        }

        modo = teclado.nextInt();
        teclado.nextLine();

        if (modo == 1) {
            System.out.print("\nBienvenido. Introduzca su año de nacimiento (XXXX): ");
            String anyoNacimientoStr = teclado.nextLine();

            anyoNacimiento = Integer.parseInt(anyoNacimientoStr);

            if (anyoNacimiento <= anyoMinimo && anyoNacimiento >= anyoActual) {
                System.err.println("x Año NO válido");
            }
        } else if (modo == 2) {
            System.out.print("\nBienvenido. Introduzca su edad: ");
            int edad = teclado.nextInt();

            anyoNacimiento = anyoActual - edad;
            teclado.nextLine();

            System.out.println("\nEl usuario tiene " + edad + " años. Nació en el " + anyoNacimiento);
        } else {
            System.err.println("x ERROR. El modo introducido no es válido. Escoja de nuevo: ");
        }

        System.out.println("\nCalculando a qué generacion perteneces...");
        if (anyoNacimiento >= 1900 && anyoNacimiento <= 1927) {
            System.out.println("Eres de la generación sin bautizar.");
        } else if (anyoNacimiento >= 1928 && anyoNacimiento <= 1944) {
            System.out.println("Eres de la generación Silent.");
        } else if (anyoNacimiento >= 1945 && anyoNacimiento <= 1964) {
            System.out.println("Eres de la genración Baby Boomers");
        } else if (anyoNacimiento >= 1965 && anyoNacimiento <= 1981) {
            System.out.println("Eres de la generación X");
        } else if (anyoNacimiento >= 1982 && anyoNacimiento <= 1994) {
            System.out.println("Eres de la mejor generación, MILLENIAL!! :)");
        } else if (anyoNacimiento >= 1995 && anyoNacimiento <= anyoActual) {
            System.out.println("Eres de la generación Centenial");
        } else {
            System.out.println("No tienes generación.");
        }
    }
}
