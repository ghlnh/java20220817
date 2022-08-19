package ch06.book;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//정적 초기화 블록
	static {
		info = company + "-" + model;
	}

	//호출
	public static void main(String[] args) {
		System.out.println(Television.info);
		}
		
}
