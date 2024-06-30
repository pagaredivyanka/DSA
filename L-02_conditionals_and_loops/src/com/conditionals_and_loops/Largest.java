package com.conditionals_and_loops;

import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q:
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
}
