package org.example.Practicas;

import java.util.Scanner;

//Tu misión es crear un programa que analice estos datos y ayude a determinar:
//  1. Momento pico de audiencia.
//  2. Momento más "hypeado" de cada streamer (cuando su chat estaba más activo en proporción a los viewers).
//  3. Las mejores rachas de crecimiento de cada uno. Fórmula: (MAX(viewers) - MIN(viewers)) × 100) / MAX(viewers)

//El programa debe calcular y mostrar:
//  @[Nombre streamer]
//  MAX= [pico]             --> Su pico máximo de espectadores.
//  HYPE= [n] ([ratio])     --> El "momento más hypeado", es decir, el número de la medición (n) cuando la ratio comentarios/espectadores fue más alta. Además, hay que mostrar dicha ratio de mensajes/espectadores entre paréntesis.
//  RACHA= [n]              --> El nivel de constancia del streamer (menor diferencia entre su máximo y mínimo de viewers) con la fórmula vista anteriormente: (MAX(viewers) - MIN(viewers)) × 100) / MAX(viewers).

public class StreamerStatsChallenge {
    public static void main() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner "teclado"

        System.out.println("*** ESTADÍSTICAS PREMIOS ESLAND ***");
        System.out.println("-----------------------------------");

        final int numMomentos = 5; // Establece el número de momentos destacados a 5 como constante

        int[] espectadores = new int[numMomentos];
        int[] comentarios = new int[numMomentos];

        System.out.print("Inserta streamer a analizar: ");
        String nombreStreamer = teclado.nextLine();
        String handleStreamer = nombreStreamer.replace(" ", ""); // Quita los espacios para el @usuario

        System.out.print("Inserta los espectadores medidos: ");
        String avgEspectador = teclado.nextLine();
        String[] avgEspectadorV = avgEspectador.split(" "); // Crea el vector para los espectadores

        System.out.print("Inserta el número de comentarios: ");
        String numComentarios = teclado.nextLine();
        String[] numComentariosV = numComentarios.split(" "); // Crea el vector para los comentarios

        if (avgEspectadorV.length != numMomentos || numComentariosV.length != numMomentos) { // Controla el largo del vector
            System.out.println("ERROR. El número de momentos debe de ser igual a 5 para poder calcular.");
            return;
        }

        for (int i = 0; i < numMomentos; i++) { // Bucle para controlar posibles errores: Introducir decimales y/o negativos
            try {
                espectadores[i] = Integer.parseInt(avgEspectadorV[i]);
                comentarios[i] = Integer.parseInt(numComentariosV[i]);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se permiten números enteros.");
                return;
            }

            if (espectadores[i] <= 0 || comentarios[i] <= 0) {
                System.out.println("ERROR. No se permiten valores negativos ni iguales a 0 para espectadores o comentarios.");
                return;
            }
        }

        int maxEspectadores = espectadores[0];
        int minEspectadores = espectadores[0];

        for (int i = 1; i < numMomentos; i++) { // Calcula el pico más alto y más bajo de espectadores del streamer

            if (espectadores[i] > maxEspectadores) {
                maxEspectadores = espectadores [i];
            }

            if (espectadores[i] < minEspectadores) {
                minEspectadores = espectadores [i];
            }
        }

        double maxRatio = 0;
        int maxHype = 0;

        for (int i = 0; i < numMomentos; i++) { // Calcula el hype máximo
            double ratio = (double) comentarios[i] / espectadores[i];

            if (ratio > maxRatio) {
                maxHype = i + 1; // Se suma 1 por la posición
                maxRatio = ratio;
            }
        }

        int constancia = ((maxEspectadores - minEspectadores) * 100) / maxEspectadores; // Calcula la Racha

        System.out.println("-----------------------------------");
        System.out.println("@" + handleStreamer);
        System.out.println("MAX= " + maxEspectadores);
        System.out.println("HYPE= " + maxHype + " (" + maxRatio + ")");
        System.out.println("RACHA= " + constancia);
    }
}

// Ejemplo de entradas válidas:


// 1000 2500 8000 4000 2140
// 520 3200 10000 5410 3210

// 5000 7200 6800 7100 7600
// 2500 4000 3700 4200 4300

// 1500 1800 1900 2000 2100
// 200 250 400 390 380
