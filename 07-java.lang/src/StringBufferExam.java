
public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		StringBuffer�� �޼ҵ���� ��κ� �ڱ��ڽ�, this�� ��ȯ�ϱ� ������ �޼ҵ�ü�̴��� �� �ִ�. 
//		StringBuffer�� �߰��� ���� toString()�޼ҵ带 �̿��Ͽ� ��ȯ
		String str = sb.append("hello").append(" ").append("world").toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("Hong");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
	}

}
