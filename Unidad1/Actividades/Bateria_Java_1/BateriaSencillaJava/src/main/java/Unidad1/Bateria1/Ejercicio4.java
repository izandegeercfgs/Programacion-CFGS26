package Unidad1.Bateria1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) { // Realizar un programa para calcular el mínimo de 3 números  leídos desde teclado. En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje: "ERROR: hay números introducidos que son iguales".
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Buenos días. Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        int a = 0;
        int c = 0;
        int b = 0;

        try {
            System.out.print("> Hola " + nombre + ". Introduzca el primer número: ");
            a = teclado.nextInt();

            System.out.print("> Perfecto. Introduzca el segundo número: ");
            b = teclado.nextInt();

            System.out.print("> ¡Ya casi lo tenemos! Introduzca el tercer número: ");
            c = teclado.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n> Calculando...");

        System.out.println("> Números: a(" + a +"), b(" + b + "), c(" + c + ")\n");

        if (a != b && a != c && b != c) {
            if (a < c && a < b) {
                System.out.println("> a (" + a + ") es el menor.");
            } else if (b < a && b < c) {
                System.out.println("> b (" + b + ") es el menor.");
            } else {
                System.out.println("> c (" + c + ") es el menor.");
            }
        } else {
            System.err.println("ERROR: hay números introducidos que son iguales.");
        }
    }
}
