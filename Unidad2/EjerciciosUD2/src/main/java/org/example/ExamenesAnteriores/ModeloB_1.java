package org.example.ExamenesAnteriores;

import java.util.Random;
import java.util.Scanner;

public class ModeloB_1 {
    static void main() {
        System.out.println("PIEDRA, PAPEL y TIJERA");
        System.out.println("**********************");

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String opcion = "pat";
        int puntosUsuario = 0;
        int puntosMaquina = 0;

        while (puntosUsuario < 2 && puntosMaquina < 2) {
            int opcionRandom = random.nextInt(3);
            char opcionMaquina = opcion.charAt(opcionRandom);

            System.out.println("\nElija su opción:");
            System.out.println("(p) Piedra");
            System.out.println("(a) Papel");
            System.out.println("(t) Tijera");
            System.out.println("---------------");

            System.out.print("Introduzca su opción: ");
            String opcionUsuario = teclado.nextLine().toLowerCase();

            if (!opcionUsuario.equals("p") && !opcionUsuario.equals("a") && !opcionUsuario.equals("t")) {
                System.out.println("Error: opción no válida. Debe ser 'p', 'a' o 't'.");
                continue;
            }

            System.out.println("===========================");

            System.out.print("Has elegido: ");
            if (opcionUsuario.equals("p")) {
                System.out.println("Piedra");
            } else if (opcionUsuario.equals("a")) {
                System.out.println("Papel");
            } else {
                System.out.println("Tijera");
            }

            System.out.print("La máquina ha sacado: ");
            if (opcionMaquina == 'p') {
                System.out.println("Piedra");
            } else if (opcionMaquina == 'a') {
                System.out.println("Papel");
            } else {
                System.out.println("Tijera");
            }

            System.out.println("===========================");

            if (opcionUsuario.charAt(0) == opcionMaquina) {
                System.out.println("Empate — se repite la ronda.");
                continue;
            }

            boolean ganaUsuario = (opcionUsuario.equals("p") && opcionMaquina == 't') || (opcionUsuario.equals("a") && opcionMaquina == 'p') || (opcionUsuario.equals("t") && opcionMaquina == 'a');

            if (ganaUsuario) {
                puntosUsuario++;
                System.out.println("Has ganado esta ronda.");
            } else {
                puntosMaquina++;
                System.out.println("Has perdido esta ronda.");
            }

            System.out.println("Marcador: Usuario " + puntosUsuario + " - " + puntosMaquina + " Máquina " );
        }

        System.out.println("\n===========================");
        if (puntosUsuario > puntosMaquina) {
            System.out.println("Has ganado la partida.");
        } else {
            System.out.println("La máquina ha ganado la partida.");
        }
        System.out.println("===========================");

        teclado.close();
    }
}
