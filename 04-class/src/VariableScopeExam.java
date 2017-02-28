
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

	public static void main(String[] args) { // static�� �޼ҵ� 
//		System.out.println(globalScope); // no! // �ν��Ͻ�ȭ�ؼ� ����ؾ��Ѵ�. 
		System.out.println(staticVal); // 5 // static�� �ʵ常 ��밡�� 
		
		VariableScopeExam v1 = new VariableScopeExam();
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 15;
		v2.globalScope = 25;
		System.out.println(v1.globalScope); // 15 // �ν��Ͻ��� ������ �� �����ȴ�. �ν��Ͻ� ������� �Ѵ�. 
		System.out.println(v2.globalScope); // 25
		
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 100. static�ʵ�� �� ��������� �ϳ��ۿ� ���� ���� �����Ѵ�. Ŭ���� ������� �Ѵ�. 
		System.out.println(v2.staticVal); // 100 
//		��ó�� ����ϱ⺸�ٴ� Ŭ�����̸��� ������� �����ϴ�. 
		System.out.println(VariableScopeExam.staticVal); // 100. �� �� �ٶ����� ���� 
	}
}
