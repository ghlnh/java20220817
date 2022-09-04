package ch14.book;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		void method() {
			//람다식
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: "+outterField);
				//바깥객체의 참조를 얻기 위해 클래스명.this사용
				System.out.println("outterField: "+UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: "+innerField);
				//람다식 내부에서 this는 Inner객체 참조
				System.out.println("innerField: "+this.innerField + "\n");
				
				System.out.println("this: "+this + "\n");
			};
			fi.method();
		}
	}
}
