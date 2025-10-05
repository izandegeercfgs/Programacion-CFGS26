package Unidad1.Bateria1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 { // Escribe un programa para pedirle al usuario el número de horas y la tarifa por hora para calcular el salario bruto.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas = 0;
        int tarifa = 0;
        try {
            System.out.print("> Buenos días. Introduzca su nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("> Hola " + nombre + ". Introduzca un número de horas: ");
            horas = teclado.nextInt();

            System.out.print("> Perfecto. Introduzca su tarifa por hora (€/hora): ");
            tarifa = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido.");
        }

        System.out.println("> Calculando...");

        int salario = horas * tarifa;
        System.out.println("> Su salario bruto es de " + salario + "€ brutos al mes.");
    }
}
