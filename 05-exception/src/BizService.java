// ����� ���� Exception���
public class BizService {
	public void bizMethod(int i) throws BizException{
		System.out.println("�����Ͻ� �޼ҵ� ����");
		
		if(i < 0) 
			throw new BizException("�Ű����� i�� 0���� Ŀ���Ѵ�.");
		
		System.out.println("�����Ͻ� �޼ҵ� ����");
	}
}
