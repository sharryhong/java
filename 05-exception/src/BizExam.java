
public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		try{
			biz.bizMethod(-5); // RuntimeException�� ��ӹ޴� BizException�̹Ƿ� ����ó���� ���� �ʾƵ� ������ �����߻��� ���� �ʴ´�. 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
