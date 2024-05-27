package com.divyanka;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 no's: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("print the sum of num1 and num2 : " + sum);
    }
}
