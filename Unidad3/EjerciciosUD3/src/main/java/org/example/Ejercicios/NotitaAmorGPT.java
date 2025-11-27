package org.example.Ejercicios;

import java.util.Random;
import java.util.Scanner;

// Hecho entero tirando de IA, con fin de entenderlo

public class NotitaAmorGPT {

    public static void main(String[] args) {
        int posicionAlumno = 0; // Posición inicial (Aula 0)
        Random random = new Random();
        int posicionNotita;
        int posicionProfe;

        do {
            posicionNotita = random.nextInt(5) + 1;
            posicionProfe = random.nextInt(5) + 1;
        } while (posicionNotita == posicionProfe);

        Scanner teclado = new Scanner(System.in);
        String movimientosValidos;
        String entradaUsuario;
        char direccionChar;
        int nuevaPosicion;
        String nombreDireccion;

        while (true) {
            System.out.println("Estás en la habitación: " + posicionAlumno);

            // 1. Determinar movimientos válidos
            switch (posicionAlumno) {
                case 0: movimientosValidos = "N,E"; break;
                case 1: movimientosValidos = "N,E,O"; break;
                case 2: movimientosValidos = "N,O"; break;
                case 3: movimientosValidos = "S,E"; break;
                case 4: movimientosValidos = "S,O,E"; break;
                case 5: movimientosValidos = "S,O"; break;
                default: movimientosValidos = "";
            }

            System.out.print("¿A dónde quieres ir? [" + movimientosValidos + "] > ");

            entradaUsuario = teclado.nextLine().trim().toUpperCase();

            if (entradaUsuario.length() < 1) {
                System.out.println("----------");
                continue;
            }

            direccionChar = entradaUsuario.charAt(0);
            String direccionStr = String.valueOf(direccionChar);
            nuevaPosicion = posicionAlumno;
            nombreDireccion = "";

            // 2. Procesar el movimiento si es válido
            if (movimientosValidos.contains(direccionStr)) {

                // Cálculo de nueva posición y nombre de la dirección con Switches anidados
                switch (posicionAlumno) {
                    case 0:
                        switch (direccionChar) { case 'N': nuevaPosicion = 3; nombreDireccion = "Norte"; break; case 'E': nuevaPosicion = 1; nombreDireccion = "Este"; break; }
                        break;
                    case 1:
                        switch (direccionChar) { case 'N': nuevaPosicion = 4; nombreDireccion = "Norte"; break; case 'E': nuevaPosicion = 2; nombreDireccion = "Este"; break; case 'O': nuevaPosicion = 0; nombreDireccion = "Oeste"; break; }
                        break;
                    case 2:
                        switch (direccionChar) { case 'N': nuevaPosicion = 5; nombreDireccion = "Norte"; break; case 'O': nuevaPosicion = 1; nombreDireccion = "Oeste"; break; }
                        break;
                    case 3:
                        switch (direccionChar) { case 'S': nuevaPosicion = 0; nombreDireccion = "Sur"; break; case 'E': nuevaPosicion = 4; nombreDireccion = "Este"; break; }
                        break;
                    case 4:
                        switch (direccionChar) { case 'S': nuevaPosicion = 1; nombreDireccion = "Sur"; break; case 'O': nuevaPosicion = 3; nombreDireccion = "Oeste"; break; case 'E': nuevaPosicion = 5; nombreDireccion = "Este"; break; }
                        break;
                    case 5:
                        switch (direccionChar) { case 'S': nuevaPosicion = 2; nombreDireccion = "Sur"; break; case 'O': nuevaPosicion = 4; nombreDireccion = "Oeste"; break; }
                        break;
                }

                System.out.println("\nHas escogido la dirección: " + nombreDireccion);
                System.out.println("Y te mueves a la habitación: " + nuevaPosicion);

                posicionAlumno = nuevaPosicion;

                // 3. Comprobar condición de fin de juego
                if (posicionAlumno == posicionNotita) {
                    System.out.println("Has encontrado la notita!!");
                    break;
                } else if (posicionAlumno == posicionProfe) {
                    System.out.println("Has sido pillado por el profe!");
                    break;
                }
            } else {
                System.out.println("Movimiento inválido.");
            }

            System.out.println("----------");
        }

        teclado.close();
    }
}