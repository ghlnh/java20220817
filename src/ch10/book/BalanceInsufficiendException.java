package ch10.book;

public class BalanceInsufficiendException extends Exception{
	//Exception으로 정의할거면 Exception을 상속,
	//RuntimeException으로 정의할거면 RuntimeException을 상속
	public BalanceInsufficiendException() {
		// TODO Auto-generated constructor stub
	}
	public BalanceInsufficiendException(String message) {
		//상위클래스인 Exception의 getMessage 이용할거기 때문에 super
		super(message);
	}

}
