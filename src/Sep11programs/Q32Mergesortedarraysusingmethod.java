
//Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order. 
package Sep11programs;

public class Q32Mergesortedarraysusingmethod {
	
	public static void merge (int a[], int b[], int n)
	{
		   for (int i = 0 ;i<b.length;i++)
		     {
		    	 a[n] = b[i];
		    	 n++;
		     }
		     
		     for (int i=0;i<a.length;i++)
		     {
		    	 System.out.print(a[i] + " ");
		     }
	}

	public static void main(String[] args) {
	     int a[] = {1,2,3,4,0,0};
	     int b[] = {5,6};
	     
	     
	     int j = 4;
	     
	     merge (a,b,j);
	  

	}

}
