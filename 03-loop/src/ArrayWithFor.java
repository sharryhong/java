
public class ArrayWithFor {

	public static void main(String[] args) {
		int[] iarray = new int[100];
//		배열에 1 ~ 100 값 넣기 
		for(int i = 0; i < iarray.length; i++) { //iarray.length : 배열의 크기 
			iarray[i] = i + 1;
			System.out.println(iarray[i]);
		}
//		배열 값을 꺼내 모두 더하기 
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) { // i는 지역변수(for문안에서만 유효)
//			int sum = 0; // 여기에 선언하면 매번 초기화됨
			sum += iarray[i];
			System.out.println(sum);
		}
	}

}
