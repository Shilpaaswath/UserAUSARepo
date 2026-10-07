
//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

package Sep11programs;

public class Q5uniqueduplicate {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,2};
		
		
		for (int i=0;i<a.length;i++)
		{
			int count =0;
			boolean visited = false;
			
			for (int k=0;k<i;k++)
			{
				if(a[i]==a[k])
				{
					 visited = true;
					 break;
				}
			
			}
			
			if (visited)
			{
				continue;
			}
			
			for (int j=0;j<a.length;j++)
				
			{
				if (a[i]==a[j])
				{
					count++;
					//System.out.println(count);
				}
			
				
			}
			if (count>1)
			{
				System.out.println(a[i] + " occured " +count +" times ");
			}
			if (count==1)
			{
				System.out.println(a[i] + " occured " +count +" times and it is unique");
			}
			
		}
		
			
				
				
			
		

	}

}
