package com.hong.interfaceExam;

public class LedTVExam {

	public static void main(String[] args) {
		TV tv = new LedTV();// �������̽��� ���������� Ÿ���� �� �� �ִ�. �̷���� �������̽��� �޼ҵ常 ����� �� �ִ�. ����� ����� ����.
		// ������ �������̽��� ����ϴ� �߿��� ������ �ϳ� : ���� TV�������̽��� �����ϴ� LcdTV�� ������ٸ� 
		// ���� �ڵ忡�� new LedTV�κи� new LcdTV�� �����ص� �Ȱ��� ���α׷��� ������ �ʹ�. ������ �������̽��� �����Ѵٴ� ���� Ŭ���� ������ ���ٴ� ���� �ǹ��Ѵ�.
		tv.turnOn();
		tv.changeVolume(30);
		tv.changeChannel(9);
		tv.trunOff();
		
		tv.channel(); // interface default method���
		
		TV.showVod(); // interface static method�� �ݵ�� "�������̽���.�޼ҵ�" �������� ȣ���Ѵ�. 
	}
}
