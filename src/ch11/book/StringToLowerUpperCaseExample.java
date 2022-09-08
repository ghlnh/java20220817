package ch11.book;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//equalsIgnoreCase() 대소문자 무시하고 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}
}
