package Sep11programs;

import java.util.Scanner;

public class Q28factorialRecurisemethod {
	
	public static int factorial(int num)
	{
		if (num ==1)
		{
			return 1;
		}
		
		return num * factorial(num-1);
			
	}

	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int num = read.nextInt();
		int fact = factorial(num);
		System.out.println("The factorial of entered number is " +fact);
		

	}

}
