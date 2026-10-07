package Sep11programs;

import java.util.Scanner;

public class Q25Binarysearchinarray {

	public static void main(String[] args) {
		int temp;
		Scanner read = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter the 5 elements for binary search");
		
		for (int i =0;i<a.length;i++)
		{
			a[i] = read.nextInt();
		}
		
		//sort the entered array 
		for (int i =0;i<a.length;i++)
		{
			for (int j =i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//The sorted array is
		
		for (int i =0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		//binary search section
		
		System.out.println("Enter the number to be searched ");	
		int num = read.nextInt();
		
		int low =0;
		int high = a.length-1;
		boolean found = false;
		
		
		while (low <= high)
		{
			int mid = (low+high)/2;
			if (a[mid]==num)
			{
				System.out.println("The entered number is found at index " +mid);
				found=true;
				break;
			}
			
			else if (num >a[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		
		if (found == false)
		{
			System.out.println("The entered number is not found ");
		}
		
		

	}

}
