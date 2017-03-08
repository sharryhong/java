package javaUtill.exam;

public class Box {
	private Object obj; 
	
	public void setObj(Object obj){ // Object타입의 자식들도 모두 들어올 수 있다. 
		this.obj = obj;
	}
	
	public Object getObj(){ // Object타입만 리턴됨 
		return obj;
	}
}
