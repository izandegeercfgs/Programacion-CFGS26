package org.example;

import java.util.Arrays;

public class Chuleta {
    public static void main() {
        int numero = 1;
        String palabra = "Hola";

        int[] numeroV = {1,2,4,5};
        String[] palabraV = {"Hola", "Adiós"};

        Arrays.toString(palabraV); // Convierte el Array a String (Para mostrarlo)
        Arrays.asList(palabraV).contains(palabra); // Comprueba si el vector contiene "x" palabra
    }
}
