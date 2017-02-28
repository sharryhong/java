
public class ReferenceTypeExam {

	public static void main(String[] args) {
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		// �⺻Ÿ�� return�� ���� ��
		int value = 10;
		exam.addOne(value); // �޼ҵ���� value���� ���� 11�� ������
		System.out.println("�⺻�� ������ ���� �ٸ� �޼ҵ忡�� ������ ���: " + value); // ������ value������ 10�̴�. 
		
		// �⺻Ÿ�� return�� ���� �� 
		int value2 = 10;
		int result = exam.addOne2(value); 
		System.out.println("�⺻�� ������ ���� �ٸ� �޼ҵ忡�� ������ ���: " + result);	// result�� 11, value2�� 10 	
		
		// ����Ÿ�� return�� ���� �� 
		int[] arr = {10};
		exam.addOne(arr); // return�� ��� �������̱⶧���� ���� ����Ǿ� �ִ�. 
		System.out.println("������ ������ ���� �ٸ� �޼ҵ忡�� ������ ���: " + arr[0]); // 11 
	}

	public void addOne(int value){
		++value;
		System.out.println("addOne�޼ҵ��� value:" + value);
	}
	
	public int addOne2(int v) {
		return ++v;
	}
	
	public void addOne(int[] arr){
		for(int i=0; i<arr.length; i++){
			arr[i]++;
		}
	}
}
