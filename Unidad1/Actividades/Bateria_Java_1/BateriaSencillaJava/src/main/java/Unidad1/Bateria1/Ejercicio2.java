package Unidad1.Bateria1;

import java.util.Scanner;

public class Ejercicio2 { // Reescribe el programa anterior para darle al empleado 1.5 veces la tarifa horaria para todas las horas trabajadas que excedan de 40.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Buenos días. Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("> Hola " + nombre + ". Introduzca un número de horas: ");
        int horas = teclado.nextInt();

        System.out.print("> Perfecto. Introduzca su tarifa por hora (€/hora): ");
        int tarifa = teclado.nextInt();

        System.out.println("> Calculando...");

        if (horas > 40) {
            double salario = (40 * tarifa) + (((horas - 40) * tarifa) * 1.5);
            System.out.println("> Su salario bruto es de " + salario + "€ brutos al mes.");
        } else {
            int salario = horas * tarifa;
            System.out.println("> Su salario bruto es de " + salario + "€ brutos al mes.");
        }
    }
}
