package ch12.book;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();	//일시정지 상태에 있는 ThreadB를 실행대기 상태로
		try {
			wait();	//ThreadA를 일시정지 상태로
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();	//일시정지 상태에 있는 ThreadA를 실행대기 상태로
		try {
			wait();	//ThreadB를 일시정지 상태로
		} catch (InterruptedException e) {}
	}
}
