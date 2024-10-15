package com.L09_Strings_and_StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";  // sample i/p -> ababab , "", aabbccbbaa
//        String str = null; // true
//        String str = "";  // true
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
