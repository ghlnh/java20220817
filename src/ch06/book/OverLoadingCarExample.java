package ch06.book;

public class OverLoadingCarExample {
	public static void main(String[] args) {
		//생성자 1 선택
		OverLoadingCar car1 = new OverLoadingCar();
		System.out.println("car1.company: "+ car1.company);
		System.out.println();
		
		//생성자2 선택
		OverLoadingCar car2 = new OverLoadingCar("자가용");
		System.out.println("car2.company: "+ car2.company);
		System.out.println("car2.model: "+ car2.model);
		System.out.println();
		
		//생성자3 선택
		OverLoadingCar car3 = new OverLoadingCar("자가용", "빨강");
		System.out.println("car3.company: "+ car3.company);
		System.out.println("car3.model: "+ car3.model);
		System.out.println("car3.color: "+ car3.color);
		System.out.println();
		
		//생성자4 선택
		OverLoadingCar car4 = new OverLoadingCar("택시", "검정", 200);
		System.out.println("car4.company: "+ car4.company);
		System.out.println("car4.model: "+ car4.model);
		System.out.println("car4.color: "+ car4.color);
		System.out.println("car4.maxSpeed: "+ car4.maxSpeed);
		System.out.println();
		
	}

}
