package com.L09_Strings_and_StringBuilder;

public class Performance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i < 26; i ++) {
            char ch = (char)('a' + i);
            series = series + ch;  // sereis += ch
        }
        System.out.println(series); // abcdefghijklmnopqrstuvwxyz
        /*
         this is not good solution it consumes large amount of space in m/m
         space complexity = O(N^2)
         this problem is overcome by using String Builder(which create only one object and does changes in it)
        */

    }
}
