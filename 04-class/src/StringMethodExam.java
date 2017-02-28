
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello world"; // 참조형. String은 불변 클래스 : 한번 만들어진 객체를 바꾸지 않는다.
		
//		문자열의 길이
		System.out.println(str.length()); //11. 문자열의 길이를 구해서 리턴해준다. 
		
//		문자열과 문자열 결합
		System.out.println(str.concat(" HaHa")); //hello world HaHa. 새로운 String객체가 만들어진다. 
		System.out.println(str); // hello world. 불변 클래스이기 때문 
//		참조하는 부분을 바꾸려면
		str = str.concat(" HoHo"); // str 참조를 아예 바꾸기 
		System.out.println(str); // 이제 hello world HoHo. 
		
//		문자열을 잘라내기
		System.out.println(str.substring(3)); // lo world HoHo. 시작인덱스3부터 잘라내기
		System.out.println(str.substring(3, 7)); // lo w. 시작인덱스부터 끝인덱스까지 잘라내기 

	}

}
