package org.example.Teoria;

import java.util.Arrays;
import java.util.Scanner;

public class AsList {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] colores = {"azul", "rojo", "amarillo", "verde", "negro"};
        System.out.print("Introduce un color: ");
        String color = teclado.next().toLowerCase();

        boolean color_encontrado = Arrays.asList(colores).contains(color);

        if (color_encontrado) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }
}
