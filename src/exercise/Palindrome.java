package exercise;

import java.util.Scanner;

public class Palindrome
{
    public static void main (String args[])
    {
        int r, s, temp, n;
        s = 0;

        Scanner Input = new Scanner (System.in);

        System.out.print("Enter the number you want to check for - ");
        n = Input.nextInt();

        temp = n;

        while(n > 0)
        {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }

        if(temp == s)
        {
            System.out.println("The given number is a Palindrome Number");
        }
        else
        {
            System.out.println("The given number is not a Palindrome Numebr");
        }
    }
}