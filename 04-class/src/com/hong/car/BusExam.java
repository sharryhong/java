package com.hong.car;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus(); // ��ü�� �����Ǹ� �θ�Ŭ������ �⺻�����ڽ���, �ڽ�Ŭ������ �⺻�����ڽ���
		bus.run(); // ���. bus�� �θ�Ŭ������ �޼ҵ� ��� 
		bus.busMethod(); // Ȯ��. bus�� �޼ҵ� ���
		
//		Car car = new Car("�ȳ�?");
//		car.run();
//		car.busMethod(); // �θ�Ŭ������ �ڽ�Ŭ������ �޼ҵ� ���Ұ� 
		
		bus.drive(); // �������̵��Ǿ� �ڽ�Ŭ������ �޼ҵ� ȣ�� 
	}

}
