package lol;
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {

        int n , t1 = 0, t2 = 1;
        Scanner fb=new Scanner(System.in);
        System.out.println("Enter number:");
        n=fb.nextInt();
        System.out.print("First " + n + " terms: \n");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}