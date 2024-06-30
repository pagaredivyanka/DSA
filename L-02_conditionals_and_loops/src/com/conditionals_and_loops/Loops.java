package com.conditionals_and_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // Q: print number from 1 to 5
        /*
            syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                //body
            }
         */
//        System.out.println("Q: print number from 1 to 5");
//        for(int n = 1; n <= 5; n+=2){
//            System.out.println(n);
//        }

//        print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
////            System.out.println(num + " ");
//            System.out.println("Hello world");
//        }

//        while loops

        /*
            syntax:
            while (condition){
                //body
            }
         */

//        for (int num = 1; num <=5; num+=2) {
//            System.out.println(num);
//        }

        int num = 1;
        while (num <= 5) {
//            System.out.println(num);
            num += 1;
        }


//        do while  -> it must perform operation at least once
        /*
            do {
                //body
            } while (condition);
         */

        int n = 1;
        do {
            System.out.println("hello");
        } while(n != 1);
    }
}
