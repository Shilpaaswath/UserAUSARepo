package Sep11programs;

public class practiceclass {

	public static void main(String[] args) {
		int a[][] = {{65, 100},{70, 150} ,{56, 90} ,{75, 190} ,{60, 95} ,{68, 110}};
				
		
		
		// I use selection sort and do the following, sort only through the height 
		//a[0,0 0,1] a[1,0 1,1] [2,0 2,1]
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i][0]>a[j][0])
				{
					int temp[] = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
						
					
						
			}
			
		
			
			
	}
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		//compare the weight
		
		for (int i =0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i][1]>a[j][1])
				{
					int temp = a[i][1];
					a[i][1] = a[j][1];
					a[j][1] = temp;
				}
			}
		}
		int count =0;
		
		for (int i=0;i<a.length-1;i++)	
		{
			if(a[i][0]<a[i+1][0] && a[i][1]<a[i+1][1])
			{
				count++;
			}
		}
		
		System.out.println(count);
		


	}
}
