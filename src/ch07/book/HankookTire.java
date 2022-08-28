package ch07.book;

public class HankookTire extends Tire {
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;	//누적 회전수 1증가
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "hankookTire 수명: " +
				(maxRotation-accmulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("***"+ location + "hankookTire 펑크 ***");
			return false;
		}
	}

}
