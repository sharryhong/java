import java.util.Calendar;
public class TernaryExam{
  public static void main(String[] args){
    //hour���� ���� �ð��� 24�ð� ������ ��� �ֽ��ϴ�. 
    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    String ampm;
    //���׿����ڸ� �̿��ؼ� ampm�� ���� �Ǵ� ������ ���� �������� ����� ������.
    ampm = (hour < 12) ? "����" : "����";
    System.out.println("���ݽð��� "+hour+"���̰�, "+ampm+"�Դϴ�.");
  }
}