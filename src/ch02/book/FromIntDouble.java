package ch02.book;

public class FromIntDouble {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2	//컴파일 에러 (byte끼리 더하니 연산결과가 int)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	//컴파일 에러 (char끼리 더해도 연산결과 int
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 ="+ intValue2);
		System.out.println("출력문자 ="+ (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 =10;
//		int intValue6 = 10 /4.0	//컴파일 에러 (int와 double 연산 결과 double)
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}
}
