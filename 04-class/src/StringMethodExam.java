
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello world"; // ������. String�� �Һ� Ŭ���� : �ѹ� ������� ��ü�� �ٲ��� �ʴ´�.
		
//		���ڿ��� ����
		System.out.println(str.length()); //11. ���ڿ��� ���̸� ���ؼ� �������ش�. 
		
//		���ڿ��� ���ڿ� ����
		System.out.println(str.concat(" HaHa")); //hello world HaHa. ���ο� String��ü�� ���������. 
		System.out.println(str); // hello world. �Һ� Ŭ�����̱� ���� 
//		�����ϴ� �κ��� �ٲٷ���
		str = str.concat(" HoHo"); // str ������ �ƿ� �ٲٱ� 
		System.out.println(str); // ���� hello world HoHo. 
		
//		���ڿ��� �߶󳻱�
		System.out.println(str.substring(3)); // lo world HoHo. �����ε���3���� �߶󳻱�
		System.out.println(str.substring(3, 7)); // lo w. �����ε������� ���ε������� �߶󳻱� 

	}

}
