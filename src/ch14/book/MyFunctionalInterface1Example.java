package ch14.book;

public class MyFunctionalInterface1Example {
public static void main(String[] args) {
	MyFunctionalInterface1 fi;
	
	//MyFunctionalInterface1의 method() 매개변수가 1개라 람다식에서도 매개변수 1개
	fi = (x) -> {
		int result = x*5;
		System.out.println(result);
		};
	fi.method(2);
	
	fi = (x) -> {System.out.println(x*5); };
	fi.method(3);
	
	//매개 변수가 하나일 경우에는 괄호()를 생략 할 수 있다.
	fi = (x) -> System.out.println(x*5);
	fi.method(4);
}
}
