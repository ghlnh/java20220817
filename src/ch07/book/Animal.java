package ch07.book;
//추상 클래스
public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
//추상 메소드	
	public abstract void sound();
}
