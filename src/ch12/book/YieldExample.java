package ch12.book;

public class YieldExample {
public static void main(String[] args) {
	ThreadA1 threadA = new ThreadA1();
	ThreadB1 threadB = new ThreadB1();
	
	threadA.start();
	threadB.start();
	
	try {
		Thread.sleep(3000);;
	} catch (InterruptedException e) {}
	
	//thradB만 실행
	threadA.work = false;
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
	//threadA, threadB 모두 실행
	threadA.work = true;
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
	//threadA, threadB 모두 종료
	threadA.stop = true;
	threadB.stop = true;
}
}
