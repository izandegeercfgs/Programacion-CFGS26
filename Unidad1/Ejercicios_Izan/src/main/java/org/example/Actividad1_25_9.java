package org.example;

import java.util.Scanner;

public class Actividad1_25_9 {
    static void main() {
        Scanner teclado = new Scanner(System.in); // Creación de un objeto scanner

        System.out.println("> ¿Cómo te llamas?");
        String nombre = teclado.next(); // Guardamos el nombre

        System.out.println("> ¿A qué curso vas?");
        int curso = teclado.nextInt(); // Guardamos el curso

        System.out.println("Hola " + nombre + " bienvenido a " + curso + "ªDAW");
        System.out.println("> Introduce un número: ");
        int num1 = teclado.nextInt(); // Guardamos el 1º numero

        System.out.println("> Introduce otro número: ");
        int num2 = teclado.nextInt(); // Guardamos el 2º numero

        int suma = num1 + num2; // Calculamos la suma
        System.out.println("El resultado de sumar los dos números es: " + suma); 
    }
}
