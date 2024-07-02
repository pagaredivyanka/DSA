package com.L01_basic;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int num = (int) (90.68f);
//        System.out.println(num);


        //type casting
//        int num = (int)(88.56f);
//        System.out.println(num);

        //automatically type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 60;
//        byte c = 100;
//        int d = a* b / c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println("नमस्ते");

//        System.out.println(3*6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 59488;
        float f = 9.045f;
        double d = 3.456433;
        double result = (f * b) + (i / c) - (d - s);
//        float + int - double = double
        System.out.println("(f * b) = " + (f * b) + " | (i / c) = " + (i / c) + " | (d - s) = " + (d - s));
        System.out.println(result);
    }
}