package com.hong.car;

public class GasStation {

	public static void main(String[] args) {
		GasStation gasStation = new GasStation();
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		gasStation.fill(bus);
		gasStation.fill(truck);
	}
	
	public void fill(Car car) { // 클래스형 매개변수
//		car.getClass().getName()은 실제로 어떤 클래스인지 알려준다.
		System.out.println(car.getClass().getName()+"에 기름 넣기");
		car.gas += 10;
		System.out.println("기름이 "+car.gas+"리터 들어있습니다.");
	}

}
