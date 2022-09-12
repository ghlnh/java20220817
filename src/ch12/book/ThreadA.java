package ch12.book;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");	//스레드 이름 설정
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() +"가 출력한 내용");	//ThreadA 실행내용
		}
	}
}
