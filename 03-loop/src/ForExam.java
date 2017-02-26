
public class ForExam {
//	짝수만 더해지게 하자.
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++){
//			if(i % 2 != 0){ // 홀수이면 건너뛰게 하자.
//				continue; // 반복문 실행부분 실행시키지 않고 바로 다음 실행해야하는 i++로 올라간다. 
//			}
			if(i == 50){
				break; // 만난지점에서 반복문을 빠져나온다. 
			}
			total += i;
			System.out.println(total);
		}
		System.out.println(total);
	}
}
