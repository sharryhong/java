
public class WrapperExam {

	public static void main(String[] args) {
		int i = 5; // �⺻�� Ÿ��. ������, ��ü�� �ƴϴ�. 
		Integer i2 = new Integer(5); // int�� ��ü�� �ٲ��ִ� wrapper class. ������, ��ü
		
		Integer i3 = 5; // JAVA5���� �ڵ����� ����ȯ. ����ڽ� ���.(�⺻Ÿ�� �����͸� ��üŸ�� �����ͷ� �ڵ� ����ȯ ������)  
		
		int i4 = i3.intValue(); // IntegerŸ���� i3�� intŸ������ ����� �� ���� �̷��� �ؾ�������
		int i5 = i3; // JAVA5���� �̷��� ����. �����ڽ�(����ڽ̰� �ݴ�� ��üŸ�� �����͸� �⺻��Ÿ�� �����ͷ� �ڵ� ����ȯ)
	}
}
