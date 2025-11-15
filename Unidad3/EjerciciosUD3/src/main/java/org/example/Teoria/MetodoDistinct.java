package org.example.Teoria;

import java.util.Arrays;

public class MetodoDistinct {
    public static void main() {
        int vector[] = {3,3,7,8,8,9,10,15,15};
        int vector2[] = Arrays.stream(vector).distinct().toArray();
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));
    }
}
