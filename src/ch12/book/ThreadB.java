package ch12.book;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() +"가 출력한 내용");	//ThreadB 실행내용
		}
	}
}
