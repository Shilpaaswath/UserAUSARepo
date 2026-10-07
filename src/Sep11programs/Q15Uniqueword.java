//Q15. Given a string print the unique words of the string.

package Sep11programs;

public class Q15Uniqueword {

	public static void main(String[] args) {
     
		String s1 = "she is she is java programming";
		
		String s2[] = s1.split(" ");
		
		String s3[] = new String[s2.length];
		int k =0;
		
		
		for (int i=0 ; i<s2.length; i++)
		{
			int count =0;
			for (int j=0;j<s2.length;j++)
			{
				if (s2[i].equals(s2[j]))
				{
				   count++;
				   
				}
			}
			
			if (count == 1)
			{
				System.out.println("The unique word of string is " +s2[i]);
				s3[k] = s2[i];
				k++;
				
			}
		}
		
		for (int m=0 ; m<k; m++)
		{
			System.out.print(s3[m] + " ");
		}
		
	
		
		

	}

}
