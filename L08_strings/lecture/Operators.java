package com.L08_strings.lecture;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println((char) ('a' + 3)); // d


        // vvimp --> when integer is concatenated with a string then it convrted to it's wrapper class Integer
        System.out.println("a" + 1); // a1
        // integer will be converted to Integer that will call toString()
        // this is same as after a few steps: "a" + "1" --> a1

        System.out.println("Divu" + new ArrayList<>()); // Divu[]
        System.out.println("Divu" + new Integer(56)); // Divu56
        String ans = new Integer(56) + "" + new ArrayList<>(); // we can do it with any complex object but for that any of the object must be of type String
        System.out.println(ans); // 56[]


    }
}
