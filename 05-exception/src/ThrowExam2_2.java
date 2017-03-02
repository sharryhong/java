
public class ThrowExam2_2 {
//	public int get50Item(int[] array) throws ArrayIndexOutOfBoundsException {
//		return array[49];
//	}
	
	public int get50Item(int []array) throws IllegalArgumentException{
	    if(array.length < 50){
	      throw new IllegalArgumentException(array.length + "보다 커야합니다.");
	    }
	    return  array[49];
	  }
}
