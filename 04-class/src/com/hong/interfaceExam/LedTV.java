package com.hong.interfaceExam;

public class LedTV implements TV { // TV �������̽��� ���� ����� LedTV�� �����ϰڴ�. ��� ���(�޼ҵ�)�� �����ؾ��Ѵ�. 

	@Override
	public void turnOn() {
		System.out.println("�Ѵ�");
	}

	@Override
	public void trunOff() {
		System.out.println("����");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println(volume + "��������");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println(channel + "ä�� �ٲٱ�");
	}

}
