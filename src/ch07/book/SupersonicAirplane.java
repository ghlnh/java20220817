package ch07.book;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	//Airplane(부모클래스)의 fly()메소드를 오버라이딩
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
		//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}

}
