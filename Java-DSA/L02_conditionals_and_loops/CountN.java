package com.L02_conditionals_and_loops;

import java.util.Scanner;
public class CountN {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter the no: ");
//        int n = in.nextInt();
        int n = 3534;
        System.out.println("no: " + n);
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10; //n /= 10
        }

        System.out.println("Occurrence of no 3 is = " + count);
    }
}
