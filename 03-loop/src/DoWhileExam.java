import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); // System.in : Ű����� ���� ���� �Է¹޴� Scanner Ŭ����  

		do { // �ѹ��� �Է¹��� 
			value = scan.nextInt(); // ���� �� �Է¹��� 
			System.out.println("�Է¹��� ��:" + value);
		} while(value != 10); // 10�� �ƴ� ��� �ݺ��� ���� 
		System.out.println("�ݺ��� ����!");
	}
}
