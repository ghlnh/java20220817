package ch03.book.p1binary;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;	//10000.0 + "Nan" 결과 "Nan"이 됨
		System.out.println(currentBalance);
	}

}
