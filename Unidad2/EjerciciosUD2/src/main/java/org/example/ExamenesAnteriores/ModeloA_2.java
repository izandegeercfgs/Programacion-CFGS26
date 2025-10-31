package org.example.ExamenesAnteriores;

import java.time.LocalDate;
import java.util.Scanner;

public class ModeloA_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = LocalDate.now();
        int anyoActual = fecha.getYear();
        int anyoMin = 1900;

        System.out.println("AÑO BISIESTO");
        System.out.println("************");

        System.out.print("Introduzca un año: ");
        int anyo = teclado.nextInt();

        if (anyo < anyoMin || anyo > anyoActual) {
            System.err.println("El año debe estar entre " + anyoMin + " y " + anyoActual);
        } else {
            System.out.println("Años bisiestos desde " + anyo + " hasta " + anyoActual + ":");
            while (anyo <= anyoActual) {
                if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
                    System.out.println(anyo);
                }
                anyo++;
            }
        }
    }
}