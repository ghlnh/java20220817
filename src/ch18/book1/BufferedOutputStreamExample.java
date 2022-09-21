package ch18.book1;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("원본파일 경로");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("저장 될 파일 경로");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용하지 않았을 때: "+(end-start) + "ms");
		
		fis = new FileInputStream("원본파일 경로");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("저장 될 파일 경로");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read())!=-1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("사용 했을 때: "+ (end-start) + "ms");
		
		
	}
}
