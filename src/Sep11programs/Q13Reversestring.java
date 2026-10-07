//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

package Sep11programs;

public class Q13Reversestring {

	public static void main(String[] args) {
		
		
		String s1 = "Java Code";
		String s2 = "";
		
		StringBuilder reverse = new StringBuilder(s1).reverse();
		System.out.println(reverse);
		
		StringBuffer rev = new StringBuffer(s1).reverse();
		System.out.println(rev);
		for (int i = s1.length()-1;i>=0;i--)
		{
			s2 = s2+s1.charAt(i);
		}
				
        System.out.println(s2);
	}

}
