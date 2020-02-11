package exam;

public class question2 {
	 public static void main(String args[])
	    {
	        int[] GivenArray = {1, 6, 8, 4};
	        int S = 0;

	        for (int Count = 0; Count < GivenArray.length; Count ++)
	        {
	            S += GivenArray[Count];
	        }

	        System.out.println("Sum = " + S);
	    }

}
