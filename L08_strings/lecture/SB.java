package com.L08_strings.lecture;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);

        }
        System.out.println(builder.toString()); // print a to z
        System.out.println(builder.deleteCharAt(0)); // it removes -> a
        System.out.println(builder.reverse());
    }
}
