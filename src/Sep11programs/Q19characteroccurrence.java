//Q19. WJP to display number of occurrence of all character

package Sep11programs;

public class Q19characteroccurrence {

	public static void main(String[] args) {
		
		String s1 = "abcbcdabcretreskjiuirt";
		String checked = "";
		
		for (int i=0;i<s1.length();i++)
		{
			if (checked.indexOf(s1.charAt(i))==-1)
			{
			int count =0;
			for (int j=0;j<s1.length();j++)
			{
				if (s1.charAt(i) == s1.charAt(j))
				{
					count++;
				}
			}
			System.out.println("The number of occurrences of character " +s1.charAt(i) +" is " +count +" times.");
			checked = checked +s1.charAt(i);
		}
		
		}

	}

}
