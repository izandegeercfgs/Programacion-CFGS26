package org.example.Ejercicios;

import java.util.Scanner;

public class BateriaCaracteres {
    public static void Ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Introduce una cadena de carácteres: ");
        String cadena = teclado.nextLine();
        int mitad = cadena.length() / 2;

        System.out.println("-----------------------");
        System.out.println("> Texto original: " + cadena);
        System.out.println("> Longitud: " + cadena.length() + " carácteres");
        System.out.println("> Sin espacios: " + cadena.trim());
        System.out.println("> Dividido por la mitad: ");
        System.out.println("    > Primera mitad del texto: " + cadena.substring(0, mitad));
        System.out.println("    > Segunda mitad del texto: " + cadena.substring(mitad));
        System.out.println("> En mayus: " + cadena.toUpperCase());
    }

    public static void Ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("> Introduce la cadena nº1: ");
        String cadena1 = teclado.nextLine();

        System.out.println("> Introduce la cadena nº2: ");
        String cadena2 = teclado.nextLine();

        int cadena1length = cadena1.length();
        int cadena2length = cadena2.length();

        if (cadena1length > cadena2length) {
            System.out.println("> La cadena 1 es más larga que la 2");
        } else if (cadena1length < cadena2length) {
            System.out.println("> La cadena 2 es más larga que la 1");
        } else {
            System.out.println("> Las cadenas son iguales");
        }
    }

    public static void Ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Introduce un número: ");
        int num1 = teclado.nextInt();
        int num1length = Integer.toString(num1).length();

        System.out.print("> ¿Cuantas cifras quieres quitarle?: ");
        int num2 = teclado.nextInt();

        int num3 = Integer.parseInt(Integer.toString(num1).substring(0, (num1length - num2)));
        System.out.print("> Número final: " + num3);
    }

    public static void Ejercicio4() {
        String texto = "Hola Mundo. Bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";

        System.out.println("Tu frase es: " + texto);
        System.out.println("La subcadena es: " + subcadena);

        int fraselength = texto.length();
        int frasesinsubcadena = texto.replace(subcadena, "").length();

        int division = (fraselength - frasesinsubcadena) / subcadena.length();
        System.out.println(division);
    }

    public static void Ejercicio5() {
        Scanner teclado = new Scanner(System.in);

        int intentos = 10;
        boolean acierto = false;

        System.out.println("Introduce la frase inicial: ");
        String frase = teclado.nextLine();

        while (intentos > 0 && !acierto) {
            System.out.println("Introduce la subcadena (Debe formar parte de la frase inicial): ");
            String subcadena = teclado.nextLine();

            acierto = frase.contains(subcadena);

            if (acierto) {
                System.out.println("¡Enhorabuena, has acertado una palabra!");
            } else {
                intentos -= 1;
                System.out.println("ERROR. Te quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("Has perdido.");
                }

            }
        }
    }
}
