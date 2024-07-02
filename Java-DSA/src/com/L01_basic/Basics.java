package com.L01_basic;
public class Basics {
    public static void main(String[] args){

//        if statements

        int a = 10;
        if (a == 10) {
            System.out.println("if statement is 'true'");
        } else {
            System.out.println("if statment is 'false'");
        }


//      while loop  (used when we don't know how many times the loop will run/execute)

//        int count = 1;
//        while(count != 5){
//            System.out.println(count);
//            count++;
//        }

//        for loop (when we know how many times for loop will execute)

        for (int count = 1; count !=5; count++) {
            System.out.println(count);
        }
    }
}