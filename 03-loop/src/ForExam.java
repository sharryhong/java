
public class ForExam {
//	¦���� �������� ����.
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++){
//			if(i % 2 != 0){ // Ȧ���̸� �ǳʶٰ� ����.
//				continue; // �ݺ��� ����κ� �����Ű�� �ʰ� �ٷ� ���� �����ؾ��ϴ� i++�� �ö󰣴�. 
//			}
			if(i == 50){
				break; // ������������ �ݺ����� �������´�. 
			}
			total += i;
			System.out.println(total);
		}
		System.out.println(total);
	}
}
