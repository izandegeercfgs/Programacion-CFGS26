package org.example.Ejercicios;

import java.util.Arrays;

public class EliminarDuplicadosArrays {
    public static void metodo1() {
        int vector[] = {2, 3, 3, 5, 6, 6, 10};

        int vectorAuxiliar[] = new int[vector.length];

        int tamanyo = 1;

        vectorAuxiliar[0] = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != vector[i - 1]) {
                vectorAuxiliar[i] = vector[i];
                tamanyo++;
            }
        }

        int[] newVector = new int[tamanyo];
        int j = 0;

        for (int i = 0; i < tamanyo; i++) {
            if (vectorAuxiliar[i] != 0) {
                newVector[j] = vectorAuxiliar[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newVector));
        System.out.println(Arrays.toString(vectorAuxiliar));
    }

    public static void metodo2(String[] args) {
        int[] vector = {2, 3, 3, 5, 6, 6, 10};
        int tamanyo = 1;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != vector[i - 1]) {
                tamanyo++;
            }
        }

        int[] newVector = new int[tamanyo];
        newVector[0] = vector[0];
        int j = 0;

        for (int i = 0; i < tamanyo; i++) {
            if (newVector[i] != 0) {
                newVector[j] = vector[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newVector));
        System.out.println(Arrays.toString(vector));
    }
}
