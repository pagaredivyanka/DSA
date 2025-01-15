package com.L08_strings.lecture;

//import java.net.StandardSocketOptions;
//import java.sql.SQLOutput;

public class Main {
    public static int main(String[] args) {
//        //Strings are immutable in java  --> ex same name in db
//        //can't change after creation
//        int[] arr = {2,3,5,6,7};
//        int num = 10;
//
//
//        //if 2 reference variables pointing to same value(object) in the heap
//        // the value is stored in the pool
//        // and if we try to change the value by any of the reference variable then it creates different object
//
//
//        String a = "Divyanka";
//        System.out.println(a);
//        a = "Pagare";  //here we are not changing the object we are creating new object
//        System.out.println(a);

        int[] arr = {1, 200, 302, 303, 1010, 1111, 1112, 1113, 1114, 1110};
        int target = 1010;
        int ind = -1;
        //if present give index and if not present then -1 without using function

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                ind = i;
                System.out.println(ind);
            }
        }
        return ind;
    }
}






