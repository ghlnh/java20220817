package ch06.book;

public class returnCar {
	//필드
	int gas;
	
	//생성자
	
	//리턴값 없는 메소드1
	void setGas(int gas) {
		this.gas =gas;	//매개값을 받아서 gas 필드값을 변경
	}
	
	//리턴값이 boolean인 메소드
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	//리턴값 없는 메소드2
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량:" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. (gas잔량:" + gas + ")");
				return;		//메소드 종료
			}
		}
	}
	

}
