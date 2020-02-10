package exercise;

import java.util.Scanner;

public class factorial
{
    public static void main (String args[])
    {
        int n;
        long f = 1;

        Scanner Input = new Scanner (System.in);
        
        System.out.print("Enter the number you want to find factoiral of -");
        n = Input.nextInt();

        for(int Count = 1; Count <= n; ++Count)
        {
            f *= Count;
        }

        System.out.printf("The Factorial of the number %d is %d", n, f);
    }
}