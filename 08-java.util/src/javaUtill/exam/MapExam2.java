package javaUtill.exam;

//products는 상품의 이름을 key로 가격을 값으로 가지는 Map입니다.
//"가위"는 2500원, "크래파스"는 5000원이 되도록 products에 값을 추가해 보세요.

import java.util.*;

public class MapExam2 {
	public Map<String, Integer> makeMap(){
		Map<String, Integer> products = new HashMap<>();
		products.put("가위", 2500);
		products.put("크래파스", 5000);
//		System.out.println(products.size());
		return products;
	}
	

	public static void main(String[] args) {
		Map<String, Integer> products2 = new HashMap<>();
		MapExam2 make = new MapExam2();
		products2 = make.makeMap();
		System.out.println(products2.size());
		
		Set<String> keys = products2.keySet();
		System.out.println(keys);
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			Integer value = products2.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
