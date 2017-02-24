import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); // System.in : 키보드로 부터 값을 입력받는 Scanner 클래스  

		do { // 한번은 입력받음 
			value = scan.nextInt(); // 정수 값 입력받음 
			System.out.println("입력받은 값:" + value);
		} while(value != 10); // 10이 아닐 경우 반복문 수행 
		System.out.println("반복문 종료!");
	}
}
