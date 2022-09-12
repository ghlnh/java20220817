package ch12.book;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject shareObject = new WorkObject();	//공유 객체 생성
		
		//Thread A,B 생성
		ThreadA2 threadA = new ThreadA2(shareObject);
		ThreadB2 threadB = new ThreadB2(shareObject);
		
		//ThreadA,B 실행
		threadA.start();
		threadB.start();
		
	}

}
