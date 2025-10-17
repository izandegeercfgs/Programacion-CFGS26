package org.example.Teoria;

public class stringCosas {
    static void main() {
        String frase = "Netanyahu le regala una paloma de oro a Trump";

        int tamanyo = frase.length();

        System.out.println("> Número de carácteres de la frase: " + tamanyo);

        System.out.println("> Carácter nº34: " + frase.charAt(34));

        String trozo = frase.substring(38, 45);
        System.out.println("> Trozo: " + trozo);

        String trozo2 = frase.substring(38);
        System.out.println("> Trozo 2: " + trozo2);

        int posicion_oro = frase.indexOf("oro");
        System.out.println("> Posición de 'oro': " + posicion_oro);

        int posicion_oro2 = frase.indexOf("oro", 13);
        System.out.println("> Posición de 'oro' a partir de la posición 13: " + posicion_oro);

        int posicion_oro_ultima = frase.lastIndexOf("oro");
        System.out.println("> Última posición de 'oro': " + posicion_oro);

        String fraseMayus = frase.toUpperCase();
        System.out.println("> Frase en mayus: " + fraseMayus);

        String fraseMinus = frase.toLowerCase();
        System.out.println("> Frase en minus: " + fraseMinus);

        String nombre = "Patri                  ";
        System.out.println("> Prubea de trim: " + nombre.trim() + "#");
        System.out.println("> Prueba sin trim: " + nombre + "#");

        boolean igual = nombre.equals("Patri");
        System.out.println("> ¿Es igual " + nombre + " a 'Patri'?: " + igual);

        boolean igual2 = nombre.trim().equals("Patri");
        System.out.println("> ¿Es igual " + nombre.trim() + " a 'Patri'?: " + igual2);

        boolean igual3 = nombre.equalsIgnoreCase("Iván");
        System.out.println("> ¿Es igual " + nombre.trim() + " a 'Patri'?: " + igual3);

        String cambiado = frase.replace("paloma", "pal0ma");
        System.out.println("> Frase cambiada: " + cambiado);
    }
}
