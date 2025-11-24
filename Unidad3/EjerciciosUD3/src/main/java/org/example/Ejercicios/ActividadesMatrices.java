package org.example.Ejercicios;

import java.util.Random;

public class ActividadesMatrices {
    public static void ejercicio1() {
        int n = 4; // Tamaño de la matriz (4x4)

        char[][] matriz = new char[n][n]; // Declara una matriz de caracteres

        // Rellena la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + i == 3) { // Condición para la diagonal secundaria
                    matriz[i][j] = 'X'; // Marca con 'X' en la diagonal
                } else {
                    matriz[i][j] = '-'; // Resto de posiciones con '-'
                }
            }
        }

        // Imprime la matriz completa
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " "); // Muestra cada elemento
            }
            System.out.println(); // Salto de línea por fila
        }
    }

    public static void ejercicio2() {
        Random random = new Random(); // Crea un generador de números aleatorios

        int filas = 3; // Número de filas de las matrices
        int columnas = 3; // Número de columnas de las matrices

        int[][] matrizA = new int[filas][columnas]; // Matriz A de 3x3
        int[][] matrizB = new int[filas][columnas]; // Matriz B de 3x3
        int[][] matrizC = new int[filas][columnas]; // Matriz C de 3x3 (resultado)

        // Rellena matrices A y B con números aleatorios del 0 al 9
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = random.nextInt(10); // Valor aleatorio para A
                matrizB[i][j] = random.nextInt(10); // Valor aleatorio para B
            }
        }

        // Compara valores de A y B para formar C con el mayor de cada posición
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] > matrizB[i][j]) {
                    matrizC[i][j] = matrizA[i][j]; // Guarda el mayor entre A y B
                } else {
                    matrizC[i][j] = matrizB[i][j];
                }
            }
        }

        System.out.println("*** MATRIZ A ***");
        System.out.println("----------------");

        // Imprime matriz A
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------");
        System.out.println("*** MATRIZ B ***");
        System.out.println("----------------");

        // Imprime matriz B
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------");
        System.out.println("*** MATRIZ C ***");
        System.out.println("----------------");

        // Imprime matriz C (con los valores mayores)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}