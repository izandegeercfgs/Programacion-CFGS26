package org.example.Practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZXSpectrum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** ZX Spectrum ***");
        System.out.println("-------------------");

        // Establezco constantes para usarlas posteriormente
        final int bit = 8;
        final int maximo = 48;

        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        int ancho = 0; // Definimos las columnas de la matriz
        int alto = 0; // Definimos las filas de la matriz
        try {
            System.out.print("Ancho: ");
            ancho = teclado.nextInt();

            System.out.print("Alto: ");
            alto = teclado.nextInt();
            teclado.nextLine();
        } catch (InputMismatchException e) {
            System.out.print("ERROR. El programa solo admite números.");
            return;
        }

        if (alto % bit != 0 || alto > maximo || ancho % bit != 0 || ancho > maximo) { // Validamos que la resolución de la pantalla sea correcta
            System.out.print("ERROR. La resolución debe ser múltiplo de 8 y no mayor de 48.");
            return;
        }

        char pantalla[][] = new char[alto][ancho]; // Creamos la matriz que usaremos posteriormente para la pantalla

        System.out.println("-------------------");
        System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel:");

        for (int i = 0; i < alto; i++) {
            String input = teclado.nextLine().toUpperCase(); // Convierte el input a mayúsculas

            // Validamos que los carácteres introducidos se encuentre entre la A y la O en el alfabeto inglés, como indica el ejercicio
            if (!input.matches("[a-oA-O]+")) { // He añadido el '+' porque es la UNICA forma de que me lo ejecute
                System.out.println("ERROR: La palabra solo puede contener letras.");
                return;
            }

            if (input.length() != ancho) { // Comprueba que no se salga del vector
                System.out.println("ERROR. Debe introducir " + ancho + " carácteres. (Tantos carácteres como columnas)");
                return;
            }

            for (int j = 0; j < ancho; j++) { // Rellena la matriz
                pantalla[i][j] = input.charAt(j);
            }
        }

        System.out.println("-------------------");

        for (int i = 0; i < alto; i++) { // Mostramos la matriz escrita por el usuario
            for (int j = 0; j < ancho; j++) {
                System.out.print(pantalla[i][j]);
            }
            System.out.println(); // Salto de linea para mostrar correctamente la matriz
        }

        System.out.println("-------------------");
        // Se crean 2 variables auxiliares para guardar los 2 primeros colores que encuentre el programa en cada 8x8
        char color1 = pantalla[0][0]; // La primera letra de la matriz será el primer color
        char color2 = 0; // La segunda todavía no se ha asignado
        boolean aux2asignado = false;
        boolean tresColores = false; // Booleano para controlar que no haya 3 colores

        // Bucle para contar el nº de colores
        for (int i = 0; i < pantalla.length; i += 8) {
            for (int j = 0; j < pantalla[i].length; j += 8) {
                char pixel = pantalla[i][j]; // Variable para simplificar la lectura

                if (pixel != color1) { // En cuanto detecta un color distinto al 1º, asigna el 2º color
                    if (!aux2asignado) {
                        color2 = pixel;
                        aux2asignado = true;
                    } else if (pixel != color2) { // En cuanto detecta un color distinto al 1º y al 2º, salta el programa
                        tresColores = true;
                    }
                }

            }
        }

        // Imprime el resultado de la busqueda
        if (!tresColores) {
            System.out.println("Es compatible con un ZX Spectrum");
        } else {
            System.out.println("No es compatible con un ZX Spectrum");
        }
    }
}

// Ejemplo 8x8 = AAAAAAAA
// Ejemplo 8x8 2 = AAAAAAEI
// EJEMPLO 16X16 = AAAAAAAAAAAAAAAA