
public class ArrayWithFor {

	public static void main(String[] args) {
		int[] iarray = new int[100];
//		�迭�� 1 ~ 100 �� �ֱ� 
		for(int i = 0; i < iarray.length; i++) { //iarray.length : �迭�� ũ�� 
			iarray[i] = i + 1;
			System.out.println(iarray[i]);
		}
//		�迭 ���� ���� ��� ���ϱ� 
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) { // i�� ��������(for���ȿ����� ��ȿ)
//			int sum = 0; // ���⿡ �����ϸ� �Ź� �ʱ�ȭ��
			sum += iarray[i];
			System.out.println(sum);
		}
	}

}
