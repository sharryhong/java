
public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello"; // �޸� �����߿� ����� ����Ǵ� ������ �����. 
		String str2 = "hello"; // ���� �Ȱ����Ƿ� �޸� ������ ���� ������ �ʰ� �������� ������ �װ��� �����Ѵ�. �� ���⼭ str1, str2�� ���� �޸𸮸� �����ϴ� ���̴�. 
		
		String str3 = new String("hello"); // new�� �ϸ� �޸� ������ ������ �����. 
		String str4 = new String("hello"); // ���� �ٸ� �޸� ���� ���� 
		// �׽�Ʈ�غ���. 
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�."); // ����� �ȴ�. 
		
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
		
		System.out.println(str1); // hello
		System.out.println(str1.substring(3)); // lo // string�� �޼ҵ���� ���ο� string�� ����� ��ȯ�Ѵ�. substring 3�� �ε������� �߶� ����϶�. 
		System.out.println(str1); // hello // str1�� �ٲ��� �ʾҴ�. 
		
		if(str1.equals(str2)){ // .equals : ���� ������ Ȯ��
			System.out.println("str1�� str2�� ���� ���� ������ �ֽ��ϴ�.");
		}
	}

}
