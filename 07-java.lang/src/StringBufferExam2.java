import java.util.Random;

public class StringBufferExam2 {
	public String randomName() {
		StringBuffer sb = new StringBuffer();
		String[] firstNames = {"John", "Sharry", "Chris"};
		String[] lastNames = {"Smith", "Hong", "Davis"};
		
//		0~3사이 랜덤숫자
		int random1 = new Random().nextInt(3);
//		랜덤하게 이름뽑기
		String firstName = firstNames[random1];
//		0~3사이 랜덤숫자
		int random2 = new Random().nextInt(3);
//		랜덤하게 이름뽑기
		String lastName = lastNames[random2];
		
		return sb.append(firstName).append(" ").append(lastName).toString();
	}

	public static void main(String[] args) {
		StringBufferExam2 exam = new StringBufferExam2();
		String str = exam.randomName();
		System.out.println(str);

	}

}
