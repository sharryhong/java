
public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; // ������ ����ȯ
		
		long x2 = 5;
//		int y2 = x2; // int�� 5�� ���� �� ������, ū Ÿ���� ���� Ÿ�Կ� ���� �� �����Ƿ� ������ ���� 
		int y2 = (int) x2; // ������ ����ȯ 
		
		System.out.println(y);
		System.out.println(y2);
	}

}
