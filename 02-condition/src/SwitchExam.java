
public class SwitchExam {

	public static void main(String[] args) {
		// 키워드 : switch, case, default, break
		int value = 1;
		// break가 없으면 해당조건 부터 모두 실행 
		switch(value) {  
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("other");
		}
		
		String str = "AAA";
		switch(str){ // JDK7부터는 정수뿐 아니라 문자열도 올 수 있다. 이전엔 정수만 가능.
			case "A":
				System.out.println("A");
				break;
			default:
				System.out.println("^^");
			
		}

	}

}
