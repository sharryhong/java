public class OperatorExam04 {
	public boolean[] calculate(int a, int b) {
		//���� a�� b�� int�� �����Դϴ�. ���� � ���� ������ �ִ����� ���� ���� ������ �𸨴ϴ�.
		//a�� b�� �־��� �ִٰ� �����ϰ� �Ʒ� ���ÿ� ���� ������ Ǯ�� ������.
	
		//a�� b���� ū �� ���� ���(true �Ǵ� false)�� c�� �����ϼ���.
		boolean c = a > b;
		
		//a�� b�� ������ ���� ����� d�� �����ϼ���.
		boolean d = a == b;
		
		//a�� b�� �ٸ��� ���� ����� e�� �����ϼ���.
		boolean e = a != b;
		
		//�� �Ʒ� �ڵ�� ��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
		boolean ret[]={c,d,e};
		return ret;
	}

	public static void main(String[]args){
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		new OperatorExam04().calculate(a,b);
	}
}