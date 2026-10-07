//Q4.	Given an array of integers check the Palindrome of the series.


package Sep11programs;

public class Q4Palindrome {

	public static void main(String[] args) {
		
		
		//to find string palindrome using class Stringbuilder
		//String s = "madam";
		
		//StringBuilder reverse = new StringBuilder(s).reverse();
		//System.out.println(reverse);
		
		//to find integer palindrome using arthemetic operations
		
		/*int number = 122;
		int original = number;
		int reverse=0;
		
		while(number>0)
		{
			int digit = number%10;
			reverse = reverse * 10 + digit;
			number = number/10;
		}
		
       if (original == reverse)
       {
    	 System.out.println("Palindrome");
       }else
       {
    	   System.out.println(" not Palindrome");
       }*/
       
       int a[] = {121,323,564,789,989};
       int b[] = new int[a.length];
       int j=0;
       
       for (int i= 0; i<a.length;i++)
       {
    	   int number = a[i];
    	   int original = number;
    	   int reverse = 0;
    	  
    	 
    	   
    	   while (number >0)
    	   {
    		   int digit = number%10;
    		   reverse = reverse *10+digit;
    		   number = number/10;
    	   }
    	   if (reverse == original)
    	   {
    		   System.out.println(a[i] + " This is palindrome number");
    		   b[j] = a[i];
    		   j++;
    	   }
    	   		
    			   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       }
       
 
       for (int k=0;k<j;k++)
		 {
			System.out.print(b[k] + " ");
		 }
       
       
	}

}
