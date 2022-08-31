package ch07.book;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();	//추상클래스라 객체 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();	//Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();	//Phone의 메소드
	}

}
