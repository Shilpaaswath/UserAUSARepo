
//Q18. WJP to display duplicate character in string
package Sep11programs;

public class Q18Duplicatecharacter {

	public static void main(String[] args) {
		
		String s1 = "bcdaba";
		String checked = "";
		
		for (int i=0;i<s1.length();i++)
		{
			int count =0;
			if (checked.indexOf(s1.charAt(i))==-1)
			{
				
			
			for (int j=0;j<s1.length();j++)
			{
				if (s1.charAt(i) == s1.charAt(j))
				{
					count++;
				}
			}
			if (count>1)
			{
				System.out.println("The duplicate character in the string is " +s1.charAt(i));
			}
			
			checked = checked +s1.charAt(i);
		}
				

	}
 }
}