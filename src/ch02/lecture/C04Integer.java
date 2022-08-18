package ch02.lecture;

public class C04Integer {
	public static void main(String[] args) {
		//정수 : byte(1), short(2), integer(4), long(8)
		//1 byte == 8bit (0000 0000)
		//0~255(1111 1111)	//맨앞이 1로 시작하면 음수
		//-128~127
	
	byte a = 0;
	byte b = 127;
	byte c = -128;
//	byte d = 128;
//	byte e = -129;
	
		//short (2 byte)
		//-32,768~ -32,767
	short f = -32768;
	short g = 32767;
//	short h = 32768;
//	short i = -32769;
	
		
		//int (4 bytes)
		//-2,147,483,648~ 2,147,483,647
	int j = -2147483648;
	int k = 2147483647;
//	int l = -30000000000;
//	int m = 30000000000;
	
		//long (8 bytes)
		//매운 큰 값
	long o = 220000000;
	long p = -30000000;
	
	
		//정수 literal 작성시 주의 할 점
		//정수 literal은 int 취급
		//범위를 넘어 갈 땐 long타입으로 표시 (대문자L)
		//작성하는 수가 클 땐 _와 조합 가능
	
	long q = 2_100_000_000;
	long r = 21_0000_0000;
	
		//연산 시 주의
		//연산 도중 해당 타입의 범위를 넘어가는 수가 되면 
		//오버플로우되서 차이의 절대값만큼 순환값 도출
	
	
	
	
	}

}
