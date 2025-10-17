package org.example.Practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numeroSuerte {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        String fecha;
        boolean formatoCorrecto = false;

        System.out.println("NÚMERO DE LA SUERTE");
        System.out.println("-------------------");

        System.out.print("> Introduce tu fecha de nacimiento (dd/mm/aaaa): ");

        while (!formatoCorrecto) {
            fecha = teclado.nextLine(); // Se pide la fecha de nacimiento al usuario

            if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
                try {
                    int dia = Integer.parseInt(fecha.substring(0, 2)); // Se guarda el día
                    int mes = Integer.parseInt(fecha.substring(3, 5)); // Se guarda el mes
                    int anyo = Integer.parseInt(fecha.substring(6)); // Se guarda el año

                    if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anyo >= 1925 && anyo <= 2025) { // Comprueba que los valores de día, mes y año sean válidos
                        formatoCorrecto = true;

                        int suma = dia + mes + anyo; // Se calcula la suma

                        System.out.println(fecha);

                        String sumaStr = Integer.toString(suma);

                        System.out.println(dia + "+" + mes + "+" + anyo + " = " + suma);

                        // Se separan las cifras del año para hacer la suma
                        int num1 = Integer.parseInt(sumaStr.substring(0, 1));
                        int num2 = Integer.parseInt(sumaStr.substring(1, 2));
                        int num3 = Integer.parseInt(sumaStr.substring(2, 3));
                        int num4 = Integer.parseInt(sumaStr.substring(3, 4));

                        int suma2 = num1 + num2 + num3 + num4;

                        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + suma2);

                        System.out.println("> Tu número de la suerte es " + suma2);
                    } else { // En caso de de no cumplir con el formato correcto, da el error
                        System.err.print("x ERROR. La fecha debe cumplir con el siguiente formato -> (dd/mm/aaaa). Intente de nuevo: ");
                    }
                } catch (NumberFormatException | InputMismatchException e) { // Si la fecha contiene valores NO numéricos, salta la excepción
                    System.err.print("x ERROR. La fecha contiene valores no númericos. Intente de nuevo: ");
                }
            } else {
                System.err.print("x ERROR. La fecha debe cumplir con el siguiente formato -> (dd/mm/aaaa). Intente de nuevo: ");
            }
        }
    }
}
