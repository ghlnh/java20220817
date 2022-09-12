package ch12.book;
//메인 스레드만 이용
import java.awt.Toolkit;

public class BeepPrintExample1 {
public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit객체 얻기
	for (int i = 0; i < 5; i++) {
		toolkit.beep();	//비프음 발생
		try {
			Thread.sleep(500);	//0.5초간 일시 정시
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	for (int i = 0; i< 5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);	//0.5초간 일시 정시
		} catch (Exception e) {

		}
	}
	}
	//메인 스레드만 이용한 경우, 비프음 모두 발생 후에 프린팅 시작함
}

