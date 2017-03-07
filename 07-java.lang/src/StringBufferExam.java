
public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		StringBuffer의 메소드들은 대부분 자기자신, this를 반환하기 때문에 메소드체이닝할 수 있다. 
//		StringBuffer에 추가된 값을 toString()메소드를 이용하여 반환
		String str = sb.append("hello").append(" ").append("world").toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("Hong");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
	}

}
