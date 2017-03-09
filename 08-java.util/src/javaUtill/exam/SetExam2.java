package javaUtill.exam;

import java.util.*;

public class SetExam2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("a"); // 중복이므로 저장안됨. false
		
		System.out.println("set의 내용 출력");
		
		for(String str : set){
			System.out.println(str);
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}
