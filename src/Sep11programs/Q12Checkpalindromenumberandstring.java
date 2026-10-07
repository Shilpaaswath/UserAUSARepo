package Sep11programs;

import java.util.Scanner;

public class Q12Checkpalindromenumberandstring {
	
	public static void stringpalindrome(String s1)
	{
		String s2 = "";
		for (int i=s1.length()-1;i>=0;i--)
		{
			
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		if (s1.equals(s2))
		{
			System.out.println("The Entered string is palindrome");
		
		}else
		{
			System.out.println("The Entered string is not palindrome");
		}
	}

	
	public static void digitpalindrome(int num1)
	{
		int original = num1;
		
		int reverse = 0;
		
		while (num1>0)
		{
			int digit = num1%10;
			reverse = (reverse *10)+digit;
			num1 = num1/10;
		}
		
		if (original == reverse)
		{
			System.out.println("The Entered number is palindrome");
		}else
		{
			System.out.println("The Entered number is not palindrome");
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome e.g. MalayalaM");
		String s1 = read.next();
		
		System.out.println("Enter the digit to check palindrome e.g. 121");
		int num1 = read.nextInt();
		stringpalindrome(s1);
		digitpalindrome(num1);
		
		
		
		

	}

}
