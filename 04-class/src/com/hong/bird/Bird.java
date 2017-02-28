package com.hong.bird;

public abstract class Bird { // 추상메소드가 존재한다면 이 클래스는 무조건 추상클래스 
	public abstract void sing(); // 내용이 없는 추상 메소드 
	
	public void fly() {
		System.out.println("날다");
	}
}
