package ch14.book;

public class MyFunctionalInterfaceExample {
public static void main(String[] args) {
	MyFunctionalInterface fi;
	//MyFunctionalInterface의 method()가 매개변수 갖지 않기때문에 람다식 매개변수 없음
	fi = () -> {
		String str = "method call1";
		System.out.println(str);
	};
	//람다식이 대입된 fi(인터페이스 변수)는 method 실행 시, 람다식의 중괄호{}실행
	fi.method();
	
	fi = () -> {System.out.println("method call2"); };
	fi.method();
	
	//실행문이 하나라 중괄호{}생략 가능
	fi = () -> System.out.println("method call3");
	fi.method();
	}
}
