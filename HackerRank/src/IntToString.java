import java.io.*;
import java.util.*;

public class IntToString {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (-100 <= n && n <= 100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
