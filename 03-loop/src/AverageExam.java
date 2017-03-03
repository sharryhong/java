
public class AverageExam {
	public int average(int[] array){
		int sum = 0;
		int length = array.length;
//		for¹®
//		for(int i = 0; i < length; i++){
//			sum += array[i];
//		}
//		for each¹®
		for(int value: array){
//			System.out.println(value);
			sum += value;
			System.out.println(sum);
		}
		return sum/length;
	}
}
