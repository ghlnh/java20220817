package ch05.lecture.p03string;

public class C02New {
	public static void main(String[] args) {
		// new 연산자 : 새 인스턴스(객체)의 참조값을 연산결과로 낸다
		String str1 = new String("java");
		String str2 = new String("java");
		
		String str3 = "java"; // new 연산자 생략하고 string literal 작성 가능
		
		// new 연산자 생략하고 string literal을 작성하면 이미 있는
		// 참조값 활용
		String str4 = "java"; 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));		
		System.out.println(System.identityHashCode(str4));
	}
}
