package ch08.book;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus1();
		
		vehicle.run();
//		vehicle.checkFare();	//Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus1 bus = (Bus1)vehicle;	//강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}

}
