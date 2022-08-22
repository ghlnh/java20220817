package ch06.book;

public class Singleton {
	//정적 필드
	private static Singleton singleton = new Singleton();	//단 1개의 객체 생성
	
	//생성자
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
	
	
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();	//컴파일 에러 (객체 생성x)
//		Singleton obj2 = new Singleton();	//컴파일 에러 (객체 생성x)
		
		Singleton obj1 = Singleton.getInstance();	//getInstasnce로 Singleton객체 참조
		Singleton obj2 = Singleton.getInstance();	//getInstasnce로 Singleton객체 참조
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
