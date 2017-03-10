package javaUtill.exam;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
//		값 저장시 key, value가 쌍으로 
		map.put("001", "Hong");
		map.put("002", "Kim");
		map.put("003", "Hong");
		map.put("002", "Lee"); // key는 중복허용안하므로 "002" key값에 "Lee" value값 저장
		
		System.out.println(map.size());; // 3
		
//		어떤 데이터가 들어있는지 key값으로 확인
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
//		데이터를 모두 다 꺼내고 싶다.
//		1. key만 꺼내서 set자료구조에 넣는다.
		Set<String> keys = map.keySet();
//		2. set을 모두 꺼낼 때 : Iterator사용
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
