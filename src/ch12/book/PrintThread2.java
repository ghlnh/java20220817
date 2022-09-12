package ch12.book;
//무한반복해서 출력하는 스레드
public class PrintThread2 extends Thread {
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("실행중");
			//스레드를 잠시나마 일시정지 시킴 (일시정지가 되야 interrupt 호출 적용)
			Thread.sleep(1);	
			}
		}catch (InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
