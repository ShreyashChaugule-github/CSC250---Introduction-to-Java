package exercise;

import java.util.Scanner;

public class armstrong
{
    public static void main (String args[])
    {
        int s, c, n, temp;
        s = 0;
        Scanner Input = new Scanner (System.in);

        System.out.println("Enter the number you want to check -");
        n = Input.nextInt();

        temp = n;

        while(n > 0)
        {
            c = n % 10;
            n = n / 10;
            s += (c * c * c);
        }

        if(temp == s)
        {
            System.out.println("The given number is an Armstrong Number");
        }
        else
        {
            System.out.println("The given number is not an Armstrong Number");
        }
    }
}