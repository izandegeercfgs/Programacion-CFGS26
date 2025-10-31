package org.example.ExamenesAnteriores;

import java.util.Random;
import java.util.Scanner;

public class ModeloA_1 {
    static void main() {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("ADIVINAR NUMERO");
        System.out.println("***************");

        int numero;
        int numRandom = random.nextInt(101);
        System.out.println(numRandom);

        for (int i = 10; i > 0; i--) {
            System.out.print("Introduzca un numero: ");
            numero = teclado.nextInt();

            if (numero == numRandom) {
                System.out.println("Correcto");
                break;
            } else {
                if ((i - 1) == 0) {
                    System.err.println("Has perdido.");
                } else {
                    if (numRandom > numero) {
                        System.out.println("Incorrecto. El número es mayor al introducido. Te quedan " + (i - 1) + " intentos.");
                    } else {
                        System.out.println("Incorrecto. El número es menor al introducido. Te quedan " + (i - 1) + " intentos.");
                    }

                }
            }
        }
    }
}