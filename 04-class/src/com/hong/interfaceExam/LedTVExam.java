package com.hong.interfaceExam;

public class LedTVExam {

	public static void main(String[] args) {
		TV tv = new LedTV();// 인터페이스도 참조변수의 타입이 될 수 있다. 이럴경우 인터페이스의 메소드만 사용할 수 있다. 상속의 개념과 같다.
		// 동일한 인터페이스를 사용하는 중요한 이유중 하나 : 만약 TV인터페이스를 구현하는 LcdTV를 만들었다면 
		// 위의 코드에서 new LedTV부분만 new LcdTV로 변경해도 똑같이 프로그램이 동작할 것다. 동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.
		tv.turnOn();
		tv.changeVolume(30);
		tv.changeChannel(9);
		tv.trunOff();
		
		tv.channel(); // interface default method사용
		
		TV.showVod(); // interface static method는 반드시 "인터페이스명.메소드" 형식으로 호출한다. 
	}
}
