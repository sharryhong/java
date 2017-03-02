
public class ThrowExam2 {
	public static void main(String[] args){
		ThrowExam2_2 thex = new ThrowExam2_2();
		try{
			int[] array = new int[49]; // 50이상이어야 오류가 생기지 않는다. 만약 50보다 작다면 예외처리됨 
			thex.get50Item(array);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 : " + e.toString());
		}
	}

}
