package ch12.book;
//submit()메소드 사용
import java.util.concurrent.*;

public class Execute {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);	//최대 스레드 개수가 2인 스레드풀 생성
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
				//스레드 총 개수 및 작업 스레드 이름 출력
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
				int poolSize = threadPoolExecutor.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.println("[총 스레드 개수: "+poolSize + "]작업 스레드 이름: " + threadName);
				
				//예외 발생시킴
				int value = Integer.parseInt("삼");
			}
		};
		//작업 처리 요청
//		executorService.execute(runnable);
		executorService.submit(runnable);
		
		Thread.sleep(10); 	//콘솔에 출력 시간을 주기 위해 0.001초 동안 일시정지
		}
	executorService.shutdown(); 	//스레드 풀 종료
	}
}