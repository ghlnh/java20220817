package ch12.book;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {	//stop이 false 일때
			System.out.println("실행중");
		}
		//stop이 true일 때
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
