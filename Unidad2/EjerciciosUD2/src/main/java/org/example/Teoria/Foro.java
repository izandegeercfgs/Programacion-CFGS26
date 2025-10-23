package org.example.Teoria;

public class Foro {
    static void main() {
        int a = 5; int b = 3; int c = 2;

        int resultado = a-- > b++ && b < c ? a += b :
                a == b ? a -= c :
                        b > c ? ++a : --a;

        System.out.println(resultado);
    }
}
