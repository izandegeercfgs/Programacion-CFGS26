package Unidad1.Bateria1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) { // Realizar un programa para dividir dos números leídos por teclado y escribir el resultado. Se debe controlar que el divisor no sea igual a 0 e informaremos con el siguiente mensaje: "ERROR: no se puede dividir entre 0".
        Scanner teclado = new Scanner(System.in);

        System.out.print("> Buenos días. Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        int divisor = 0;
        int dividendo = 0;
        try {
            System.out.print("> Hola " + nombre + ". Introduzca el divisor: ");
            divisor = teclado.nextInt();

            System.out.print("> Perfecto. Introduzca el dividendo: ");
            dividendo = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número válido.");
        }

        System.out.println("\n> Calculando...");
        int resultado = divisor / dividendo;

        if (divisor == 0) {
            System.err.println("Error: No se puede dividir entre 0.");
        } else {
            System.out.println("El resultado es " + resultado);
        }


    }
}
