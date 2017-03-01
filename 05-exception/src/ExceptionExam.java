
public class ExceptionExam {

	public static void main(String[] args) {
		int i = 15;
		int j = 0; 
//		int k = i / j; // 0으로 나눌 수 없다. Exception in thread "main" java.lang.ArithmeticException: / by zero
//		System.out.println(k);
//		System.out.println("OK!");
		
//		예외처리를 해보자
		try { // 오류가 발생할 수 있는 부분
			int k = i / j;
			System.out.println(k);
		} catch(ArithmeticException e) { // 예외처리 부분. (Exception e)로 해도 됩니다. 모두 Exception클래스를 상속받으므로
			System.out.println("0으로 나눌 순 없습니다. " + e.toString()); // e.toString() : 예외의 정보를 알려주는 메소드
			return; // catch에 return이 있어도 finally부분은 실행됩니다. 
		} finally { // 생략가능
			System.out.println("오류발생여부에 상관없이 실행됩니다.");
		}
		System.out.println("OK!");
		
	}

}
