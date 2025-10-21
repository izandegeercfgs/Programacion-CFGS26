package org.example.Practicas;

import java.util.Scanner;

public class calculadoraSimple {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        try {
            System.out.println("> Introduce operando: ");
            int operando = teclado.nextInt();

            System.out.println("------------------");
            System.out.println("(+) -> Suma");
            System.out.println("(-) -> Resta");
            System.out.println("(x) -> Multiplicación");
            System.out.println("(/) -> División");
            System.out.println("(R) -> Raíz Cuadrada");
            System.out.println("------------------");
            System.out.println("Elige una operación:");

            String operacion = teclado.next();

            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/") || operacion.equals("R")) {
                if (operacion.equals("R")) {
                    if (operando > 0) {
                        int resultado = (int) Math.sqrt(operando);
                        System.out.println("Raiz cuadrada de " + operando + " es " + resultado);
                    } else {
                        System.err.println("ERROR. No es posible realizar la Raíz cuadrada de un número negativo.");
                    }
                } else {
                    System.out.println("> Introduce el segundo operando: ");
                    int operando2 = teclado.nextInt();

                    switch (operacion) {
                        case "+":
                            int suma = operando + operando2;
                            System.out.println("El resultado de " + operando + " + " + operando2 + " es " + suma);
                            break;

                        case "-":
                            int resta = operando - operando2;
                            System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resta);
                            break;

                        case "x":
                            if (operando2 == 0) {
                                System.out.println("El resultado de " + operando + " x " + operando2 + " es 0");
                            } else {
                                int multiplicacion = operando * operando2;
                                System.out.println("El resultado de " + operando + " x " + operando2 + " es " + multiplicacion);
                            }
                            break;
                        case "/":
                            if (operando2 == 0 || operando == 0) {
                                System.err.println("ERROR. No es posible realizar la división de 0, resultado indefinido.");
                                break;
                            } else {
                                double division = (double) operando / operando2;
                                System.out.println("El resultado de " + operando + " / " + operando2 + " es " + division);
                                break;
                            }
                        default:
                            System.out.println("ERROR.");
                    }
                }
            } else {
                System.err.println("ERROR. Introduce uno de los signos permitidos.");
            }
        } catch (Exception e) {
            System.err.println("Se ha producido un error. El sistema ha detectado una excepción.");
            System.out.println("Saliendo del programa...");
        }
    }
}
