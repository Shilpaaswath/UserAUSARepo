//Consider there is a 3 Boolean variable called a, b, c Check if at least two out of three Booleans are true 

package Sep11programs;

public class Booleanvariable {

	public static void main(String[] args) {
		
		
		boolean a= false;
		boolean b= true;
		boolean c= true;
				
		
		if ( (a && b)||(a && c)||(b && c))
				
		{
			System.out.println(" at least two out of three Booleans are true ");
		}else 
		{
			System.out.println(" at least two out of three Booleans are not true ");
		
     	}
	}
}


