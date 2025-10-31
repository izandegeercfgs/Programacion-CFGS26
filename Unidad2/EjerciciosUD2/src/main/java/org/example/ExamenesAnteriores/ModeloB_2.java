package org.example.ExamenesAnteriores;

import java.time.LocalDate;
import java.util.Scanner;

public class ModeloB_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        LocalDate fecha = LocalDate.now();
        int anyoActual = fecha.getYear();

        System.out.print("Introduzca su año de nacimiento: ");
        int anyoNacimiento = teclado.nextInt();

        for (int i = anyoNacimiento; i <= anyoActual; i++) {
            int edad = i - anyoNacimiento;
            System.out.println(i + " | Edad: " + edad);
        }
    }
}
