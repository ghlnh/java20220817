package ch14.book;
import java.util.function.*;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		//생성자 참조 안하면 (s)->new Member(s)
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply(" 신천사", "angel");
		//생성자 참조 안하면 (s1, s2) -> new Member(s1, s2)
	}
	
	
}
