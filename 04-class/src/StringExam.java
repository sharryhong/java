
public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello"; // 메모리 영역중에 상수가 저장되는 영역에 생긴다. 
		String str2 = "hello"; // 위와 똑같으므로 메모리 영역을 새로 만들지 않고 같은것이 있으면 그것을 참조한다. 즉 여기서 str1, str2는 같은 메모리를 참조하는 것이다. 
		
		String str3 = new String("hello"); // new로 하면 메모리 영역을 무조건 만든다. 
		String str4 = new String("hello"); // 위와 다른 메모리 영역 참조 
		// 테스트해보자. 
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다."); // 출력이 된다. 
		
		if(str1 == str3)
			System.out.println("str1과 str3은 같은 레퍼런스입니다.");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다.");
		
		System.out.println(str1); // hello
		System.out.println(str1.substring(3)); // lo // string의 메소드들은 새로운 string을 만들어 반환한다. substring 3번 인덱스부터 잘라서 출력하라. 
		System.out.println(str1); // hello // str1은 바뀌지 않았다. 
		
		if(str1.equals(str2)){ // .equals : 값은 값인지 확인
			System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
		}
	}

}
