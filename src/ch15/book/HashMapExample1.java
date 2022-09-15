package ch15.book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	//"홍길동" 키가 같아 제일 마지막 저장 값으로 대치
		System.out.println("총 Entry수: "+ map.size()); 	//저장된 총 Entry수 얻기
		
		//객체 찾기
		System.out.println("\t 홍길동: "+ map.get("홍길동"));	//이름(키)로 점수(값)검색
		System.out.println();
		
		//객체를 하나씩 처리1
		Set<String> keySet = map.keySet();	//keySet 얻기
		//반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+ key +":"+ value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry수: "+ map.size()); 
		
		//객체를 하나씩 처리2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//Map.EntrySet얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		//반복해서 키를 얻고 값을 Map에서 얻어냄
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry수: "+ map.size()); 
		
	}

}
