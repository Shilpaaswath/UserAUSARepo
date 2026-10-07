//Q29. WJP to perform Merge sort using recursion 

package Sep11programs;

public class Q29Mergerecursion {
	
	public static void merge(int a[],int b[],int i, int n)
	{
		
		if (i == b.length)
		{
			return;
		}
		
		int j=n-1;
		
		while(j>=0 && a[j]>b[i])
		{
			a[j+1]=a[j];
			
			j--;
		}
		
		a[j+1]= b[i];
		
		merge(a,b,i+1,n+1);
		
	}

	public static void main(String[] args) {
		
		
		int a[] = {2,4,6,0,0};
		int b[] = {1,3};
		
		int n = 3;
		
		merge(a,b,0,n);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		
		

	}

}
