package ch11.book;

public class SmartPhoneExample {
public static void main(String[] args) {
	SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
	
	String strObj = myPhone.toString();
	System.out.println(strObj);
	System.out.println(myPhone);	//myPhone.toString()을 자동 호출해서 리턴값 얻은 후 출력
	//System.out.println의 매개값으로 객체를 주면 객체의 toString()메소드 호출해서 리턴 값 받아 출력
}
}
