package ch13.book;

public class BoxExample {
public static void main(String[] args) {
	Box box = new Box();
	box.set("홍길동");	//String->Object 자동 타입변환
	String name = (String) box.get();	//Object->String 강제 타입변환
	
	box.set(new Apple());	//Apple -> Object 자동타입변환
	Apple apple = (Apple) box.get();	//Object->Apple 강제 타입변환
}
}
