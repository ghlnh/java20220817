package ch12.book;

public class ThreadA1 extends Thread{
	public boolean stop = false;	//종료 플래그
	public boolean work = true;		//작업 진행 여부 플래그

	@Override
	public void run() {
		while(!stop) {
			if (work) {
			System.out.println("ThradA 작업 내용");
		}else {
			Thread.yield();	//work가 false가 되면 다른 스레드에게 실행양보
		}
	}
		System.out.println("ThreadA 종료");
	}
}
