package ch03.book.p1binary;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		//올바른 값을 얻기 위해서는 x나 y 둘 중 하나는 long이어야 하고 z가 long이어야 함
	}

}