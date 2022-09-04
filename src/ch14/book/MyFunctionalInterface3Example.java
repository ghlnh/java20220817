package ch14.book;

public class MyFunctionalInterface3Example {
public static void main(String[] args) {
	MyFunctionalInterface3 fi;
	//MyFunctionalInterface3의 method()의 매개변수가 2개라 람다식 매개변수도 2개
	fi = (x,y) -> {
		int result = x+y;
		return result;
	};
	System.out.println(fi.method(2, 5));
	
	fi = (x,y) -> {return x+y;};
	System.out.println(fi.method(3, 5));
	
	//return문만 있는 경우, 중괄호{}와 return생략 가능
	fi = (x,y) -> x+y;
	System.out.println(fi.method(4, 5));
	
	fi = (x,y) -> sum(x,y);
	System.out.println(fi.method(5, 5));
	
	}
	
	public static int sum(int x, int y) {
		return (x+y);
	
	
	}
}
