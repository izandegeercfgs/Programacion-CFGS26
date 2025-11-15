package org.example.Practicas;

import java.util.Scanner;

// Dada una matriz de M x N letras y una palabra, tenemos que programar un código que encuentre la ubicación en la matriz en la que se puede localizar dicha palabra.
// La palabra debe coincidir con una línea recta e ininterrumpida de letras en la matriz.
// La coincidencia solamente se puede dar en dirección horizontal derecha y dirección verticales abajo.

public class SopaLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** SOPA DE LETRAS ***");
        System.out.println("======================");

        // Se pide al usuario el nº de filas
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();

        // Se pide al usuario el nº de columnas
        System.out.print("Introduce el número de columnas: ");
        int numColumnas = teclado.nextInt();

        System.out.println("----------------------");

        // Se crea una matriz del tamaño introducido por el usuario
        char sopa[][] = new char[numFilas][numColumnas];

        // Bucle para rellenar la matriz
        for (int i = 0; i < numFilas; i++) {
            System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
            String input = teclado.next().toLowerCase(); // Convierte el input a minúsculas

            if (!input.matches("[a-zA-Z]+")) { // Comprueba que el input sea alfabético (A-Z/a-z)
                System.out.println("ERROR: La palabra solo puede contener letras.");
                return;
            }

            if (input.length() != numColumnas) { // Comprueba que no se salga del vector
                System.out.println("ERROR. Debe introducir " + numColumnas + " carácteres. (Tantos carácteres como columnas)");
                return;
            }

            for (int j = 0; j < numColumnas; j++) { // Rellena la matriz
                sopa[i][j] = input.charAt(j);
            }
        }

        System.out.println("----------------------");

        // Muestra la matriz
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println(); // Salto de linea para mostrar correctamente la matriz
        }

        System.out.println("----------------------");

        System.out.print("Introduce una palabra a buscar: ");
        String palabraBuscada = teclado.next(); // Pide al usuario la palabra a buscar
        int largoPalabraBuscada = palabraBuscada.length();

        if (!palabraBuscada.matches("[a-zA-Z]+")) { // Comprueba que la palabra buscada sea alfabética (A-Z/a-z)
            System.out.println("ERROR: La palabra solo puede contener letras.");
            return;
        }

        // Falta el bucle para comprobar coincidencias, lo he intentado pero me estoy haciendo al picha un lio :/
    }
}
