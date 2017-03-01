
public class ExceptionExam {

	public static void main(String[] args) {
		int i = 15;
		int j = 0; 
//		int k = i / j; // 0���� ���� �� ����. Exception in thread "main" java.lang.ArithmeticException: / by zero
//		System.out.println(k);
//		System.out.println("OK!");
		
//		����ó���� �غ���
		try { // ������ �߻��� �� �ִ� �κ�
			int k = i / j;
			System.out.println(k);
		} catch(ArithmeticException e) { // ����ó�� �κ�. (Exception e)�� �ص� �˴ϴ�. ��� ExceptionŬ������ ��ӹ����Ƿ�
			System.out.println("0���� ���� �� �����ϴ�. " + e.toString()); // e.toString() : ������ ������ �˷��ִ� �޼ҵ�
			return; // catch�� return�� �־ finally�κ��� ����˴ϴ�. 
		} finally { // ��������
			System.out.println("�����߻����ο� ������� ����˴ϴ�.");
		}
		System.out.println("OK!");
		
	}

}
