
public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1; // �״�� ��� 
		int i3 = -i1; // - - => + �� �� 
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3 + 1;
		System.out.println(i4); // 6
		System.out.println(i3); // 6
		
		int i5 = i3++; // ++�� �ڿ� ������ ���� i3�� ���� 6�� i5�� ���� �� �Ŀ� 1 ��������. 
		System.out.println(i5);
		System.out.println(i3); // 1�� �������� 7
		
//		�������
		int i = 7; 
		int j = 4;
		System.out.println(i / j); // �Ѵ� int�̱⶧���� 1
		System.out.println(i / (double)j); // double�� ����ȯ�Ͽ� �Ǽ� �� 1.75
		System.out.println(i % j); // 7������ 4�� ������ �� 3
	}

}
