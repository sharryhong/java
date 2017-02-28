
public class ReferenceTypeExam {

	public static void main(String[] args) {
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		// 기본타입 return이 없을 때
		int value = 10;
		exam.addOne(value); // 메소드상의 value변수 값은 11이 되지만
		System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과: " + value); // 여기의 value변수는 10이다. 
		
		// 기본타입 return이 있을 때 
		int value2 = 10;
		int result = exam.addOne2(value); 
		System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과: " + result);	// result는 11, value2는 10 	
		
		// 참조타입 return이 없을 때 
		int[] arr = {10};
		exam.addOne(arr); // return이 없어도 참조형이기때문에 값은 변경되어 있다. 
		System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과: " + arr[0]); // 11 
	}

	public void addOne(int value){
		++value;
		System.out.println("addOne메소드의 value:" + value);
	}
	
	public int addOne2(int v) {
		return ++v;
	}
	
	public void addOne(int[] arr){
		for(int i=0; i<arr.length; i++){
			arr[i]++;
		}
	}
}
