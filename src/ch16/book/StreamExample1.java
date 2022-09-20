package ch16.book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		List<Member> developers = list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.collect(Collectors.toList());
		// import static java.util.stream.Collectors.*; 로 임포트하면
		// collect(toList()); 로 더 코드를 간결하게 작성 가능
		developers.stream()
				.forEach(m -> System.out.println(m.getName()));

	}

	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		};

	}

}
