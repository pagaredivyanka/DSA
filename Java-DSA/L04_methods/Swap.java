package com.L04_methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        swap(a, b);
        System.out.println(a + " " + b);
        String name = "Divyanka Pagare";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Ritesh Girase";  // scope -> can't access of the method
        
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}




/*
* in java there is no pass by reference
* only pass by value
*/