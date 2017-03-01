
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
			System.out.println("오류발생 : " + e.toString());
		}
	}
	
	public static int divide(int i, int j) throws Exception {
		int k = i / j; // 여기에서 오류생김. 여기에서 처리하지않고 나를 호출한 곳에서 처리하게 하고싶다.
		return k;
	}

}
