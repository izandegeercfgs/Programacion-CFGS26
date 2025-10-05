package Unidad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura = 0;
        double diferencia = 140 - altura;

        int Peso = 0;
        double PesoMinimo = 0;
        int PesoMaximo = 120;

        System.out.println("**BIENVENIDO AL RATÓN JUGUETÓN**");

        System.out.println("> Leyendo altura(cm)...");

        try {
            altura = teclado.nextInt(); // Se le pide la altura al usuario
            PesoMinimo = ((altura*2)/8);
        } catch (InputMismatchException e) {
            System.err.println("X ERROR. Se debe de introducir un número para continuar.");
            return;
        }

        if (altura < 0 || altura > 230) { // En caso de medir menos de 0 o más de 230 cm, lo asume como error y pide que vuelva a subir
            System.err.println("X ERROR DE LECTURA. Por favor, baje de la báscula y vuelva a subir.");
            return;
        } else if (altura < 140) { // Tampoco permite usuarios de menos de 140cm de altura por seguridad
            System.err.println("< Lo siento, no puedes montar en la atracción. Te faltan " + diferencia + "cm de altura.");
            return;
        }

        System.out.println("> Leyendo peso(kg)...");
        try {
            Peso = teclado.nextInt(); // Se le pide el peso al usuario
        } catch (InputMismatchException e) {
            System.err.println("X ERROR. Se debe de introducir un número para continuar.");;
            return;
        }

        double DifPesoMinimo = PesoMinimo - Peso;
        double DifPesoMáximo = Peso - PesoMaximo;

        if (Peso > PesoMaximo) { // Se calcula si el peso es adecuado para la atracción.
            System.out.println("> Pesas " + Peso + "kg. Peso mínimo calculado: " + PesoMinimo + "kg.");
            System.err.println(">> NO PUEDES SUBIR. Superas el peso máximo por " + DifPesoMáximo + "kg.");
            return;
        } else if (Peso < PesoMinimo) {
            System.out.println("> Pesas " + Peso + "kg. Peso mínimo calculado: " + PesoMinimo + "kg.");
            System.err.println(">> NO PUEDES SUBIR. Te faltan " + DifPesoMinimo + "kg.");
            return;
        } else {
            System.out.println("> Pesas " + Peso + "kg. Peso mínimo calculado: " + PesoMinimo + "kg.");
            System.out.println(">> Sube a la atracción.");
            return;
        }
    }
}
