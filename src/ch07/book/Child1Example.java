package ch07.book;

public class Child1Example {
	public static void main(String[] args) {
		Parent1 parent = new Child1();		//자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";	//사용불가
//		parent.method3();		//사용불가
		
		Child1 child = (Child1)parent;	//자식->부모 자동타입변환한걸 다시 자식으로 강제 타입변환
		child.field2 = "yyy";	//가능
		child.method3();		//가능
	}

}
