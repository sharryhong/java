
public class LogicalOperatorExam {
//	int�� ���� age�� ���� �˻��ؼ� age�� 19�� �����̰ų� 60�� �̻��� ���� ��������� �˻��Ϸ��� �մϴ�.
	public boolean ifAgeDiscountable(int age) {
		boolean isDiscount = false;
		if( age <= 19 || age >= 60 ) {
			isDiscount = true;
		} else {
			isDiscount = false;
		}
		return isDiscount;
	}
	public static void main(String[] args) {
		LogicalOperatorExam exam = new LogicalOperatorExam();
		exam.ifAgeDiscountable(15);
		exam.ifAgeDiscountable(40);
	}

}
