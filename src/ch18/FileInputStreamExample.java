package ch18;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream (
					"C:\\Users\\user\\Desktop\\study\\server\\java\\workspace\\java20220817\\src\\ch18>");
			
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
