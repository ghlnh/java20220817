package ch11.book;

import java.util.Arrays;

public class Member2 implements Cloneable {	//복제할 수 있다는 표시
	public String name;
	public int age;
	//참조타입 필드 (깊은 복제 대상)
	public int[] scores;
	public Car car;
	
	public Member2(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			//먼저 얕은 복사를 해서 name, age를 복제한다.
			Member2 cloned = (Member2) super.clone();	//Object의 clone()호출
			//scores를 깊은 복제
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			//car를 깊은 복제
			cloned.car = new Car(this.car.model);
			//깊은 복제된 Member2 객체를 리턴
			return cloned;
		}
	
	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();	//재정의된 clone() 메소드 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
