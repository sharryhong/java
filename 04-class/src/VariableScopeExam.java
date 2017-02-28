
public class VariableScopeExam {
	int globalScope = 10;
	
	public void scopeTest(int value){
		int localScope = 20;
		System.out.println(globalScope); // ok
		System.out.println(localScope); // ok
		System.out.println(value); // ok
		System.out.println(staticVal); // ok
	}
	
	public void scopeTest2(int value2){
		System.out.println(globalScope); // ok
//		System.out.println(localScope); // no!
//		System.out.println(value); // no!
		System.out.println(value2); // ok
	}
	
	static int staticVal = 5;

	public static void main(String[] args) { // static한 메소드 
//		System.out.println(globalScope); // no! // 인스턴스화해서 사용해야한다. 
		System.out.println(staticVal); // 5 // static한 필드만 사용가능 
		
		VariableScopeExam v1 = new VariableScopeExam();
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 15;
		v2.globalScope = 25;
		System.out.println(v1.globalScope); // 15 // 인스턴스가 생성될 때 생성된다. 인스턴스 변수라고 한다. 
		System.out.println(v2.globalScope); // 25
		
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 100. static필드는 값 저장공간이 하나밖에 없어 값을 공유한다. 클래스 변수라고 한다. 
		System.out.println(v2.staticVal); // 100 
//		위처럼 사용하기보다는 클래스이름을 직접사용 가능하다. 
		System.out.println(VariableScopeExam.staticVal); // 100. 좀 더 바람직한 사용법 
	}
}
