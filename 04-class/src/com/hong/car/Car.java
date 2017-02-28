package com.hong.car;

public class Car {
	public int gas;
	
	public Car(String name) {
		System.out.println(name + "을 받아들이는 Car의 생성자");
	}
	public void run(){
		System.out.println("달려~");
	}
	public void drive(){
		System.out.println("Car운전");
	}
}
