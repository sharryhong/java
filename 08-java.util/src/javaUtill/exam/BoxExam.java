package javaUtill.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object()); // 매개변수로 객체를 생성하여 넣어준다. 
//		Object obj = box.getClass(); // 객체 리턴 
//		
//		box.setObj("hello"); // String. Object타입의 자식들도 모두 들어올 수 있다.
////		box.getObj(); // 그런데 여기서는 Object타입으로 반환한다. 
//		String str = (String)box.getObj(); // 이렇게 형변환해야한다. 
//		
//		box.setObj(10); // int. Object타입의 자식들도 모두 들어올 수 있다.
//		int value = (int)box.getObj(); // 이렇게 형변환해야한다. 
		
		
		// Java5에서는 Generic이라는 문법이 사용됨으로서 인스턴스를 만들 때 사용하는 타입을 지정하는 문법이 추가되었다. 
		Box<Object> box = new Box<>(); // Object타입을 받아들일 수 있도록 객체를 생성
		box.setObj(new Object());
		Object obj = box.getObj(); 
		
		Box<String> box2 = new Box<>();
		box2.setObj("string만 받을 수 있다");
		String str = box2.getObj(); // 형변환하지 않아도 된다. 
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(10);
		int v2 = box3.getObj();
	}

}

