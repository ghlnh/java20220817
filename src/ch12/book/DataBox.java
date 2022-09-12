package ch12.book;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();	//data필드가 null이면 소비자 스레드를 일시정지
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: "+ returnValue);
		// data 필드를 null로 만들고 생산자 스레드를 실행대기 상태로
		data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data !=null) {
			try {
				wait();	//data 필드가 null이 아니라면 생산자 스레드를 일시 정지
			} catch (InterruptedException e) {}
		}
		//data 필드에 값을 저장하고 소비자 스레드를 실행대기 상태로 만듦
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}

}
