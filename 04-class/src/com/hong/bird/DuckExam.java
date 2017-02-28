package com.hong.bird;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing(); // duck은 추상클래스 Bird를 상속받았으므로 가능
		duck.fly(); // 상동
		
//		Bird bird = new Bird(); // 추상클래스는 객체를 생성할 수 없다. 

	}

}
