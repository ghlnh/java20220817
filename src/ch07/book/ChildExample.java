package ch07.book;

public class ChildExample {
	public static void main(String[] args) {
		//자식 클래스 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		parent.method1();
		parent.method2();	//오버라이딩된 메소드 호출됨
//		parent.method3();	//자식클래스의 method3()호출 불가
		
	}

}
