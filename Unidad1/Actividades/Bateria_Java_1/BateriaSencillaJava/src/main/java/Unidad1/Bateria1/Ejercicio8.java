package Unidad1.Bateria1;

import java.util.Scanner;

public class Ejercicio8 { // Realiza un programa para mostrar un mensaje por pantalla que indique si un triángulo es «escaleno», «equilátero» o «isósceles» introduciendo el tamaño de sus lados por teclado.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido. Introduzca el 1º valor del lado de su triángulo.");
        int lado1 = teclado.nextInt();

        System.out.println("Introduzca el 2º valor del lado de su triángulo.");
        int lado2 = teclado.nextInt();

        System.out.println("Introduzca el 3º valor del lado de su triángulo.");
        int lado3 = teclado.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triángulo equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno.");
        }
    }
}
