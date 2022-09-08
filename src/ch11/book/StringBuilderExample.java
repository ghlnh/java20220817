package ch11.book;

public class StringBuilderExample {
 public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	
	//문자열을 끝에 추가
	sb.append("Java ");
	sb.append("Program Study");
	System.out.println(sb.toString());
	
	sb.insert(4, "2");	//인덱스 4위치 뒤에 "2"를 삽입
	System.out.println(sb.toString());
	
	sb.setCharAt(4,'6');	//인덱스 4위치의 문자를 6으로 변경
	System.out.println(sb.toString());
	
	sb.replace(6, 13, "Book");	//인덱스 6부터 13전까지 "Book"문자열로 대치
	System.out.println(sb.toString());
	
	sb.delete(4, 5);	//인덱스 4부터 인덱스 5전까지 삭제
	System.out.println(sb.toString());
	
	int length = sb.length();
	System.out.println("총문자수:" + length);
	
	String result = sb.toString();
	System.out.println(result);
	
}
}
