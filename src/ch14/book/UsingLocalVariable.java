package ch14.book;

public class UsingLocalVariable {
	void method(int arg) { //arg는 final특성 가짐
		int localVar =40; //localVar는 final특성 가짐
		
		//arg =31;	//final특성 때문에 수정 불가
		//localVar =41;	//final특성 때문에 수정 불가
		
		//람다식
		MyFunctionalInterface fi = () -> {
			//로컬변수 읽기
			System.out.println("arg: "+ arg);
			System.out.println("localVar: " + localVar +"\n");
		};
		
		fi.method();
	}
}
