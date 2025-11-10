package org.example.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** RULETA ***");
        System.out.println("--------------");
        System.out.println(">>> USUARIO <<<");

        final String[] colores = {"rojo", "negro"};
        final String[] valores = {"par", "impar"};
        Integer[] numeros = new Integer[37];

        int numUsuario;
        String parUsuario = "";
        String colorUsuario = "";

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        System.out.print("Introduce un número (0-36): ");
        numUsuario = teclado.nextInt();
        teclado.nextLine();

        if (!Arrays.asList(numeros).contains(numUsuario)) {
            System.out.println("ERROR. El número debe de estar entre 0 y 36.");
            return;
        }

        if (numUsuario != 0) {
            System.out.print("Introduce un color (rojo-negro): ");
            colorUsuario = teclado.nextLine().toLowerCase();

            boolean colorEncontrado = Arrays.asList(colores).contains(colorUsuario);

            if (!colorEncontrado) {
                System.out.println("Color: No encontrado");
                return;
            }

            System.out.print("Introduce un valor (par-impar): ");
            parUsuario = teclado.nextLine().toLowerCase();

            boolean parEncontrado = Arrays.asList(valores).contains(parUsuario);

            if (!parEncontrado) {
                System.out.println("Valor: No encontrado");
                return;
            }

            String colorBanca = colores[random.nextInt(2)];
            int numBanca = random.nextInt(37);
            String parBanca;

            if (numBanca % 2 == 0) {
                parBanca = "par";
            } else {
                parBanca = "impar";
            }
            System.out.println("--------------");
            System.out.println(">>> BANCA <<<");
            System.out.println("Número: " + numBanca);
            System.out.println("Color: " + colorBanca);
            System.out.println("Paridad: " + parBanca);
            System.out.println("--------------");

            boolean aciertoNumero = (numBanca == numUsuario);
            boolean aciertoColor = (colorUsuario.equals(colorBanca));
            boolean aciertoPar = (parUsuario.equals(parBanca));

            if (aciertoNumero && aciertoColor && aciertoPar) {
                System.out.println("HA GANADO");
            } else if (aciertoColor) {
                System.out.println("HA ACERTADO COLOR");
            } else if (aciertoPar) {
                System.out.println("HA ACERTADO " + parBanca.toUpperCase());
            } else if (numUsuario == 0) {
                System.out.println("HA GANADO y los demás pierden");
            } else if (aciertoNumero) {
                System.out.println("HA ACERTADO EL NÚMERO");
            } else if (aciertoColor && aciertoPar) {
                System.out.println("HA ACERTADO COLOR Y " + parBanca.toUpperCase());
            } else {
                System.out.println("HA PERDIDO");
            }
        }
    }
}
