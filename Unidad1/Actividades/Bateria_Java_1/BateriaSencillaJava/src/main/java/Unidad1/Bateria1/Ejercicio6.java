package Unidad1.Bateria1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor base 'b'");
        try {
            int b = teclado.nextInt();

            if (b < 0) {
                System.err.println("El valor de la base tiene que ser positivo.");
            } else {
                System.out.println("Introduzca el valor altura 'h'");
                int h = teclado.nextInt();
                if (h < 0) {
                    System.err.println("El valor de la altura tiene que ser positivo.");
                } else {
                    int area = (b * h)/2;
                    System.out.println("El area del triángulo es " + area);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número válido.");
        }
    }
}
