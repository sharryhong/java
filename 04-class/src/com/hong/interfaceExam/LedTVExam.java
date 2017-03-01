package com.hong.interfaceExam;

public class LedTVExam {

	public static void main(String[] args) {
		TV tv = new LedTV();// 인터페이스도 참조변수의 타입이 될 수 있다. 이럴경우 인터페이스의 메소드만 사용할 수 있다. 상속의 개념과 같다.
		tv.turnOn();
		tv.changeVolume(30);
		tv.changeChannel(9);
		tv.trunOff();
	}
}
