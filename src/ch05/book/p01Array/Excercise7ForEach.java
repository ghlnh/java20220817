package ch05.book.p01Array;

public class Excercise7ForEach {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE; //정수 값 중 가장 작은 값
		int[] array = { 1, 5, 3, 8, 2 };
		for (int a : array) {
			if (max < a) {
				max = a;
			}
		}
		//가장 작은 값 구하기
		int min = max;	//Integer.MAX_VALUE로 정수 값 중 가장 큰 값으로 대체 가능
		for (int b : array ) {
			if (min > b) {
				min = b;
			}
		}
		
		System.out.println("max: "+ max);
		System.out.println("min: "+ min);
	}

}
