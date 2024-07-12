package com.L04_methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();  //function call

//        int ans = sum2();  //ans -> is a reference variable
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no 1: ");
        int n1 = in.nextInt();
        System.out.print("enter the no 2: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;  //return used for -> use the value
    }

   static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no 1: ");
        int n1 = in.nextInt();
        System.out.print("enter the no 2: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.print("The sum = " + sum);  //print the value
    }

    /*
     *  return_type name(arguments) {
            //body
            return statement;
        }
    */
}
