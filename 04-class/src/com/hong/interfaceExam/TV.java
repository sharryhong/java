package com.hong.interfaceExam;

public interface TV {
//	final키워드를 쓰지 않아도 상수로 된다. 
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
//	인터페이스 자체가 구현은 하지 않고 선언만 하는 것이므로 abstract를 안써도 된다.
	public void turnOn(); 
	public void trunOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
