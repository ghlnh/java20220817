package ch08.book;

public class MyClassB implements MyInterface{
@Override
public void method1() {
	System.out.println("MyClassB-method1()실행");
	
}
//디폴트메소드 재정의
@Override
	public void method2() {
	System.out.println("MyClassB-method2()실행");
	}
}
