
public class LogicalOperatorExam {
//	int형 변수 age의 값을 검사해서 age가 19세 이하이거나 60세 이상인 할인 대상인지를 검사하려고 합니다.
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
