
public class ThrowsExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
//		int k = divide(i, j);
//		System.out.println(k);
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch(Exception e) {
			System.out.println("�����߻� : " + e.toString());
		}
	}
	
	public static int divide(int i, int j) throws Exception {
		int k = i / j; // ���⿡�� ��������. ���⿡�� ó�������ʰ� ���� ȣ���� ������ ó���ϰ� �ϰ�ʹ�.
		return k;
	}

}
