package javaUtill.exam;

import java.util.List;
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
//		List�� �������̽��̹Ƿ� ��ü(�ν��Ͻ�)�� ���� ���������, List�� �����ϰ� �ִ� ��ǥ���� �ڷᱸ���� ArrayList�� ����. 
//		���ʸ����� String���� ���
		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.add("Kim");
		list.add("Hong"); // List�� �ߺ����
		
		System.out.println(list.size()); // 3
		
//		List�� ������ �ִ� �ڷᱸ���̹Ƿ� index�� �̿��� �� �ִ�.
		for(int i = 0; i < list.size(); i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
