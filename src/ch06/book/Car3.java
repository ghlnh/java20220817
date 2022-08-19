package ch06.book;

public class Car3 {
	//인스턴스 필드
	int speed;
	//인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	//정적멤버 내에서 인스턴스 멤버 접근
	public static void main(String[] args) {
		Car3 myCar = new Car3();	//객체 생성
		myCar.speed = 60;
		myCar.run();
	}

}
