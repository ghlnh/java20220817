package ch09.book;

public class Outter1 {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-field");
	}
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-field");
		}
	
	void print() {
		//중첩 클래스 객체 참조
		System.out.println(this.field);
		this.method();
		//바깥 클래스 객체 참조
		System.out.println(Outter1.this.field);
		Outter1.this.method();
		}
	}
}
