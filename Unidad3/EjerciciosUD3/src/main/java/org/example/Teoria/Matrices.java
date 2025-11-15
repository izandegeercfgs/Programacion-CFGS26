package org.example.Teoria;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
    public static void ejemplo1() {
        int vector[] = {3,5,4,1};
        int matriz[][] = new int[2][4];

        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = vector[i];
        }
    }

    public static void ejemplo2() {
        Scanner teclado =  new Scanner(System.in);
        int matriz[][] =  new int[4][4];

        for(int i=0; i<matriz.length; i++){
            System.out.print("Ingresa el vector: ");
            String[] lectura = teclado.next().split(",");
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(lectura[j]);
            }
        }
    }


}
