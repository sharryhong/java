package javaUtill.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
//		set�� �������̽��̱⶧���� new�� �ν��Ͻ���ü�� ���� �� ����, set�� ������ Ŭ������ Hashset�� �̿��Ѵ�. 
		Set<String> set1 = new HashSet<>();
//		set�� �ߺ��� ������� �����Ƿ� �̹� ������ false��ȯ
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("hong");
		boolean flag3 = set1.add("kim"); // �ߺ�
		
		System.out.println(set1.size()); // ����� ũ�⸦ ���. �ߺ��� ���� ���� �����Ƿ� 2
		
		System.out.println(flag1); // true
		System.out.println(flag2); // true
		System.out.println(flag3); // false
		
//		�����͸� �ϳ��� ������ ���� iterator ���. 
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()){ // ������ true
			String str = iter.next(); // next()�޼ҵ�� �ϳ��� ������. �ϳ��� ������ �ڵ����� �������� �����Ѵ�.
			System.out.println(str);
		}

	}

}
