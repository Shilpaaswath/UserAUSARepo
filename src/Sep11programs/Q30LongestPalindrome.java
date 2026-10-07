//Q30. Write a function to find out longest palindrome in a given string?

package Sep11programs;

public class Q30LongestPalindrome {

	public static void main(String[] args) {
		
		
		String a1[] = {"madam", "Malayalam", "121"};
		
		int maximumlength = 0;
		String longestpalindrome = "";
		
		for (int i=0;i<a1.length;i++)
		{
			StringBuffer reverse = new StringBuffer(a1[i]).reverse();
			System.out.println(reverse);
			
			if (a1[i].equalsIgnoreCase(reverse.toString()))
			{
				if (a1[i].length() > maximumlength )
				{
					maximumlength = a1[i].length();
					longestpalindrome = a1[i];
					
				}
			}
		
			
		}
		
		System.out.println("The longest palindrome is " +longestpalindrome);

	}

}
