package org.example.Ejercicios;

import java.util.Scanner;

public class bateriaPreExamen {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.println("¿Cuántos números quieres introducir?");
        int cantidadnumeros = teclado.nextInt();

        int mayor = 0;
        int menor = 0;
        int cero = 0;

        for (int i = 0; i < cantidadnumeros; i++) {
            System.out.println("Introduce un numero");
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayor += 1;
            } else if (numero < 0) {
                menor += 1;
            } else if (numero == 0) {
                cero += 1;
            }
        }

        System.out.println("Hay " + mayor + " número/s mayores que 0, " + menor + " número/s menores que 0 y " + cero + " número/s iguales que 0");


    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.println("Introduce un número (base de la potencia)");
        int base = teclado.nextInt();

        System.out.println("Introduce un número (exponente)");
        int exponente = teclado.nextInt();

        int potencia = 0;

        for (int i = 1; i < exponente; i++) {
            while (true) {
                potencia += base * base;
            }
        }
        System.out.println("El resultado de tu potencia es: " + potencia);
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.println("¿A cuantos meses vista quieres financiar tu producto?");
        int meses = teclado.nextInt();

        int resultado = 5;
        int total = 5;

        for (int i = 0; i < meses; i++) {
            total += resultado * 2;
            resultado = resultado * 2;
            System.out.println("El " + (i + 1) + "º mes te toca pagar: " + resultado + "€");
        }
        System.out.println("El total a pagar es " + total + "€");
    }

    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.print("Introduce la nota del alumno: ");
        int nota = teclado.nextInt();
        ;

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("Esa nota no es correcta, PAYASO.");
        }
    }

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        int numerosalarios = 5;

        int mayor = 0;
        int mayorsalario = 0;


        for (int i = 1; i <= numerosalarios; i++) {
            System.out.println("Introduce el salario nº" + i + ":");
            int salario = teclado.nextInt();

            if (salario >= 1000) {
                mayor += 1;
            }
            if ((salario + i) > mayorsalario) {
                mayorsalario = salario;
            }
        }
        System.out.println("Hay " + mayor + " sueldos mayores de 1000€, siendo " + mayorsalario + "€ el mayor.");
    }

    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.println("¿De cuántos alumnos vas a tomar medidas?");
        int num_alumnos = teclado.nextInt();

        int mayor = 0;
        int alto = 0;
        int sumaedad = 0;
        int sumaaltura = 0;

        for (int i = 1; i <= num_alumnos; i++) {
            System.out.println("Introduce la edad del alumno nº" + i + ":");
            int edad = teclado.nextInt();
            sumaedad += edad;

            System.out.println("Introduce la altura (en cm) del alumno nº" + i + ":");
            int altura = teclado.nextInt();
            sumaaltura += altura;

            if (edad >= 18) {
                mayor += 1;
            }
            if (altura >= 175) {
                alto += 1;
            }
        }
        int mediaedad = sumaedad / num_alumnos;
        int mediaaltura = sumaaltura / num_alumnos;

        System.out.println("La media de altura es: " + mediaaltura + " y la media de edad es: " + mediaedad);
        System.out.println("Hay " + mayor + " personas mayores de 18.");
        System.out.println("Hay " + alto + " personas más altas de 175cm.");
    }

    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        System.out.println("Indica el último número de la secuencia de términos: ");
        int secuencia = teclado.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= secuencia; i++) {
            System.out.print(a + " ");
            int total = a + b;
            a = b;
            b = total;
        }
    }
}
