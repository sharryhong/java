package com.hong.interfaceExam;

public class LedTVExam {

	public static void main(String[] args) {
		TV tv = new LedTV();// �������̽��� ���������� Ÿ���� �� �� �ִ�. �̷���� �������̽��� �޼ҵ常 ����� �� �ִ�. ����� ����� ����.
		tv.turnOn();
		tv.changeVolume(30);
		tv.changeChannel(9);
		tv.trunOff();
	}
}
