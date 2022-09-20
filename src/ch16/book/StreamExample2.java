package ch16.book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));


		Map<String, List<String>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(Member::getJob,
						Collectors.mapping(Member::getName, Collectors.toList())));

//		Map<String, List<String>> groupingMap2 = list.stream()
//				.collect(Collectors.groupingBy(m -> m.getJob(),
//						Collectors.mapping(m -> m.getName(), Collectors.toList())));

		System.out.println(groupingMap);

	}

	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

		public String getJob() {
			return job;
		}

		public String getName() {
			return name;
		}
	}
}
