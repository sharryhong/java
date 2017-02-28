package com.hong.bird;

public class Duck extends Bird { // 부모클래스 : 추상클래스 Bird
	public void sing() { // 추상클래스의 추상메소드를 반드시 구현해야 한다. 
		System.out.println("오리는 꽥꽥");
	}
}
