
public class StringBufferPerformanceTest {

	public static void main(String[] args) {
//		(1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
//      시작시간을 기록합니다.(millisecond단위)
		long startTime1 = System.currentTimeMillis();
		String str = "";
		for(int i=0; i<10000; i++){
//			new StringBuffer() 객체가 반복문안에서 매번 생성된다. new 연산자가 많이 사용될수록 속도가 느려진다. 
			str = str + "*";
		}
//		종료시간을 기록 
		long endTime1 = System.currentTimeMillis();
		
//		(2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
//      시작시간을 기록
		long startTime2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<10000; i++){
			sb.append("*");
		}
//		종료시간
		long endTime2 = System.currentTimeMillis();
		
		long duration1 = endTime1 - startTime1;
		long duration2 = endTime2 - startTime2;
		
		System.out.println("String의 +연산을 이용한 경우: " + duration1);
		System.out.println("StringBuffer의 append()를 이용한 경우: " + duration2);
	}

}
