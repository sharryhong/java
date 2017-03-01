package com.hong.interfaceExam;

public class LedTV implements TV { // TV 인터페이스가 가진 기능을 LedTV도 갖게하겠다. 모든 기능(메소드)을 구현해야한다. 

	@Override
	public void turnOn() {
		System.out.println("켜다");
	}

	@Override
	public void trunOff() {
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println(volume + "볼륨조절");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println(channel + "채널 바꾸기");
	}

}
