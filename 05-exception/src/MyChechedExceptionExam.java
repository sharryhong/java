
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
			throw new MyChechedException("배열 길이는 50이상이어야 합니다.");
		}
		return array[49];
	}

}
