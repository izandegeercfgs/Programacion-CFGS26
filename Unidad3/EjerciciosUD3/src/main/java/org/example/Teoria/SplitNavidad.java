package org.example.Teoria;

import java.util.Arrays;
import java.util.Scanner;

public class SplitNavidad {
    public static void main() {
        Scanner entrada = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce cuantas letras quieres en la palabra NAVIDAD...");
        String cantidad = entrada.nextLine();

        String cantidades[] = cantidad.split(" ");
        String letras[] = palabra.split("");

        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(letras));

        String resultado = "";

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < Integer.parseInt(cantidades[i]); j++) {
                resultado = resultado.concat(letras[i]);
            }
        }

        System.out.println(resultado);
    }
}
