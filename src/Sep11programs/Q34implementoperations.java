package Sep11programs;

public class Q34implementoperations {
	
	   static int subtract(int a, int b) {
	        return a + (-b);
	    }

	    static int multiply(int a, int b) {

	        int result = 0;

	        for (int i = 0; i < b; i++) {
	            result = result + a;
	        }

	        return result;
	    }

	    static int divide(int a, int b) {

	        int count = 0;

	        while (a >= b) {
	            a = a + (-b);
	            count++;
	        }

	        return count;
	    }

	public static void main(String[] args) {
		
	       System.out.println(subtract(10, 3));
	        System.out.println(multiply(5, 3));
	        System.out.println(divide(10, 2));

	}

}
