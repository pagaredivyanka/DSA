// Recursion --> 1. This is function calling another function
// 2. function body and definition of all functions is same

public class NumbersExample {
    public static void main (String[] args) {
        // write a function that takes in a number and print as
        //print first 5 numbers : 1 2 3 4 5

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

// function body is changes (only printing not calling another function)
    static void print5(int n) {
        System.out.println(n);
    }
}
