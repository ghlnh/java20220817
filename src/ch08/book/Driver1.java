package ch08.book;

public class Driver1 {
	public void dirve(Vehicle vehicle) {
		if (vehicle instanceof Bus1) {
			Bus1 bus = (Bus1)vehicle;
			bus.checkFare();
		}vehicle.run();
	}
}
