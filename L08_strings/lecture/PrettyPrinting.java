package com.L08_strings.lecture;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 354.54545f;
        System.out.printf("formatted number is %.2f", a);  // 354.55
        System.out.println("\n");

        System.out.printf("Pie = %.3f", Math.PI);
        System.out.println("\n");

        System.out.printf("Hello my name is %s and I am a %s", "Divu", "Girl");
        System.out.println("\n");
    }
}
