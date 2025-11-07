package org.example.Practicas;

import java.util.Random;
import java.util.Scanner;

public class BatallaSamurai {
    public static void main() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner "teclado"
        Random random = new Random(); // Crea el random "random"

        System.out.println("*** BATALLA SAMURAI ***");
        System.out.println("-----------------------");

        final int numEquipos = 2; // Establece el numero de equipos a una constante = 2
        final int numSamurais = 7; // Establece el numero de samurais por equipo a una constante = 7

        int[] equipo1 = new int [numSamurais]; // Crea un vector de tamaño 7
        int[] equipo2 = new int [numSamurais]; // Crea un vector de tamaño 7

        for (int i = 1; i <= numEquipos; i++) { // Crea bucle para rellenar los valores de cada equipo
            int sumaEquipo; // Crea una variable para la suma de las potencias por equipo
            int[] equipo; // Variable para definir a qué equipo pertenecen qué datos

            if (i == 1) { // Controla qué equipo es del que estás rellenando los datos
                equipo = equipo1;
            } else {
                equipo = equipo2;
            }

            do {
                System.out.println("> Equipo " + i);
                System.out.print("> Introduce potencia de los samurais (1-24): ");

                String ptsEquipoStr = teclado.nextLine();
                String[] ptsEquipo = ptsEquipoStr.split(" "); // Pide las potencias de los samurais de cada equipo y las divide por los " "

                sumaEquipo = 0; // Establece sumaEquipo en 0 para empezar a sumar
                boolean valido = true; // Controla si la entrada es válida: 7 guerreros y ninguno fuera del rango (1-24)

                if (ptsEquipo.length == numSamurais) { // Controla la potencia
                    for (int j = 0; j < numSamurais; j++) { // Recorre cada equipo
                        try {
                            int potencia = Integer.parseInt(ptsEquipo[j]);
                            if (potencia < 1 || potencia > 24) { // En caso de no estar en el rango, da error
                                System.out.println("> ERROR. La potencia de cada guerrero debe estar entre 1 y 24.");
                                valido = false;
                                break;
                            }
                            sumaEquipo += potencia;
                            equipo[j] = potencia;
                        } catch (NumberFormatException e) {
                            System.out.println("> ERROR. Introduce solo números.");
                            valido = false;
                            break;
                        }
                    }
                } else { // Si el equipo tiene más o menos de 7 guerreros, da fallo
                    System.out.println("> ERROR. Tu equipo debe de contar con 7 guerreros.");
                    valido = false;
                }

                if (valido && sumaEquipo != 30) { // Si la suma no da 30, da fallo
                    System.out.println("> ERROR. La potencia total no suma 30.");
                    valido = false;
                }

                if (valido) {
                    break;
                }
            } while (sumaEquipo != 30);
        }
        System.out.println("> ¡Empieza la batalla!");

        int turno = random.nextInt(numSamurais) + 1;
        System.out.println("> La batalla inicia con el Samurai " + (turno));

        int contMuertos1 = 0;
        int contMuertos2 = 0;

        while (contMuertos1 < 4 && contMuertos2 < 4) {
            int samurai1 = equipo1[turno];
            int samurai2 = equipo2[turno];

            System.out.print("> Samurai " + (turno) + ". ");

            if (samurai1 > samurai2) {
                System.out.println("Gana Equipo 1. " + samurai1 + " vs " + samurai2);
                equipo2[turno] = 0;
                contMuertos2++;
            } else if (samurai1 < samurai2) {
                System.out.println("Gana Equipo 2. " + samurai1 + " vs " + samurai2);
                equipo1[turno] = 0;
                contMuertos1++;
            } else {
                System.out.println("Empate. Ambos samuráis caen. " + samurai1 + " vs " + samurai2);
                equipo1[turno] = 0;
                equipo2[turno] = 0;
                contMuertos1++;
                contMuertos2++;
            }
            turno++;

            if (turno == 7) {
                turno = 0;
            }
        }
        if (contMuertos1 >= 4) {
            System.out.println("> ¡Equipo 2 GANA! Equipo 1 ha tenido " + contMuertos1 + " bajas.");
        } else {
            System.out.println("> ¡Equipo 1 GANA! Equipo 2 ha tenido " + contMuertos2 + " bajas.");
        }
    }
}
// Ejemplo potencias válidas
// 1 3 5 5 7 8 1
// 6 6 6 6 1 1 4