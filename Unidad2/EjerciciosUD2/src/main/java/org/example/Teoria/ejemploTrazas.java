package org.example.Teoria;

import java.util.Scanner;

public class ejemploTrazas {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 1;
        int d;

        while(a!=0){
            b++;
            c = c * a / b;
            a = sc.nextInt();
        }

        d = b + c;

        System.out.println(d);

    }
}
