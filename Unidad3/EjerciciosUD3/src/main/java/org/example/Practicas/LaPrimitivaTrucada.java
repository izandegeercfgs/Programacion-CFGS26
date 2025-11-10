package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Formato válido: 6 números entre el 1 y el 49. Un número del 0 al 9 --> N-N-N-N-N-N/R

public class LaPrimitivaTrucada {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        final int tamBoleto = 6;

        System.out.println("*** LA PRIMITIVA ***");
        System.out.println("--------------------");

        System.out.print("Introduce los datos de tu boleto: ");
        String boletoEntero = "23-44-11-7-3-2/7";
        System.out.println(boletoEntero);
//        String boletoEntero = teclado.next();

        if (!boletoEntero.matches("(\\d{1,2}-){5}\\d{1,2}/\\d")) {
            System.out.println("> ERROR. El número introducido debe cumplir con el formato (N-N-N-N-N-N/R).");
            return;
        }

        String[] boletoV = boletoEntero.split("[-/]");
        int[] boletoVint = new int [tamBoleto];
        int reintegro = Integer.parseInt(boletoV[6]);
        int[] boletoBancaV = {23, 44, 11, 7, 34, 2};

        for (int i = 0; i < tamBoleto; i++) {
            boletoVint[i] = Integer.parseInt(boletoV[i]);
        }

        for (int i = 0; i < tamBoleto; i++) {
            int boletoVnum = Integer.parseInt(boletoV[i]);

            if (boletoVnum < 1 || boletoVnum > 49){
                System.out.println("ERROR. Todos los números del boleto deben estar en el rango admitido (1-49)");
                return;
            }
        }

        if (reintegro < 0 || reintegro > 9){
            System.out.println("ERROR. El reintegro debe estar en el rango admitido (0-9)");
            return;
        }

        int complementarioBanca = 2;
        int reintegroBanca = 1;

        System.out.println("--------------------");
        System.out.print("Ha salido: ");
        System.out.println(Arrays.toString(boletoBancaV));
        System.out.println("Complementario: " + complementarioBanca);
        System.out.println("Reintegro: " + reintegroBanca);

        int contadorAciertos = 0;
        int contadorCompl = 0;
        int contadorReint = 0;

        for (int i = 0; i < tamBoleto; i++) {
            boolean coincidencia = false;

            for (int j = 0; j < tamBoleto; j++) {
                if (boletoVint[i] == boletoBancaV[j]) {
                    coincidencia = true;
                    contadorAciertos++;
                    break;
                }
            }
            if (!coincidencia && boletoVint[i] == complementarioBanca) {
                contadorCompl = 1;
            }
        }

        if (reintegroBanca == reintegro) {
            contadorReint++;
        }

        System.out.println("--------------------");

        if (contadorAciertos == 6 && contadorReint == 1){
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