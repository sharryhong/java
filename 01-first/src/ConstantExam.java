
public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5; 
		System.out.println(i);
		
		final int J = 9;
		
		double circleArea;
//		circleArea = 3 * 3 * 3.14159; // 3.14159는 변하지 않는다. 상수를 써보자. 
		final double PI = 3.14159;
//		circleArea = 3 * 3 * PI; // 이렇게 숫자가 무얼 의미할까?
		
		final int OIL_PRICE = 1150; // 기름값
		int totalPrice = 50 * OIL_PRICE;
	}

}
