
public class IfExam {

	public int conditionTest(int value) {
		int ret = 0;
		if(value % 3 == 0) {
			ret = 3;
		} else if(value % 4 == 0) {
			ret = 4;
		}
		return ret;
	}
	public static void main(String[] args) {
		IfExam exam = new IfExam();
		exam.conditionTest(6);
		exam.conditionTest(8);
	}

}
