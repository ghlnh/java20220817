package ch18.book1;

import java.io.FileInputStream;

public class FileInputStreamExample1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream (
					"src/ch18/book1/FileInputStreamExample1.java");
			
			int data;
			while( (data = fis.read()) !=-1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}