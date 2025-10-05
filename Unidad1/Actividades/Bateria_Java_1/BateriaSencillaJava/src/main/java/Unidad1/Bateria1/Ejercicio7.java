package Unidad1.Bateria1;

import java.util.Scanner;

public class Ejercicio7 { // Necesitamos realizar un programa que decida por nosotros si tenemos que ir (o no) a comprar.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Queda Tomate? [Sí/No]");
        String tomate = teclado.nextLine();

        System.out.println("¿Queda Aceita? [Sí/No]");
        String aceite = teclado.nextLine();

        System.out.println("¿Queda Jamón? [Sí/No]");
        String jamon = teclado.nextLine();

        if (tomate.equals("No") || aceite.equals("No") || jamon.equals("No")) {
            System.out.println("Toca ir a comprar.");
        } else {
            System.out.println("No hace falta ir a comprar.");
        }

    }
}
