package ch12.book;
//1초후 출력스레드 중지
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2 ();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		//스레드를 종료시키기 위해 InterruptedException 발생시킴
		thread.interrupt();
	}
}
