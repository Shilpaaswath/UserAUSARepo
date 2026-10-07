
//write a program to find factorial (Non Recursive)

package Sep11programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial");
		int number = num.nextInt();
		int factorial = 1;
		if (number < 0)
		{
			System.out.println("The factorial cannot be found for numbers less than zero");
		}else
		{
		for (int i = number;i>=1;i--)
		{
			factorial = factorial*i;
		}
		System.out.println("The factorial of number " +number +" is " +factorial);
		}
		

		
		num.close();

	}

}
