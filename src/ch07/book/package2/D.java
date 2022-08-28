package ch07.book.package2;

import ch07.book.package1.A;

public class D extends A{
	//생성자
	public D() {
		super();		//A생성자 호출 (new 연산자 사용해서 직접 호출 불가)
		this.field = "value";	//A 필드 초기화
		this.method();			//A 메소드 호출
	}

}
