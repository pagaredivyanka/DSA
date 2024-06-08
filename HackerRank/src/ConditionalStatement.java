import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(N % 2 == 0 && (N > 1 && N < 6 || N > 20)){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

    }
}



