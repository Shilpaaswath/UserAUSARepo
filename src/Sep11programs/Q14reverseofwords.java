//Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)

package Sep11programs;

public class Q14reverseofwords {

	public static void main(String[] args) {
		
		String s1 = "Java Code";
		String s2[] = s1.split(" ");
		String s3 = s2[1] + " " + s2[0];
		System.out.println(s3);
				

	}

}
