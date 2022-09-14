package ch15.book; 

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsListExample {
public static void main(String[] args) {
	List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
	for(String name: list1) {
		System.out.println(name);
	}
	
	List<Integer> list2 = Arrays.asList(1, 2, 3);
	//향상된 for문
//	for(int value : list2) {
//		System.out.println(value);
//	}
	//일반 for문
//	for (int i = 0; i < list2.size(); i++) {
//		System.out.println(i);
//	}
	//forEach()사용
//	list2.forEach((a)->System.out.println(a));
//	
	//Iterator 사용
	Iterator<Integer> iterator = list2.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
