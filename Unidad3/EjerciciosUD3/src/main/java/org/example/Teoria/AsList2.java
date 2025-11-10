package org.example.Teoria;

import java.util.Arrays;
import java.util.Scanner;

public class AsList2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer[] numeros = new Integer[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        boolean numEncontrado = Arrays.asList(numeros).contains(num);

        if (numEncontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}
