package ch09.book;

public class Anonymous1 {
	Vehicle field = new Vehicle() {
		//필드 초기값으로 대입
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				
			}
		};
		
		localVar.run();
	}
	
	public void method2(Vehicle v) {
		v.run();
	}
}
