package com.divyanka;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = (int) (90.68f);
        System.out.println(num);

        
        //type casting
//        int num = (int)(88.56f);
//        System.out.println(num);

        //automatically type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

        byte a = 40;
        byte b = 60;
        byte c = 100;
        int d = a* b / c;
        System.out.println(d);
    }
}
