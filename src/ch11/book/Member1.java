package ch11.book;

public class Member1 implements Cloneable {	//복제 할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member1(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member1 getMember() {
		Member1 cloned = null;
		
		try {
			cloned = (Member1) clone();	//clone()메소드의 리턴타입은 Object이므로 강제타입변환
		}catch (CloneNotSupportedException e) {}
		return cloned;
}
}
