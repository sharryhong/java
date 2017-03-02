
public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		try{
			biz.bizMethod(-5); // RuntimeException을 상속받는 BizException이므로 오류처리를 하지 않아도 컴파일 오류발생은 하지 않는다. 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
