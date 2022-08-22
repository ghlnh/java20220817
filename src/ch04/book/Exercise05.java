package ch04.book;

public class Exercise05 {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			for (int j =1; j <=10; j++) {
				int r = (4* i) + (5*j);		//식 결과를 r이라는 변수에 저장
				if (r ==60) {				//답 출력하는 if문 작성
					System.out.println(i + "," +j);
				}
			}
		}
	}
}
