package ch08.book;

public interface MyInterface {
	public void method1(); 
	
	default public void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
