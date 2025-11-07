package org.example.Teoria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split {
    public static void main() {
        String cadena = "Hola,Soy,Una,Cadena";

        String[] subcadena = cadena.split(",");

        System.out.println(Arrays.toString(subcadena));
    }
}
