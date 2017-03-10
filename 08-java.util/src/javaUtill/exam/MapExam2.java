package javaUtill.exam;

//products�� ��ǰ�� �̸��� key�� ������ ������ ������ Map�Դϴ�.
//"����"�� 2500��, "ũ���Ľ�"�� 5000���� �ǵ��� products�� ���� �߰��� ������.

import java.util.*;

public class MapExam2 {
	public Map<String, Integer> makeMap(){
		Map<String, Integer> products = new HashMap<>();
		products.put("����", 2500);
		products.put("ũ���Ľ�", 5000);
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
