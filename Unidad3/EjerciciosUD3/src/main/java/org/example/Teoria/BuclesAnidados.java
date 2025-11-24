package org.example.Teoria;

import javax.sound.midi.MidiFileFormat;

public class BuclesAnidados {
    public static void ejemplo1() {
        bucle1:
        for (int i = 0; i < 10; i++) {
            bucle2:
            for (int j = 0; j < 10; j++) {
                bucle3:
                for (int k = 0; k < 10; k++) {
                    if (i == j && j == k) {
                        break bucle2;
                    }
                }
            }
        }
    }

    public static void ejemplo2() {
        boolean esVerdadero = true;
        externo:
        //etiqueta la siguiente sentencia, es decir el for.
        for (int i = 0; i < 5; i++) {
            while (esVerdadero) {
                System.out.println("Hola!");
                break externo; //break con etiqueta, hace que rompa la sentencia de la etiqueta, el for.
            }
            System.out.println("Despues del while!");
        }
        System.out.println("Despues del for!");
    }

    public static void ejemploClase1() {
        bucle_Fuera:
        for (int i = 0; i < 10; i++) {
            System.out.println("Bucle fuera: " + i);
            bucle_dentro:
            for (int j = 0; j < 5; j++) {
                System.out.println("bucle dentro: " + j);
                if (j == 4) {
                    continue bucle_Fuera;
                }
            }
            System.out.println("Hola soy el de fuera");
        }
    }
}

