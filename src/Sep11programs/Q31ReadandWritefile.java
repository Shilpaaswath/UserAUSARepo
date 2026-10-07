//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

package Sep11programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Q31ReadandWritefile {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\TECKARCH\\JavaHackathon\\src\\Q31readandwrite.txt";
		String reversefilepath = "C:\\TECKARCH\\JavaHackathon\\src\\reversefilepath.txt";
		FileReader filereader = new FileReader(filepath);
		
		BufferedReader bufferreader = new BufferedReader(filereader);
		
		String line;
		
		ArrayList<String> lines = new ArrayList<>();
		
		while((line = bufferreader.readLine())!= null)
		{
			lines.add(line);
		}
		
		for (int i = lines.size()-1;i>=0;i--)
		{
			System.out.println(lines.get(i));
		}
		
		FileWriter filewriter = new FileWriter(reversefilepath);
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		
		for (int i = lines.size()-1;i>=0;i--)
		{
			bufferwriter.write(lines.get(i));
			bufferwriter.newLine();
		}
				
		bufferwriter.close();
	}

}
