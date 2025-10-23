package org.example.Teoria;

import java.util.Scanner;

public class cosasBucles {
    public static void ejemplo1() {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Introduzca una palabra (o Salir): ");
            String palabra = teclado.next();

            if (palabra.toLowerCase().equals("salir")){
                System.out.println("Saliendo...");
                break;
            }

            if (palabra.toLowerCase().equals("anulado")){
                System.out.println("Palabra prohíbida");
                continue;
            }

            System.out.println("GOL");
        }


    }

    public static void ejemplo2() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                continue;
            }
        }
    } // Mostrar impares
}
