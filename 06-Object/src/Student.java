
public class Student {
	String name;
	String classNum; 
	int birthYear;
	
	// main + ctrl + spacebar로 자동생성할 수 있다. 
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.classNum = "2002";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.classNum = "2002";
		s2.birthYear = 1995;
		
		if(s1.equals(s2))  // 오버라이딩 하지 않으면 다르다고 나온다.// 현재는 classNum이 같으면 같다과 세팅했으므로 같다고 나온다. 
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println(s1.hashCode()); // 오버라이딩 하지 않으면 다르다고 나온다. // 현재는 classNum이 같으면 같다과 세팅했으므로 같다고 나온다. 
		System.out.println(s2.hashCode()); // 오버라이딩 하지 않으면 다르다고 나온다. // 현재는 classNum이 같으면 같다과 세팅했으므로 같다고 나온다. 
		
		System.out.println(s1); // 오버라이딩 하지 않고 실행시키면 뜻하지 않은 값이 나온다. 원래는 s1객체가 가지고 있는 속성이 무슨값을 가지고 있는지 알고 싶다. 오버라이딩하자. 
		System.out.println(s1.toString()); // s1을 출력한 값과 같다는 것을 알 수 있다. 
	}

	@Override
	public String toString() { // source>generate... 자동으로 만들어짐
		return "Student [name=" + name + ", classNum=" + classNum + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() { // source>generate... 자동으로 만들어짐
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classNum == null) ? 0 : classNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { // source>generate... 자동으로 만들어짐
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
