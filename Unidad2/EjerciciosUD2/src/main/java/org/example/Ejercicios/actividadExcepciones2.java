package org.example.Ejercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

public class actividadExcepciones2 {
    static void main() {
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

        String modo = teclado.nextLine();

        teclado.nextLine();

        boolean error = false;

        switch (modo) {
            case "1":
                System.out.println("Introduce tu año de nacimiento: ");
                String anyo = teclado.next();

                try {
                    anyoNacimiento = Integer.parseInt(anyo);
                } catch (NumberFormatException e1) {
                    System.out.println("El formato del año no es correcto. " + e1.getMessage());
                }

                if (anyoNacimiento < anyoMinimo || anyoNacimiento > anyoActual) {
                    System.out.println("El año introducido no es correcto.");
                    error = true;
                }
                break;

            case "2":
                System.out.println("Introduce tu edad: ");
                int edad = 0;

                if (teclado.hasNextInt()) {
                    edad = teclado.nextInt();
                } else {
                    System.out.println("El formato de la edad es incorrecto.");
                }

                if (edad < 0) {
                    System.out.println("La edad introducida no es correcta.");
                } else {
                    anyoNacimiento = anyoActual - edad;
                }

            default:
                System.out.println("El modo no existe.");
                error = true;
        }
        if (!error) {
            System.out.println("\nCalculando a qué generacion perteneces...");
            if (anyoNacimiento <= 1927) {
                System.out.println("Eres de la generación sin bautizar.");
            } else if (anyoNacimiento <= 1944) {
                System.out.println("Eres de la generación Silent.");
            } else if (anyoNacimiento <= 1964) {
                System.out.println("Eres de la genración Baby Boomers");
            } else if (anyoNacimiento <= 1981) {
                System.out.println("Eres de la generación X");
            } else if (anyoNacimiento <= 1994) {
                System.out.println("Eres de la mejor generación, MILLENIAL!! :)");
            } else {
                System.out.println("Eres de la generación Centenial");
            }
        }
    }
}