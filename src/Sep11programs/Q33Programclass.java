
/*Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. 
Given the heights and weights of each person in the circus, You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold 
B. Write a method to merge B into A in sorted orderwrite a method to compute the largest possible number of people in such a tower. 
EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and includes from top to bottom: 
	
(56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)*/

package Sep11programs;

public class Q33Programclass {
	
	   int height;
	   int weight;

	    Q33Programclass(int height, int weight) 
	    
	    {
	        this.height = height;
	        this.weight = weight;
	    }

		
		    static int longestTower(Q33Programclass[] people) 
		    {

		        for (int i = 0; i < people.length - 1; i++) {

		            int minIndex = i;

		            for (int j = i + 1; j < people.length; j++) {

		                if (people[j].height < people[minIndex].height) {
		                    minIndex = j;
		                }
		            }

		            // Swap people
		            Q33Programclass temp = people[i];
		            people[i] = people[minIndex];
		            people[minIndex] = temp;
		        }


		  

		        int[] dp = new int[people.length];
		    
		        for (int i = 0; i < dp.length; i++) 
		        {
		            dp[i] = 1;
		        }

		        int max = 1;

		        for (int i = 1; i < people.length; i++) {

		            for (int j = 0; j < i; j++) {

		                if (people[j].height < people[i].height &&
		                    people[j].weight < people[i].weight) {

		                    if (dp[j] + 1 > dp[i]) {
		                        dp[i] = dp[j] + 1;
		                    }
		                }
		            }

		            if (dp[i] > max) {
		                max = dp[i];
		            }
		        }

		        return max;
		    }


 public static void main(String[] args) {

		    	 Q33Programclass[] people = {
		            new Q33Programclass(65, 100),
		            new Q33Programclass(70, 150),
		            new Q33Programclass(56, 90),
		            new Q33Programclass(75, 190),
		            new Q33Programclass(60, 95),
		            new Q33Programclass(68, 110)
		        };

		        int result = longestTower(people);

		        System.out.println("Longest tower = " + result);
		    }
		

	}
	


