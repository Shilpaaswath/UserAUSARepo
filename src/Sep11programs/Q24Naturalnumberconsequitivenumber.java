//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number combinations,
//which when added give N.    	INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4

package Sep11programs;

import java.util.Scanner;

public class Q24Naturalnumberconsequitivenumber {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any positive natural number N and fot that i will print possible consecutive number combinations");
		int num = read.nextInt();
		boolean consecutive = false;
		
		for (int i=1;i<num;i++)
		{
			if (i+(i+1) ==num)
			{
				int index =i;
				int index1 = i+1;
				consecutive = true;
				System.out.println("The two consequetive numbers are "+index +"+" +index1 +" = " +num );
			}if (i+(i+1)+(i+2)==num)
			{
				int index =i;
				int index1 = i+1;
				int index2 = i+2;
				consecutive = true;
				
				System.out.println("The three consequetive numbers are "+index +"+" +index1 +"+" +index2 +" = " +num );		
							
		}

	}
		if (consecutive == false)
		{
			System.out.println("The entered number do not have consequitive number combinations" );
		}
	}
}


