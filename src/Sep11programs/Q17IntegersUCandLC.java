//Q17.  WJP to find total number of integers, uppercase and lowercase character in the give string

package Sep11programs;

public class Q17IntegersUCandLC {

	public static void main(String[] args) {
		
		
		String s1 = "abc123ABC1456ThhY8";
		int intcount =0;
		int UCcount = 0;
		int LCcount = 0;
	    for (int i=0;i<s1.length();i++)
	    {
	    	if (Character.isDigit(s1.charAt(i)))
	    	{
	    		intcount++;
	    	}
	    	else if (Character.isUpperCase(s1.charAt(i)))
	    	{
	    		UCcount++;
	    	}else if (Character.isLowerCase(s1.charAt(i)))
	    	{
	    		LCcount++;
	    	}	
	    			
	    }
			
	    System.out.println("The total numbers of integers in the given string is "+intcount);
	    System.out.println("The total numbers of Uppercase letters in the given string is "+UCcount);
	    System.out.println("The total numbers of Lowercase letters in the given string is "+LCcount);

	}

}
