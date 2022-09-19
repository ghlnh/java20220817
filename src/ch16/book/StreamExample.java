package ch16.book;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
		);
		
		double avg = list.stream()
				//Member 객체를 age값으로 매핑해서 age를 요소로하는 새로운 스트림 생성
					.mapToInt(Member :: getAge)
					//mapToInt((m) -> m.getAge())	//getAge()호출해서 age를 요소로 새로운 스트림 생성
					.average()
					.getAsDouble();
		
		System.out.println("평균나이: "+ avg);
	}
	
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
		
		
		
	}
	
}
