package ch15.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<> ();
	map.put("blue", 96);
	map.put("hong", 86);
	map.put("white", 92);
	
	String name = null;
	int maxScore =0;
	int totalScore =0;
	int avgScore =0;
	
	Set<String>keySet =map.keySet();
	for (String key : keySet) {
		totalScore += map.get(key);
		maxScore = Math.max(maxScore,map.get(key));
		if (map.get(key).intValue()==maxScore) {
			name = key;
		}
	}
	avgScore = totalScore/map.size();


	
	System.out.println("평균점수: "+ avgScore);
	System.out.println("최고점수: "+ maxScore);
	System.out.println("최고점수를 받은 아이디: "+ name);
}
}
