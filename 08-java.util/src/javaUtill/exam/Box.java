package javaUtill.exam;

public class Box<E> { // Generic ����� ����. ����Ŭ���� E 
	private E obj; // Object������ �����ߴ� �κ��� E�� �ٲ۴�. 
	
	public void setObj(E obj){  
		this.obj = obj;
	}
	
	public E getObj(){ 
		return obj;
	}
}
