package com.L03_switch_case;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Divyanka Pagare");
                break;
            case 2:
                System.out.println("Ritesh Girase");
                break;
            case 3:
                System.out.println("Rinku Pagare");
                switch (department){
                    case "Computer", "computer", "comp":
                        System.out.println("Computer Engineering Department");
                        break;
                    case "AIDS", "aids":
                        System.out.println("Artificial Intelligence and Data Science Department");
                        break;
                    case "CS", "cs":
                        System.out.println("Computer Science Department");
                        break;
                    default:
                        System.out.println("This department is not entered");
                }
                break;
            default:
                System.out.println("Enter valid employee ID!");
        }

//        enhanced nested switch case
        switch (empID) {
            case 1 -> System.out.println("Divyanka Pagare");
            case 2 -> System.out.println("Ritesh Girase");
            case 3 -> {
                System.out.println("Rinku Pagare");
                switch (department) {
                    case "Computer", "computer", "comp" -> System.out.println("Computer Engineering Department");
                    case "AIDS", "aids" -> System.out.println("Artificial Intelligence and Data Science Department");
                    case "CS", "cs" -> System.out.println("Computer Science Department");
                    default -> System.out.println("This department is not entered");
                }
            }
            default -> System.out.println("Enter valid employee ID!");
        }
    }
}
