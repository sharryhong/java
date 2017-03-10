package javaUtill.exam;

import java.util.List;
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
//		List도 인터페이스이므로 객체(인스턴스)를 직접 만들순없고, List를 구현하고 있는 대표적인 자료구조인 ArrayList를 쓰자. 
//		제너릭으로 String값만 사용
		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.add("Kim");
		list.add("Hong"); // List는 중복허용
		
		System.out.println(list.size()); // 3
		
//		List는 순서가 있는 자료구조이므로 index를 이용할 수 있다.
		for(int i = 0; i < list.size(); i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
