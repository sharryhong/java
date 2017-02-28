package com.hong.car;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus(); // 객체가 생성되면 부모클래스의 기본생성자실행, 자식클래스의 기본생성자실행
		bus.run(); // 상속. bus의 부모클래스의 메소드 사용 
		bus.busMethod(); // 확장. bus의 메소드 사용
		
//		Car car = new Car("안녕?");
//		car.run();
//		car.busMethod(); // 부모클래스는 자식클래스의 메소드 사용불가 
		
		bus.drive(); // 오버라이딩되어 자식클래스의 메소드 호출 
	}

}
