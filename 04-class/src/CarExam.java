
public class CarExam {

	public static void main(String[] args) {
		// class Car의 인스턴스 만들기 
//		Car c1 = new Car(); // new연산자 뒤 Car()는 생성자. new키워드는 클래스를 메모리위에 올려두라는 것. 즉, 인스턴스를 만든다.
//		Car c2 = new Car(); // c1, c2는 인스턴스를 가리킨다(참조)
		
		Car c1 = new Car("소방차");
//		Car c2 = new Car(); // 컴파일 오류
		System.out.println(c1.name);
	}
}
