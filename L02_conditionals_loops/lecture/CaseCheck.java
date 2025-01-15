package com.L02_conditionals_loops.lecture;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("for string");
//        String word = "Hello";
//        System.out.println("charAt(3) in word 'Hello' = " + word.charAt(3));

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}