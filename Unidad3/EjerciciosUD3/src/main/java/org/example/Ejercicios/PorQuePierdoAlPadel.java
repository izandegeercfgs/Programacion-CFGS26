package org.example.Ejercicios;

import java.util.Scanner;

public class PorQuePierdoAlPadel {
    public static void main(String[] args) {
        System.out.println("*** PADEL ***");
        System.out.println("-------------");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el % de los 4 factores externos (Compi-pista-pala-pelota): ");
        String[] fila = teclado.nextLine().split(" ");

        int total = 0;

        for (int i = 0; i < fila.length; i++) {
            total += Integer.parseInt(fila[i]);
        }

        System.out.println("Tienes un " + (100-total) + "% de culpa.");
    }
}
