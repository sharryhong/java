package com.hong.interfaceExam;

public interface TV {
//	finalŰ���带 ���� �ʾƵ� ����� �ȴ�. 
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
//	�������̽� ��ü�� ������ ���� �ʰ� ���� �ϴ� ���̹Ƿ� abstract�� �Ƚᵵ �ȴ�.
	public void turnOn(); 
	public void trunOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
//	JAVA8���� �߰��� �������̽��� default, static �޼ҵ�
	default void channel(){ // ��������
		System.out.println("�⺻ä��");
	}
	
	public static void showVod(){ // ��������
		System.out.println("Vod�� �ٷΰ���");
	}
}
