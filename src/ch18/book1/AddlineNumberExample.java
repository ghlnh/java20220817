package ch18.book1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddlineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/lecture/p6filter/C04BufferedReader.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		int num =1;
		while((line = br.readLine()) != null) {
			System.out.println(num + ":" + line);
			num++;
		}
		
		br.close();
		fr.close();
	}
}
