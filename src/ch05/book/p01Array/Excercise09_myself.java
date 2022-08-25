
package ch05.book.p01Array;
import java.util.Scanner;
public class Excercise09_myself {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max =0;
		int sum =0;
		double avg =0.0;
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.print("학생수>");
				int students = scanner.nextInt();
				studentNum =students;
				//입력한 숫자만큼의 길이로 score 배열 생성
				scores= new int[studentNum];
			}else if (selectNo ==2) {
				System.out.print("학생 점수 입력>");
				for (int i=0; i< studentNum; i++) {
					System.out.println("scores[" + i + "]: ");
					scores[i] = scanner.nextInt();
				}
			}else if (selectNo ==3) {
				for (int i=0; i<scores.length; i++) {
				System.out.println("scores[" + i + "]: "+ scores[i]);
				}
			}else if (selectNo ==4) {
				for (int i=0; i< scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}avg = sum/ (double) scores.length;
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ avg);
			}else if (selectNo ==5) {
				run = false;
			}	
		}System.out.println("프로그램 종료");
	}
	
}


