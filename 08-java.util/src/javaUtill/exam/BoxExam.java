package javaUtill.exam;

public class BoxExam {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Object()); // �Ű������� ��ü�� �����Ͽ� �־��ش�. 
		Object obj = box.getClass(); // ��ü ���� 
		
		box.setObj("hello"); // String. ObjectŸ���� �ڽĵ鵵 ��� ���� �� �ִ�.
//		box.getObj(); // �׷��� ���⼭�� ObjectŸ������ ��ȯ�Ѵ�. 
		String str = (String)box.getObj(); // �̷��� ����ȯ�ؾ��Ѵ�. 
		
		box.setObj(10); // int. ObjectŸ���� �ڽĵ鵵 ��� ���� �� �ִ�.
		int value = (int)box.getObj(); // �̷��� ����ȯ�ؾ��Ѵ�. 
		
	}

}

// Java5������ Generic�̶�� ������ �������μ� �ν��Ͻ��� ���� �� ����ϴ� Ÿ���� �����ϴ� ������ �߰��Ǿ���. 