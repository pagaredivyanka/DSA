package com.L09_Strings_and_StringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Divu";
        String b = "Divu";

        // ==  ---> Comparison operator

        System.out.println(a == b); //true


        // Q. How to create diff objects of same values ?
        // ans --> we can explicitly create two diff obj same name using [new keyword]

        String name1 = new String("Divu");
        String name2 = new String("Divu");

        System.out.println(name1 == name2); // false , bcs new keyword creates two diff obj and if 2 reff var are pointing to same obj then only value of == gives true
        System.out.println(name1.equals(name2)); // true , bcs it does not care about the obj at which reff var pointing is same or not, it only checks the value
        // when you only need to check value, use .equals method
    }
}

