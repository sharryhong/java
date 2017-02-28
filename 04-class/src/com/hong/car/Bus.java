package com.hong.car;

public class Bus extends Car {
	public Bus(){
		super("버스"); // 부모생성자에 기본생성자가 아닌 생성자(지금의 경우 문자열을 매개변수로 받는 생성자)가 있다면, 이렇게 호출해줘야한다. 
					  // 호출하지 않는다면 컴파일러는 기본생성자만 호출하는데, 기본생성자가 없으므로 컴파일 에러이다. 
		System.out.println("Bus의 기본생성자");
	}
	public void busMethod(){
		System.out.println("버스 메소드야");
	} 
	public void drive(){ // 부모클래스의 메소드와 같은 이름 : 오버라이딩 됨
		System.out.println("Bus운전");
		super.drive(); // super는 부모클래스를 의미하므로 부모클래스의 메소드도 불러올 수 있다. 
	}
}
