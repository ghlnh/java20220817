package ch07.book;

public class Student extends People{
	public int studnetNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//부모 생성자 호출
		this.studnetNo = studentNo;
	}
}
