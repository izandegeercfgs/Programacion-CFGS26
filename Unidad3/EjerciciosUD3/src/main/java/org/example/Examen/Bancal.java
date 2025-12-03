package org.example.Examen;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Bancal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("**** BIENVENIDO AL OLIVÓMETRO ****");

        System.out.println("Introduce el tamaño de tu bancal...");

        int ancho;
        int largo;

        do{
            try {
                System.out.println("Ancho: ");
                ancho = teclado.nextInt();
                System.out.println("Largo: ");
                largo = teclado.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Introduce valores numéricos");
                teclado.nextLine();
            }
        }while(true);

        teclado.nextLine();

        int bancal[][] =  new int[largo][ancho];

        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal: ");

        bancal:
        for (int i = 0; i < bancal.length; i++) {

            String hilera[] = teclado.nextLine().split(" ");

            if (hilera.length == bancal[i].length){
                for (int j = 0; j < bancal[i].length; j++) {
                    try{
                        int kg = Integer.parseInt(hilera[j]);
                        if (kg < 1 || kg > 50){
                            System.out.println("Introduce valores correctos (1-50)");
                            i--;
                            continue bancal;
                        }else{
                            bancal[i][j] = kg;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Introduce números");
                        i--;
                        continue bancal;
                    }
                }
            }else{
                System.out.println("Formato incorrecto");
                i--;
            }

        }

        System.out.println("==========================");

        // SALIDA
        //1)
        System.out.println("MAPA tu bancal actual: ");

        for (int fila[] : bancal){
            for (int olivo : fila){
                System.out.print(olivo + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        // 2)
        // a)
        int kg_generados = 0;
        for (int fila[] : bancal){
            for (int kg : fila){
                kg_generados += kg;
            }
        }
        System.out.println("Total kg generados: " + kg_generados);
        System.out.println("Litros totales obtenidos: " + (kg_generados/8.0) + " L");

        //b)
        int kg_hilera = 0;
        System.out.println("Litros por hilera...");
        for (int i = 0; i < bancal[0].length; i++) {
            kg_hilera = 0;
            for (int j = 0; j < bancal.length; j++) {
                kg_hilera += bancal[j][i];
            }
            System.out.println(" - Hilera " + (i+1) + ": " + kg_hilera/8.0 + " L ");
        }

        // c)
        System.out.println("Olivos más productivos (>35kg): ");

        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal[i].length; j++) {
                if (bancal[i][j]>35){
                    System.out.println(" - En la posición (" + (i+1) + "," + (j+1) + ") con " + bancal[i][j] + "kg");
                }
            }
        }

        // d)
        int mayor_actual = bancal[0][0];
        int i_mayor = 0;
        int j_mayor = 0;
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal[i].length; j++) {
                if (bancal[i][j]>mayor_actual){
                    mayor_actual=bancal[i][j];
                    i_mayor = i;
                    j_mayor = j;
                }
            }
        }

        System.out.println("Olivo TOP (" + mayor_actual + " kg generados) en la posición (" + (i_mayor+1) + "," + (j_mayor+1) + ") del bancal.");

        System.out.println("==========================");

        //e)
        System.out.println("MAPA para replantar: ");

        for (int fila[] : bancal){
            for (int olivo : fila){
                if (olivo >= 5){
                    System.out.print("O" + " ");
                }else{
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }

        System.out.println("==========================");

        // f)
        System.out.println("MAPA estimación después de replantar: ");
        for (int fila[] : bancal){
            for (int olivo : fila){
                if (olivo >= 5){
                    System.out.print(olivo + " ");
                }else{
                    System.out.print(aleatorio.nextInt(21)+15 + " ");
                }
            }
            System.out.println();
        }


    }
}