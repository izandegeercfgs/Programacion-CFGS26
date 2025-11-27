package org.example.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("*** BINGO ***");
        System.out.println("-------------");

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();



        int filas = 3;
        int columnas = 3;

        int carton[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            System.out.print("Introduce fila " + (i + 1) + ": ");
            String[] numeros = teclado.next().split("-");

            for (int j = 0; j < columnas; j++) {
                carton[i][j] = Integer.parseInt(numeros[j]);
            }
        }

        System.out.println("-------------");
        for (int i = 0; i < carton.length; i++) {
            System.out.println(Arrays.toString(carton[i]));
        }

        int numBolasSorteo = random.nextInt(30) + 10;
        int Sorteo[] = new int[numBolasSorteo];

        for (int i = 0; i < Sorteo.length; i++) {
            int nuevo;
            boolean repetido;

            do {
                nuevo = random.nextInt(90) + 1;
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (Sorteo[j] == nuevo) {
                        repetido = true;
                        break;
                    }
                }

            } while (repetido);

            Sorteo[i] = nuevo;
        }

        System.out.println("-------------");
        System.out.print(numBolasSorteo + " bolas extraídas hasta ahora: ");
        System.out.println(Arrays.toString(Sorteo));
        System.out.println("-------------");

        boolean bingo = true;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                boolean encontrado = false;
                for (int k = 0; k < Sorteo.length; k++) {
                    if (carton[i][j] == Sorteo[k]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    bingo = false; // Si falta algún número, no hay bingo
                    break;
                }
            }
            if (!bingo) break;
        }

        if (bingo) {
            System.out.println("¡BINGO!");
        } else {
            System.out.println("No hay BINGO");
        }

        if (!bingo) {
            boolean linea = false;

            for (int i = 0; i < filas; i++) {
                boolean filaCompleta = true;
                for (int j = 0; j < columnas; j++) {
                    boolean encontrado = false;
                    for (int k = 0; k < Sorteo.length; k++) {
                        if (carton[i][j] == Sorteo[k]) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        filaCompleta = false; // Al menos un número no está en el sorteo
                        break;
                    }
                }
                if (filaCompleta) {
                    linea = true;
                    System.out.println("¡LINEA en la fila " + (i + 1) + "!");
                    break; // Si solo necesitamos detectar una línea
                }
            }

            if (!linea) {
                System.out.println("No hay LINEA");
            }
        }
    }
}
