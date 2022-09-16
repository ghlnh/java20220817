package ch15.book;

public class Student1 implements Comparable<Student1>{
	public String id;
	public int score;
	
	public Student1(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Student1 o) {
		int diff = this.score - o.score;
		return diff;
	}
}
