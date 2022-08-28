package ch07.book;

public class ComputerExmaple {
public static void main(String[] args) {
	int r =10;
	
	//부모클래스의 객체 생성
	Calculator calculator = new Calculator();
	System.out.println("원 면적 :"+calculator.areaCircle(r));
	System.out.println();
	
	//자식 클래스의 객체 생성
	Computer computer = new Computer();
	//재정의된(오버라이딩) 메소드 호출
	System.out.println("원 면적 :" + computer.areaCircle(r));
}
}
