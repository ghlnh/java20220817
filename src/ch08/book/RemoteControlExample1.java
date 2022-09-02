package ch08.book;

public class RemoteControlExample1 {
	public static void main(String[] args) {
		
		RemoteControl rc = null;	//인터페이스 변수 선언
		
		rc = new Television();	//Television 객체를 인터페이스 타입에 대입
		//인터페이스의 메소드 호출
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();	//Audio 객체를 인터페이스 타입에 대임
		rc.turnOn();
		rc.turnOff();
		
	}

}
