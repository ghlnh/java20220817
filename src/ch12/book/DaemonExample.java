package ch12.book;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {}
	System.out.println("메인 스레드 종료");
	}
}
