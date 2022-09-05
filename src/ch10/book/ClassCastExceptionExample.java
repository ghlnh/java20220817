package ch10.book;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat);
	}
	
	public static void ChangeDog(Animal animal) {
//		if(animal instanceof Dog) {
			Dog dog= (Dog) animal;
//		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
