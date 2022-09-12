package ch12.book;

public class BeepPrintExample2 {
public static void main(String[] args) {	//메인 스레드
	Runnable beepTask = new BeepTask();
	Thread thread = new Thread(beepTask);
	thread.start();	//BeepRunnable (작업스레드)
	
	for (int i = 0; i < 5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);	//0.5초간 일시 정시
		} catch (Exception e) {

		}
	}
	
}
}
