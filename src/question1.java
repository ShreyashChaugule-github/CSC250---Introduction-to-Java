package exam;

public class question1 {
	public static void main(String args[])
    {
        for(int a = 1; a <= 5; a++)
        {
            for(int b = 5; b > a; b--)
            {
                System.out.print(" ");
            }
            for(int c = 0; c < a; c++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
