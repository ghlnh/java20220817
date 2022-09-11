package ch11.book;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
public static void main(String[] args) {
	//선택번호
	int[] selectNumber = new int [6];	//선택번호 6개가 저장될 배열 생성
	Random random = new Random(3);	//선택번호를 얻기 위한 Random객체 생성
	System.out.print("선택번호: ");
	for(int i =0; i<6; i++) {
		selectNumber[i] = random.nextInt(45) +1; //선택번호를 얻어 배열에 저장
		System.out.print(selectNumber[i] + " ");
	}
	System.out.println();
	
	//당첨번호
	int[] winningNumber = new int [6];	//당첨번호 6개가 저장될 배열 생성
	random = new Random(5);	//당첨번호를 얻기 위한 Random객체 생성
	System.out.print("당첨번호: ");
	for(int i =0; i<6; i++) {
		winningNumber[i] = random.nextInt(45) +1; //당첨번호를 얻어 배열에 저장
		System.out.print(winningNumber[i] + " ");
	}
	System.out.println();
	
	//당첨여부
	//비교하기 전에 정렬
	Arrays.sort(selectNumber);
	Arrays.sort(winningNumber);
	boolean result = Arrays.equals(selectNumber, winningNumber);	//배열 항목 값 비교
	System.out.print("당첨 여부: ");
	if(result) {
		System.out.println("1등에 당첨되셨습니다.");
	}else {
		System.out.println("당첨되지 않았습니다.");
	}
}
}

//선택번호 Random 객체 생성시 종자값 3, 당첨번호 Random 객세 생성지 종자값 5
//서로 다른 종자값을 주었기 때문에 선택 번호와 당첨번호는 다를 수 밖에
//만약 종자값을 둘다 동일하게 주면 동일한 난수를 얻어 선택번호=당첨번호