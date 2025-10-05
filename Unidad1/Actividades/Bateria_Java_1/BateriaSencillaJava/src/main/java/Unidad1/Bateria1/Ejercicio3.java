package Unidad1.Bateria1;

import java.util.Scanner;

public class Ejercicio3 { // Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado. El algoritmo debe identificar si el número introducido se trata de un número positivo (>0) o un número negativo (<0) y controlar el caso particular del número 0, que es natural.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Buenos días. Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("> Hola " + nombre + ". Introduzca un número: ");
        int numero = 0;
        try {
            numero = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Introduce un valor valido.");
        }

        if (numero == 0) {
            System.out.println("El 0 es un número natural.");
        } else if (numero > 0) {
            System.out.println("El número seleccionado es mayor que 0.");
        } else {
            System.out.println("El número seleccionado es menor que 0.");
        }
    }
}
