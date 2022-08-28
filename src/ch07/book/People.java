package ch07.book;

public class People {
	public String name;
	public String ssn;
	
	//기본 생성자 없이 name,ssn 매개값으로 받는 생성자
	public People(String name, String ssn) {
		this.name= name;
		this.ssn = ssn;
	}

}
