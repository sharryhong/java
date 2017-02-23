
public class OperaotorExam02 {
	public int[] calculate() {
		int a = 7;
		int b = 3;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a % b;
		int ret[] = {c,d,e,f};
		return ret;
	}
	
	public static void main(String[] args) {
		new OperaotorExam02().calculate();
	}
}
