
public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; // 묵시적 형변환
		
		long x2 = 5;
//		int y2 = x2; // int는 5를 담을 수 있지만, 큰 타입을 작은 타입에 담을 수 없으므로 컴파일 에러 
		int y2 = (int) x2; // 강제적 형변환 
		
		System.out.println(y);
		System.out.println(y2);
	}

}
