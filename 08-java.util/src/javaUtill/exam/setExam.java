package javaUtill.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
//		set은 인터페이스이기때문에 new로 인스턴스객체를 만들 수 없고, set을 구현한 클래스인 Hashset을 이용한다. 
		Set<String> set1 = new HashSet<>();
//		set은 중복을 허용하지 않으므로 이미 있으면 false반환
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("hong");
		boolean flag3 = set1.add("kim"); // 중복
		
		System.out.println(set1.size()); // 저장된 크기를 출력. 중복된 것은 들어가지 않으므로 2
		
		System.out.println(flag1); // true
		System.out.println(flag2); // true
		System.out.println(flag3); // false
		
//		데이터를 하나씩 꺼내기 위해 iterator 사용. 
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()){ // 있으면 true
			String str = iter.next(); // next()메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
			System.out.println(str);
		}

	}

}
