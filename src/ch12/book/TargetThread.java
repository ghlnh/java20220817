package ch12.book;

public class TargetThread extends Thread{
	@Override
	public void run() {
		//21억번 루핑돌게 해 RUNNABLE 상태 유지
		for (long i = 0; i < 2100000000; i++) {}
		
		try {
			//1.5초간 일시정지(TIME_WAITING상태)
			Thread.sleep(1500);
		} catch (Exception e) {}
		
		//다시 21억번 루핑돌게 해 RUNNABLE 상태 유지
		for (long i = 0; i < 2100000000; i++) {}
	}
}
