package org.example.Practicas;

import java.util.Scanner;

public class calculadoraSimple {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        System.out.println("> Introduce operando: ");
        try {
            int operando = teclado.nextInt(); // Se pide el operando al usuario

            System.out.println("------------------"); // Despliegue de posibles operaciones
            System.out.println("(+) -> Suma");
            System.out.println("(-) -> Resta");
            System.out.println("(x) -> Multiplicación");
            System.out.println("(/) -> División");
            System.out.println("(R) -> Raíz Cuadrada");
            System.out.println("------------------");
            System.out.println("Elige una operación:");

            String operacion = teclado.next(); // Se pregunta al usuario qué operación quiere realizar junto al operando 1

            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/") || operacion.equals("R")) { // Comprueba que la operación introducida sea una de las disponibles
                if (operacion.equals("R")) { // Raíz cuadrada
                    if (operando > 0) {
                        double resultado = Math.sqrt(operando);
                        System.out.println("Raiz cuadrada de " + operando + " es " + resultado);
                    } else {
                        System.err.println("ERROR. No es posible realizar la Raíz cuadrada de un número negativo.");
                    }
                } else { // En caso de no ser raíz cuadrada...
                    System.out.println("> Introduce el segundo operando: ");
                    int operando2 = teclado.nextInt(); // Pide el segundo operando

                    switch (operacion) {
                        case "+": // En caso de suma
                            int suma = operando + operando2;
                            System.out.println("El resultado de " + operando + " + " + operando2 + " es " + suma);
                            break;

                        case "-": // En caso de resta
                            int resta = operando - operando2;
                            System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resta);
                            break;

                        case "x": // En caso de multiplicación
                            if (operando2 == 0) {
                                System.out.println("El resultado de " + operando + " x " + operando2 + " es 0");
                            } else {
                                int multiplicacion = operando * operando2;
                                System.out.println("El resultado de " + operando + " x " + operando2 + " es " + multiplicacion);
                            }
                            break;
                        case "/": // En caso de división
                            if (operando2 == 0 || operando == 0) { // En caso de que uno de los operandos sean 0...
                                System.err.println("ERROR. No es posible realizar la división de 0, resultado indefinido.");
                                break;
                            } else {
                                double division = operando / operando2;
                                System.out.println("El resultado de " + operando + " / " + operando2 + " es " + division);
                                break;
                            }
                        default:
                            System.out.println("ERROR.");
                    }
                }
            } else {
                System.err.println("ERROR. Introduce uno de los signos permitidos."); // En caso de no introducir uno de los signos, salta este error
            }
        } catch (Exception e) { // Si salta excepción...
            System.err.println("Se ha producido un error. El sistema ha detectado una excepción.");
            System.out.println("Saliendo del programa...");
        }
    }
}
