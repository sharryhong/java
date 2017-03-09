package javaUtill.exam;

public class Box<E> { // Generic 사용을 위해. 가상클래스 E 
	private E obj; // Object형으로 선언했던 부분을 E로 바꾼다. 
	
	public void setObj(E obj){  
		this.obj = obj;
	}
	
	public E getObj(){ 
		return obj;
	}
}
