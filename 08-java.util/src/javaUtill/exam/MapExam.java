package javaUtill.exam;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
//		�� ����� key, value�� ������ 
		map.put("001", "Hong");
		map.put("002", "Kim");
		map.put("003", "Hong");
		map.put("002", "Lee"); // key�� �ߺ������ϹǷ� "002" key���� "Lee" value�� ����
		
		System.out.println(map.size());; // 3
		
//		� �����Ͱ� ����ִ��� key������ Ȯ��
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
//		�����͸� ��� �� ������ �ʹ�.
//		1. key�� ������ set�ڷᱸ���� �ִ´�.
		Set<String> keys = map.keySet();
//		2. set�� ��� ���� �� : Iterator���
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
