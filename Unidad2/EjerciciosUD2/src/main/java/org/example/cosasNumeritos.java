package org.example;

public class cosasNumeritos {
    static void main() {
        int num = 123;

        String num_String = Integer.toString(num);

        // Numeros independientes
        String numIzquierda = num_String.substring(0,1);
        int numIzquierdaInt = Integer.parseInt(numIzquierda);

        String numCentro = num_String.substring(1,2);
        int numCentroInt = Integer.parseInt(numCentro);

        String numDerecha = num_String.substring(2,3);
        int numDerechaInt = Integer.parseInt(numDerecha);



    }
}
