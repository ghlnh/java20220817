package ch04.book;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
	
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score < 90)
			System.out.println("점수가 90보다 작습니다");
		//{}생략 하고 if문 작성 가능하지만 코드해석이 어려워 지고
		//들여쓰기 잘못하면 버그 발생
		System.out.println("등급은 B 입니다.");		//if문과 상관없는 실행문
	}
}

