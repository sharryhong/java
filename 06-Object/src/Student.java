
public class Student {
	String name;
	String classNum; 
	int birthYear;
	
	// main + ctrl + spacebar�� �ڵ������� �� �ִ�. 
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.classNum = "2002";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "ȫ�浿";
		s2.classNum = "2002";
		s2.birthYear = 1995;
		
		if(s1.equals(s2))  // �������̵� ���� ������ �ٸ��ٰ� ���´�.// ����� classNum�� ������ ���ٰ� ���������Ƿ� ���ٰ� ���´�. 
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println(s1.hashCode()); // �������̵� ���� ������ �ٸ��ٰ� ���´�. // ����� classNum�� ������ ���ٰ� ���������Ƿ� ���ٰ� ���´�. 
		System.out.println(s2.hashCode()); // �������̵� ���� ������ �ٸ��ٰ� ���´�. // ����� classNum�� ������ ���ٰ� ���������Ƿ� ���ٰ� ���´�. 
		
		System.out.println(s1); // �������̵� ���� �ʰ� �����Ű�� ������ ���� ���� ���´�. ������ s1��ü�� ������ �ִ� �Ӽ��� �������� ������ �ִ��� �˰� �ʹ�. �������̵�����. 
		System.out.println(s1.toString()); // s1�� ����� ���� ���ٴ� ���� �� �� �ִ�. 
	}

	@Override
	public String toString() { // source>generate... �ڵ����� �������
		return "Student [name=" + name + ", classNum=" + classNum + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() { // source>generate... �ڵ����� �������
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classNum == null) ? 0 : classNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { // source>generate... �ڵ����� �������
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum == null) {
			if (other.classNum != null)
				return false;
		} else if (!classNum.equals(other.classNum))
			return false;
		return true;
	}
}
