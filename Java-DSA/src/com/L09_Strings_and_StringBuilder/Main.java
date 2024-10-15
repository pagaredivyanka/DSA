package com.L09_Strings_and_StringBuilder;

public class Main {
    public static void main(String[] args) {
        //Strings are immutable in java  --> ex same name in db
        //can't change after creation
        int[] arr = {2,3,5,6,7};
        int num = 10;


        //if 2 reference variables pointing to same value(object) in the heap
        // the value is stored in the pool
        // and if we try to change the value by any of the reference variable then it creates different object


        String a = "Divyanka";
        System.out.println(a);
        a = "Pagare";  //here we are not changing the object we are creating new object
        System.out.println(a);


    }
}
