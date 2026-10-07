
//Q26. WJP to merge two sorted array.(Do not use third array)		array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10

package Sep11programs;

public class Q26Mergetwosortedarray {

	public static void main(String[] args) {
		
		int array1[] = {1, 2, 4, 6, 9, 10, 0, 0, 0, 0};
        int array2[] = {3, 5, 7, 8};

        int n = 6;

        for (int i = 0; i < array2.length; i++) 
        {

            int j = n - 1;

        
            while (j >= 0 && array1[j] > array2[i])
            {
                array1[j + 1] = array1[j];  
                j--;
            }

      
            array1[j + 1] = array2[i];

            n++;
        }

    
        for (int i = 0; i < array1.length; i++) 
        
        {
            System.out.print(array1[i] + " ");

	}
	}

}
