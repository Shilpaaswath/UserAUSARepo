//Q16. Write a method that will remove given character from the String?

package Sep11programs;

import java.util.Scanner;

public class Q16Removecharacterfromstring {
	
	
	public static void Removecharacter(String s1 , char ch)
	{
		String s2 = s1.replace(String.valueOf(ch), "");
		//String s2 = s1.replace(ch, '');
		System.out.println(s2);
				
	}
	

	public static void main(String[] args) {
		 Scanner read = new Scanner(System.in);
		 System.out.println("Enter the string");
		 String s1 = read.next();
		 System.out.println("Enter the character to be removed from the string");
		 char ch = read.next().charAt(0);
		 Removecharacter(s1,ch);
		 
		 
		 
		 

	}

}
