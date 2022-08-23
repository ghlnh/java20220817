package ch06.book;

public class Person {
	// final 필드 선언시 초기화
	final String nation = "Korea";
	final String ssn;	//외부 데이터로 초기화 필요
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn =ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {
		//객체 생성
		Person p1 = new Person("123456-1234567", "계백");	//외부데이터로부터 값을 받아 ssn초기화 함
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		System.out.println("필드값 수정");
//		p1.nation = "usa";			//final 필드라 수정 불가
//		p1.ssn = "654321-7654321"	//final 필드라 수정 불가
		p1.name = "을지문덕";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}
