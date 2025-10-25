package org.example.Practicas;

import java.util.Scanner;

// Ejemplos de ISBN Válido = 0201103311 / 156881111X

public class comprobadorISBN {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** COMPROBADOR DE ISBN ***");
        System.out.println("-----------------");

        String isbn = "";
        boolean formato = false;
        boolean roto = false; // En caso de tener '?' en el ISBN, se detectará como roto


        // Cosas a comprobar: Solo debe aceptar números, salvo en 2 excepciones:
        // 1. Que el último carácter sea una "X" en cuyo caso se sustituirá por un '10'
        // 2. Que uno de los carácteres sea "?" en cuyo caso solo será válido el modo 2 (Reparar ISBN)

        while (!formato) { // Comprueba que el formato sea correcto
            System.out.print("> Introduzca el ISBN-10: ");
            isbn = teclado.nextLine();
            int contador = 0; // Contador de '?'
            boolean error = false;

            if (isbn.length() != 10) { // Comprueba el largo del ISBN
                System.out.println("> El ISBN-10 debe tener 10 caracteres. Inténtelo de nuevo: ");
                continue; // Pide el ISBN de nuevo
            }

            for (int i = 0; i < isbn.length(); i++) { // Comprueba la existencia (y posición) de la 'X' y/o '?'
                char charISBN = isbn.charAt(i);

                if (charISBN == 'X') { // Contador de 'X'
                    if (i != 9) {
                        System.err.println("x ERROR. La 'X' debe de estar en la última posición o no estar.");
                        error = true;
                    }
                }

                if (charISBN == '?') { // Contador de '?'
                    contador++;
                }
            }

            if (contador == 1) {
                roto = true;
            } else if (contador >= 2) {
                System.err.println("x ERROR. Solo puede haber un '?' en el ISBN.");
                error = true;
            }

            if (!error) {
                formato = true;
            }
        }

        System.out.println("-----------------");
        System.out.println("1. Validar ISBN");
        System.out.println("2. Reparar ISBN");
        System.out.println("X. Salir");
        System.out.println("-----------------");

        System.out.print("Introduce el modo que vas a utilizar: ");
        String modo = teclado.nextLine();
        modo = modo.toLowerCase(); // Pasamos el modo a minus para que no haya problemas de lectura
        System.out.println("-----------------");


        if (modo.equals("1")) { // Modo 1 - Validar ISBN
            System.out.println("> Ha escogido: Validar ISBN\n");

            if (roto) {
                System.err.println("x ERROR. No se puede validar un ISBN con '2'. Pruebe el Modo 2 - Reparar ISBN.");
                return;
            }

            int suma = 0;

            for (int i = 0; i < isbn.length(); i++) {
                char charISBN2 = isbn.charAt(i);
                int multiplicador;

                if (charISBN2 == 'X') { // Establece el multiplicador según la posición (1, 2, 3...) salvo que el valor sea 'X', en cuyo caso lo convierte a 10
                    multiplicador = 10;
                } else {
                    multiplicador = Integer.parseInt(isbn.substring(i, i + 1));
                }

                suma += multiplicador * (i + 1);
            }


            if (suma % 11 == 0) { // En caso de ser divisible entre 11, es válido
                System.out.println("El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }
        } else if (modo.equals("2")) { // Modo 2 - Reparar ISBN
            System.out.println("> Ha escogido: Reparar ISBN\n");

            if (!roto) { // Si no hay '?' no es posible reparar
                System.err.println("x ERROR. No ha sido posible reparar el ISBN.");
                return;
            }

            int suma = 0;
            int contador = 0;
            int posicionInterrogacion = 0;

            for (int i = 0; i < isbn.length(); i++) {
                char posicionInt = isbn.charAt(i);

                if (posicionInt == '?') {
                    contador++;
                    posicionInterrogacion = i;
                    continue;
                }

                int numero;
                try {
                    numero = Integer.parseInt(String.valueOf(posicionInt));
                } catch (NumberFormatException e) {
                    if (i == 9 && posicionInt == 'X') {
                        numero = 10;
                    } else {
                        System.err.println("x ERROR. Solo se aceptan dígitos, 'X' o '?' como valor final.");
                        return;
                    }
                }

                suma += numero * (i + 1);
            }

            if (contador == 1) {
                boolean coincidenciaInt = false;

                for (int i = 0; i <= 9; i++) {
                    int sumaTemp = suma + (i * (posicionInterrogacion + 1));

                    if ((sumaTemp % 11) == 0) {
                        System.out.println("El número que falta es: " + i);
                        coincidenciaInt = true;
                        break;
                    }
                }

                if (posicionInterrogacion == 9) {
                    int sumaTemp2 = suma + (10 * (posicionInterrogacion + 1));
                    if ((sumaTemp2 % 11) == 0) {
                        System.out.println("El número que falta es: 10");
                        coincidenciaInt = true;
                    }
                }

                if (!coincidenciaInt) {
                    System.err.println("x No se pudo reparar el ISBN.");
                }
            } else {
                System.err.println("xERROR. No hay nada que reparar");
            }
        } else if (modo.equals("x")) { // Modo X - Salir del programa
            System.out.println("> Ha escogido: Salir\n");
            System.err.println("Saliendo...");
        } else { // Modo NO válido
            System.err.println("x ERROR. Introduzca un proceso válido.");
        }
    }
}
