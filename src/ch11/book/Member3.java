package ch11.book;
//Member3타입만 비교하기위해 제네릭<>사용
public class Member3 implements Comparable<Member3>{
	String name;
	Member3 (String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member3 o) {
		return name.compareTo(o.name);
	}
}
