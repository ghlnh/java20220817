package ch07.book;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog());		//메소드 실행 시, 자동 타입 변환&오버라이딩된 메소드 호출
		animalSound(new Cat());		//메소드 실행 시, 자동 타입 변환&오버라이딩된 메소드 호출
	
	}
	public static void animalSound(Animal animal) {
		animal.sound();	
	}
}
