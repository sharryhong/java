
public class MyChechedExceptionExam {

	public static void main(String[] args) {
		MyChechedExceptionExam ex = new MyChechedExceptionExam();
		int[] array = new int[10];
		
		try{
			ex.get50thItem(array);
		} catch(Exception e){
//			System.out.println(e.toString());
			e.printStackTrace();
		}

	}
	
	public int get50thItem(int[] array) throws MyChechedException{
		if(array.length < 50){
			throw new MyChechedException("�迭 ���̴� 50�̻��̾�� �մϴ�.");
		}
		return array[49];
	}

}
