package ch06.book;

public class returnCarExample {
	public static void main(String[] args) {
		returnCar myCar  = new returnCar();
		
		myCar.setGas(5);	//returnCar의 setGas()메소드 호출
		
		boolean gasState = myCar.isLeftGas();	//returnCar의 isLeftGas()메소드 호출
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run();	//returnCar의 run()메소드 호출
		}
		
		//위의 if문이 myCar.run()메소드 실행하면서 리턴문으로 인해 종료 된 이후 
		//아래의 if문이 실행 됨
		
		if(myCar.isLeftGas()) {		//returnCar의 isLeftGas()메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다."); 
		}else {
			System.out.println("gas를 주입하세요.");
		}
			
	}
}
