package com.hong.car;

public class Bus extends Car {
	public Bus(){
		super("����"); // �θ�����ڿ� �⺻�����ڰ� �ƴ� ������(������ ��� ���ڿ��� �Ű������� �޴� ������)�� �ִٸ�, �̷��� ȣ��������Ѵ�. 
					  // ȣ������ �ʴ´ٸ� �����Ϸ��� �⺻�����ڸ� ȣ���ϴµ�, �⺻�����ڰ� �����Ƿ� ������ �����̴�. 
		System.out.println("Bus�� �⺻������");
	}
	public void busMethod(){
		System.out.println("���� �޼ҵ��");
	} 
	public void drive(){ // �θ�Ŭ������ �޼ҵ�� ���� �̸� : �������̵� ��
		System.out.println("Bus����");
		super.drive(); // super�� �θ�Ŭ������ �ǹ��ϹǷ� �θ�Ŭ������ �޼ҵ嵵 �ҷ��� �� �ִ�. 
	}
}
