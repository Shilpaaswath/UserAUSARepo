//Q23. WJP to differentiate input as string, int or bool

package Sep11programs;

import java.util.Scanner;

public class Q23Differentiateintstringorbool {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any input we will differentiate and tell whether inout is string,int or bool");
		String s1 = read.next();
		
		if(s1.equalsIgnoreCase("true")||s1.equalsIgnoreCase("false"))
		{
			boolean b= Boolean.parseBoolean(s1);
		    System.out.println("The input is boolean " +b);
		}
		 
		else try {
		int num = Integer.parseInt(s1);
		System.out.println("The input is integer " +num);
		}catch (Exception e)
		{
			System.out.println("The input is string " +s1);
		}

	
	}

}
