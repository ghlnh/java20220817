package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		
		sum(1, 10); // 1~10사이의 정수 합 출력		
		sum(1, 100); // 1~100사이의 정수 합 출력
		sum(50, 200); // 50~200
	}
		
		public static void sum(int n, int m) {
			long sum = 0;
			for (int i = n; i <= m; i++) {
				sum +=i;
			}
			System.out.println(n + "와" +m + "사이의 정수의 합은" + sum+"입니다.");
		}
	
}
