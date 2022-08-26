package ch06.book.s060602;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: "+ fiv.byteField);
		System.out.println("shortField: "+fiv.shortField);
		System.out.println("intField: "+ fiv.intField);
		System.out.println("longField: "+ fiv.longField);
		System.out.println("booleanField: "+fiv.booleanField);
		//유니코드로 0은 눈에 안보이는 숫자로 취급해서 안뜸
		System.out.println("charField: "+ fiv.charField);
		System.out.println("floatField: "+ fiv.floatField);
		System.out.println("doubleField: "+ fiv.doubleField);
		System.out.println("arrField: "+ fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
