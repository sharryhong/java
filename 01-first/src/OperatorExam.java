
public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1; // 그대로 출력 
		int i3 = -i1; // - - => + 가 됨 
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3 + 1;
		System.out.println(i4); // 6
		System.out.println(i3); // 6
		
		int i5 = i3++; // ++가 뒤에 있으면 먼저 i3의 값인 6이 i5에 들어가고 그 후에 1 더해진다. 
		System.out.println(i5);
		System.out.println(i3); // 1이 더해져서 7
		
//		산술연산
		int i = 7; 
		int j = 4;
		System.out.println(i / j); // 둘다 int이기때문에 1
		System.out.println(i / (double)j); // double로 형변환하여 실수 값 1.75
		System.out.println(i % j); // 7나누기 4의 나머지 값 3
	}

}
