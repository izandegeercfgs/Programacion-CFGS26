package org.example.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class actividadesRandom {
    public static void ejercicio1() {
        System.out.println("> Ejercicio 1. Lanzamiento de dados.");
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int suma = dado1 + dado2;

        System.out.println("Se lanzan los dados...");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("La suma da: " + suma);
    } // Lanzamiento de dados

    public static void ejercicio2() {
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int largo = 12;
        int pos;

        String contrasenya = "";

        for (int i = 0; i <= largo; i++) {
            Random aleatorio = new Random();
            pos = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(pos);
        }

        System.out.println("Contraseña: " + contrasenya);
    } // Generador de Contraseñas

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduzca el rango mínimo: ");
        int minimo = teclado.nextInt();

        System.out.print("Introduzca el rango máximo: ");
        int maximo = teclado.nextInt();

        while (true) {
            if (maximo < minimo) {
                break;
            } else {
                System.out.print("Introduce la cantidad de numeros a imprimir: ");
                int randomNum = teclado.nextInt();
                for (int i = 0; i < randomNum; i++) {
                    System.out.println(random.nextInt((maximo - minimo + 1) + minimo));
                }
            }
        }
    } // Números aleatorios en un rango

    public static void ejercicio4() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int largo = random.nextInt(2) + 6;

        String contrasenya = "";
        int posicion;

        for (int i = 0; i <= largo; i++) {
            Random aleatorio = new Random();
            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);
        }

        System.out.println(contrasenya);
    } // Contraseña mejorada
}