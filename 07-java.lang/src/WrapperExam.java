
public class WrapperExam {

	public static void main(String[] args) {
		int i = 5; // 기본형 타입. 참조형, 객체가 아니다. 
		Integer i2 = new Integer(5); // int를 객체로 바꿔주는 wrapper class. 참조형, 객체
		
		Integer i3 = 5; // JAVA5부터 자동으로 형변환. 오토박싱 기능.(기본타입 데이터를 객체타입 데이터로 자동 형변환 시켜줌)  
		
		int i4 = i3.intValue(); // Integer타입인 i3을 int타입으로 사용할 때 원래 이렇게 해야했지만
		int i5 = i3; // JAVA5부터 이렇게 가능. 오토언박싱(오토박싱과 반대로 객체타입 데이터를 기본형타입 데이터로 자동 형변환)
	}
}
