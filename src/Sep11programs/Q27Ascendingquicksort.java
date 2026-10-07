
//WJP to perform ascending order Quick sort


package Sep11programs;

public class Q27Ascendingquicksort {

	public static void main(String[] args) {
		
		         int a[] = {50,40,20,30,10};
		
		


		        quickSort(a, 0, a.length - 1);

		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		    }

		    public static void quickSort(int a[], int low, int high) {

		        if (low < high)
		        {

		            int pivot = a[high];

		            int i = low - 1;

		            for (int j = low; j < high; j++)
                  {

		                if (a[j] < pivot)
		                {

		                    i++;

		                    int temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }

		            int temp = a[i + 1];
		            a[i + 1] = a[high];
		            a[high] = temp;

		            int pi = i + 1;

		            quickSort(a, low, pi - 1);

		            quickSort(a, pi + 1, high);
		        }
		    }
		
		
	

	}


