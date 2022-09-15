package ch15.book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1_1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	//"Java"는 한 번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		

		//향상된 for문 사용
		for (String element: set) {
			System.out.println("\t" +element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		

		//forEach 사용
		set.forEach((e) -> System.out.println(e));
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음"); }
	}

}
