package com.hong.car;

public class GasStation {

	public static void main(String[] args) {
		GasStation gasStation = new GasStation();
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		gasStation.fill(bus);
		gasStation.fill(truck);
	}
	
	public void fill(Car car) { // Ŭ������ �Ű�����
//		car.getClass().getName()�� ������ � Ŭ�������� �˷��ش�.
		System.out.println(car.getClass().getName()+"�� �⸧ �ֱ�");
		car.gas += 10;
		System.out.println("�⸧�� "+car.gas+"���� ����ֽ��ϴ�.");
	}

}
