package org.example.Teoria;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatriz {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String matriz[][] = new String[3][4];

        for (int i = 0; i < matriz.length; i++) {

            String fila[] = teclado.next().split(",");

            if (fila.length == matriz[i].length) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = fila[j];
                }
            } else {
                System.out.println("El tamaño no es correcto");
                i--;
            }

        }

        for (String fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }


    }
}
