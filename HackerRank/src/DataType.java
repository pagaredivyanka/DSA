import java.util.*;
import java.io.*;
public class DataType{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if(-9223372036854775808l <= x && x <= 9223372036854775807l) {

                    if(-2147483648 <= x && x <= 2147483647) {


                        if(-32768 <=x && x <= 32767) {
                            if(-128 <= x && x <= 127){
                                System.out.println("* byte");
                            }
                            System.out.println("* short");

                        }
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



