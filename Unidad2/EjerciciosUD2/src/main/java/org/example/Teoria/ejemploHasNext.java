package org.example.Teoria;

import java.util.Scanner;

public class ejemploHasNext {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        if (teclado.hasNextInt()) {
            int numerito = teclado.nextInt();
        } else {
            System.err.println("x El mensaje introducido no es correcto");
        }
    }
}
