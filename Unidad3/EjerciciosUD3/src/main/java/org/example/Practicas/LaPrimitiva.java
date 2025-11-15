package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Formato válido: 6 números entre el 1 y el 49. Un número del 0 al 9 --> N-N-N-N-N-N/R

public class LaPrimitiva {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        final int tamBoleto = 6; // Definir el tamaño del boleto a 6 carácteres

        System.out.println("*** LA PRIMITIVA ***");
        System.out.println("--------------------");

        System.out.print("Introduce los datos de tu boleto: ");

        String boletoEntero = teclado.next(); // Pide al usuario los datos de su boleto

        if (!boletoEntero.matches("(\\d{1,2}-){5}\\d{1,2}/\\d")) { // Comprueba que el formato introducido concida con el requerido
            System.out.println("> ERROR. El boleto introducido debe cumplir con el formato (N-N-N-N-N-N/R).");
            return;
        }

        String[] boletoV = boletoEntero.split("[-/]"); // Quita los signos "-" y "/" para quedarnos solo con los números
        int[] boletoVint = new int[tamBoleto]; // Se crea nuevo boleto donde los numeros del string serán convertidos a int
        int reintegro = Integer.parseInt(boletoV[6]); // Se define el reintegro como el último número
        int[] boletoBancaV = new int[tamBoleto]; // Se crea el boleto a sorteo de la banca

        for (int i = 0; i < tamBoleto; i++) { // Se rellena el boleto con números (int)
            boletoVint[i] = Integer.parseInt(boletoV[i]);
        }

        for (int i = 0; i < tamBoleto; i++) {
            int boletoVnum = Integer.parseInt(boletoV[i]);

            if (boletoVnum < 1 || boletoVnum > 49) { // Se comprueba que los números estén entre 1 y 49
                System.out.println("ERROR. Todos los números del boleto deben estar en el rango admitido (1-49)");
                return;
            }
        }

        if (reintegro < 0 || reintegro > 9) { // Se comprueba el rango del reintegro
            System.out.println("ERROR. El reintegro debe estar en el rango admitido (0-9)");
            return;
        }

        int complementarioBanca = random.nextInt(49) + 1; // Se calcula el nº complementario de la banca
        int reintegroBanca = random.nextInt(10); // Se calcula el reintegro de la banca

        for (int i = 0; i < tamBoleto; i++) { // Comprueba que no haya repetidos
            int randomNum;
            boolean repetido;

            do {
                randomNum = random.nextInt(49) + 1; // Calcula el número
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (boletoBancaV[j] == randomNum) { // Si el número del boleto == al número random, salta el boolean repetido
                        repetido = true;
                        break;
                    }
                }

                if (randomNum == complementarioBanca) {
                    repetido = true;
                }

            } while (repetido);

            boletoBancaV[i] = randomNum; // Genera el número hasta que deje de ser repetido
        }

        System.out.println("--------------------");
        System.out.print("Ha salido: ");
        System.out.println(Arrays.toString(boletoBancaV)); // Muestra el boleto de la banca
        System.out.println("Complementario: " + complementarioBanca); // Muestra el complementario
        System.out.println("Reintegro: " + reintegroBanca); // Muestra el reintegro

        // Contadores para contabilizar la aparición de aciertos, ya sean números del boleto, el complementario o el reintegro
        int contadorAciertos = 0;
        int contadorCompl = 0;
        int contadorReint = 0;

        for (int i = 0; i < tamBoleto; i++) {
            boolean coincidencia = false;

            for (int j = 0; j < tamBoleto; j++) {
                if (boletoVint[i] == boletoBancaV[j]) { // Contador para los aciertoa
                    coincidencia = true;
                    contadorAciertos++;
                    break;
                }
            }
            if (!coincidencia && boletoVint[i] == complementarioBanca) { // Contador para el complementario
                contadorCompl = 1;
            }
        }

        if (reintegroBanca == reintegro) { // Contador para el reintegro
            contadorReint++;
        }

        System.out.println("--------------------");

        // Imprime las diversas posibilidades
        if (contadorAciertos == 6 && contadorReint == 1) {
            System.out.println("Categoría especial: Acertar los 6 números de la combinación ganadora y el reintegro.");
            return;
        } else if (contadorAciertos == 6) {
            System.out.println("1ª Categoría: Acertar los 6 números de la combinación ganadora.");
        } else if (contadorAciertos == 5 && contadorCompl == 1) {
            System.out.println("2ª Categoría: Acertar 5 números de la combinación y el número complementario.");
        } else if (contadorAciertos == 5) {
            System.out.println("3ª Categoría: Acertar 5 números de la combinación.");
        } else if (contadorAciertos == 4) {
            System.out.println("4ª Categoría: Acertar 4 números de la combinación.");
        } else if (contadorAciertos == 3) {
            System.out.println("5ª Categoría: Acertar 3 números de la combinación.");
        } else if (contadorReint == 1) {
            System.out.println("6ª Categoría: Acertar el número de reintegro.");
        } else {
            System.out.println("No premiado.");
        }
    }
}

// 23-44-11-7-34-2/7