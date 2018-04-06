import java.util.Scanner;

/**
 * Erick Williams
 * Fibonacci
 * 2/29/16
 * This program recursively finds the desired number in the fibonacci sequence.
 */

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How far along the fibonacci sequence would you like to go?");
		int n= input.nextInt();
		
		System.out.println(fibonacci(n));
	}
	
	/**
	 * This method recursively finds the number at a given index of the fibonacci sequence.
	 * @param n = the desired index to be found in the fibonacci sequence
	 * @return n if n <=1
	 */
	public static int fibonacci(int n)
	{
			
			if (n <= 1) 
			{
				return n;
			}
	        else 
	        {
	        	return fibonacci(n-1) + fibonacci(n-2);
	       	}
	}

}
