// ����� ���� Exception���� 
public class BizException extends RuntimeException {
	// �̹� �θ� Ŭ������ ���� ����� ������ �ִ� �����ڰ� �ֱ� ������ ����ڰ� ������ �� ��ü���� ���� �� ���� ���� ���޸� ��Ű��ȴ�. 
	public BizException(String msg){ // ������ 1. ���ڿ��� �� �����޽���
		super(msg);					// �����޽����� �����ڿ��� ����
	}
	public BizException(Exception e){ // ������ 2. ���� �߻��� Exception�� ��� e
		super(e);
	}
}
