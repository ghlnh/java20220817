package ch07.book;

public class Computer extends Calculator{
	//@Override 어노테이션 생략해도 되지만
	//붙이면 아래 메소드가 정확히 오버라이딩 된 것인지 컴파일러가 체크해줌
	@Override
	//오버라이딩
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		//부모클래스보다 정밀한 파이 계산을 위해 메소드 Math.PI상수 이용
		return Math.PI * r * r;
	}

}
