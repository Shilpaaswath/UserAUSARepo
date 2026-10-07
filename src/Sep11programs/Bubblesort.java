package Sep11programs;

public class Bubblesort {

	public static void main(String[] args) {
		
		
		int a[] = { 7,3,9,2,7,10,34,22,78};
		int temp;
		
		for(int i = 0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if (a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " , ");
		}

	}

}
