package javaUtill.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object()); // �Ű������� ��ü�� �����Ͽ� �־��ش�. 
//		Object obj = box.getClass(); // ��ü ���� 
//		
//		box.setObj("hello"); // String. ObjectŸ���� �ڽĵ鵵 ��� ���� �� �ִ�.
////		box.getObj(); // �׷��� ���⼭�� ObjectŸ������ ��ȯ�Ѵ�. 
//		String str = (String)box.getObj(); // �̷��� ����ȯ�ؾ��Ѵ�. 
//		
//		box.setObj(10); // int. ObjectŸ���� �ڽĵ鵵 ��� ���� �� �ִ�.
//		int value = (int)box.getObj(); // �̷��� ����ȯ�ؾ��Ѵ�. 
		
		
		// Java5������ Generic�̶�� ������ �������μ� �ν��Ͻ��� ���� �� ����ϴ� Ÿ���� �����ϴ� ������ �߰��Ǿ���. 
		Box<Object> box = new Box<>(); // ObjectŸ���� �޾Ƶ��� �� �ֵ��� ��ü�� ����
		box.setObj(new Object());
		Object obj = box.getObj(); 
		
		Box<String> box2 = new Box<>();
		box2.setObj("string�� ���� �� �ִ�");
		String str = box2.getObj(); // ����ȯ���� �ʾƵ� �ȴ�. 
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(10);
		int v2 = box3.getObj();
	}

}

