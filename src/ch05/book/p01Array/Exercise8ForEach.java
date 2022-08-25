package ch05.book.p01Array;

public class Exercise8ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		double cnt = 0;

		for (int [] i : array) {	//2차배열이기 때문에 배열 안 배열요소를 변수 i에 저장
			for (int j :i) {	//배열 안 배열의 요소들에 대한 실행문
				sum += j;
				cnt++;		//cnt는 i.length(=array의 길이)만큼 반복
			}
		}
		
		avg = sum / cnt;
		
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		
	}
}




