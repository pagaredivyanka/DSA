package com.L03_switch_case;

import java.util.Scanner;

public class Fruit
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){

//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruits");
//                break;
//            case "Orange":
//                System.out.println("Round fruits, rich in vitamin C");
//                break;
//            case "Grapes":
//                System.out.println("Small fruits");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");

            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruits");
            case "Orange" -> System.out.println("Round fruits, rich in vitamin C");
            case "Grapes" -> System.out.println("Small fruits");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
