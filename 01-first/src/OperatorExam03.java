
public class OperatorExam03 {

	public static void main(String[] args) {
		int i = 10; // 단순 대입 연산자 
		int j = 10; 
		// 비교 연산자 
		System.out.println(i == j); // true
		System.out.println(i != j); // false
		System.out.println(i < j); // false
		System.out.println(i <= j); // true
		System.out.println(i > j); // false
		System.out.println(i >= j); // true
		
		i += 10; // 복합 대입 연산자. i = i + 10;
		System.out.println(i); // 20
	}

}
