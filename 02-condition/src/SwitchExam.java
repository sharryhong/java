
public class SwitchExam {

	public static void main(String[] args) {
		// Ű���� : switch, case, default, break
		int value = 1;
		// break�� ������ �ش����� ���� ��� ���� 
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
		switch(str){ // JDK7���ʹ� ������ �ƴ϶� ���ڿ��� �� �� �ִ�. ������ ������ ����.
			case "A":
				System.out.println("A");
				break;
			default:
				System.out.println("^^");
			
		}

	}

}
