
public class ThrowExam2 {
	public static void main(String[] args){
		ThrowExam2_2 thex = new ThrowExam2_2();
		try{
			int[] array = new int[49]; // 50�̻��̾�� ������ ������ �ʴ´�. ���� 50���� �۴ٸ� ����ó���� 
			thex.get50Item(array);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : " + e.toString());
		}
	}

}
