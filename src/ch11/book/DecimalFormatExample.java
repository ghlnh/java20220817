package ch11.book;

import java.text.DecimalFormat;

public class DecimalFormatExample {
public static void main(String[] args) {
	double num = 1234567.89;
	//10진수 (빈자리는 0으로 채움)
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	//10진수 (빈자리는 채우지 않음)
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("##########.#####");
	System.out.println(df.format(num));
	
	//10진수 (0이랑 # 섞어서, 소수점, 단위 구분, 음수기호)
	df = new DecimalFormat("#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,###.0");
	System.out.println(df.format(num));
	
	//단위문자E
	df = new DecimalFormat("0.0E0");
	System.out.println(df.format(num));
	
	//패턴구분자 ;
	df = new DecimalFormat("+#,###; -#,###");
	System.out.println(df.format(num));
		
	//%퍼센트
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	//통화기호
	df = new DecimalFormat("\u00A4 #,###");
	System.out.println(df.format(num));
}
}
