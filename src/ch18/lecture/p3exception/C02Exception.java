package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		//try문 안에서 선언하면 finally에서 사용할 수 없어 밖에서 선언
		OutputStream os = null;
		InputStream is = null;
		try {
			String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
			os = new FileOutputStream(name);
			is = new FileInputStream("");
			
			os.write(99); 
			os.write(88);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭 실행해야 하는 코드는 finally 블럭에 작성
			try {
				//nullPointerException 발생 할 수 있으므로
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			//nullPointerException 발생 할 수 있으므로
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}





