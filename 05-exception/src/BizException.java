// 사용자 정의 Exception정의 
public class BizException extends RuntimeException {
	// 이미 부모 클래스가 같은 기능을 가지고 있는 생성자가 있기 때문에 사용자가 정의한 이 객체에서 따로 할 일은 없고 전달만 시키면된다. 
	public BizException(String msg){ // 생성자 1. 문자열로 된 오류메시지
		super(msg);					// 오류메시지를 생성자에게 보냄
	}
	public BizException(Exception e){ // 생성자 2. 실제 발생할 Exception을 담는 e
		super(e);
	}
}
