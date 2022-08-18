package ch06.book;

public class OverLoadingCar {
	//필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	OverLoadingCar() {
		
	}
	
	//생성자2
	OverLoadingCar(String model) {
		this.model = model;
	}
	
	//생성자3
	OverLoadingCar(String model, String color) {
		this.model =  model;
		this.color =  color;
	}
	
	//생성자4
	OverLoadingCar(String model, String color, int maxSpeed) {
		this.model =  model;
		this.color =  color;
		this.maxSpeed = maxSpeed;
	}
	
}
