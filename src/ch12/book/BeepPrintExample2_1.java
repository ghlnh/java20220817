package ch12.book;

import java.awt.Toolkit;

public class BeepPrintExample2_1 {
public static void main(String[] args) {
	Runnable beepTask = new BeepTask();
	Thread thread = new Thread(() -> {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for (int i = 0; i < 5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
	}
	});
	
	for (int i = 0; i < 5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);	//0.5초간 일시 정시
		} catch (Exception e) {

		}
	}
}
}
