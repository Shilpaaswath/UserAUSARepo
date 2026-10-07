//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string

package Sep11programs;

public class Q20RepeatedinteUCandLC {

	public static void main(String[] args) {
		
		String s1 = "1aA1aA2A2a";
		String checked = "";
		
		for (int i=0;i<s1.length();i++)
		{
			if (checked.indexOf(s1.charAt(i))==-1)
			{
			int intcount = 0;
			int UCcount =0;
			int LCcount =0;
			for (int j=0;j<s1.length();j++)
			{
				if (Character.isDigit(s1.charAt(i)))
				{
					if (s1.charAt(i)==s1.charAt(j))
					{
						intcount++;
					}
					
				}else if (Character.isUpperCase(s1.charAt(i)))
				{
					if (s1.charAt(i)==s1.charAt(j))
					{
						UCcount++;
					}
					
				}else if (Character.isLowerCase(s1.charAt(i)))
				{
					if (s1.charAt(i)==s1.charAt(j))
					{
						LCcount++;
					}
				}
				
			} 
			if (intcount>1)
			{
				System.out.println("The repeated interger " +s1.charAt(i)  +" is" +" " +intcount +" times");
			}
			if (UCcount>1)
			{
				System.out.println("The repeated uppercase letter " +s1.charAt(i)  +" is" +" " +UCcount +" times");
			}
			if (LCcount>1)
			{
				System.out.println("The repeated lowercase letter  " +s1.charAt(i)  +" is" +" " +LCcount +" times");
			}
		
			
			checked = checked +s1.charAt(i);
		}
		
		
		}

	}

}
