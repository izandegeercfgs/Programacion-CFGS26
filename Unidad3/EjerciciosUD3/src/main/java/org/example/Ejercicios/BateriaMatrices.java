package org.example.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaMatrices {
    public static void ejercicio1() { // Búsqueda en una matriz
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Ejercicio 1 - Búsqueda en una matriz ***\n");

        int tam = 3;
        int filas = tam;
        int columnas = tam;

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            System.out.print("Introduce " + columnas + " números para la fila " + (i + 1) + ": ");

            String linea = teclado.nextLine();
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(String.valueOf(linea.charAt(j)));
            }
        }

        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        System.out.print("Número a buscar: ");
        int numero = teclado.nextInt();

        int posFila = -1;
        int posColumna = -1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numero) {
                    posFila = i;
                    posColumna = j;
                }
            }
        }

        if (posFila != -1) {
            System.out.println("El número " + numero + " se encuentra en la posición (" + posFila + ", " + posColumna + ")");
        } else {
            System.out.println("El número " + numero + " no se encuentra en la matriz.");
        }
    }

    public static void ejercicio2() {
        System.out.print("*** Ejercicio 2 - Suma de filas y columnas de una matriz ***\n");

        Random random = new Random();

        int filas = random.nextInt(5) + 1;
        int columnas = random.nextInt(5) + 1;

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }


        System.out.print("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        System.out.println("\nSuma de filas:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿cuántos estudiantes tienes?: ");
        int estudiantes = teclado.nextInt();
        System.out.println("¿cuántas asignaturas cursan?:");
        int asignaturas = teclado.nextInt();

        String notas[][] = new String[estudiantes + 1][asignaturas + 1];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("introduce el alumno " + i + ":");
            notas[i][0] = teclado.next();
        }

        for (int i = 1; i < notas[0].length; i++) {
            System.out.println("Introduce la asignatura " + i + ":");
            notas[0][i] = teclado.next();
        }

        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                System.out.println("Inserta la nota para " + notas[i][0] + " en la asignatura de " + notas[0][j]);
                notas[i][j] = teclado.next();
            }
        }

        for (String fila[] : notas) {
            System.out.println(Arrays.toString(fila));
        }

        int suma_notas = 0;
        for (int i = 1; i < notas.length; i++) {
            suma_notas = 0;
            for (int j = 1; j < notas[i].length; j++) {
                suma_notas += Integer.parseInt(notas[i][j]);
            }
            System.out.println("La media de " + notas[i][0] + " es " + (double) (suma_notas / asignaturas));
        }

        for (int i = 1; i < notas[0].length; i++) {
            suma_notas = 0;
            for (int j = 1; j < notas.length; j++) {
                suma_notas += Integer.parseInt(notas[j][i]);
            }
            System.out.println("La media de " + notas[0][i] + " es " + (double) (suma_notas / estudiantes));
        }
    }
}
