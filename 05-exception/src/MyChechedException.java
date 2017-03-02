
public class MyChechedException extends Exception {
	public MyChechedException(String msg){
		super(msg);
	}
	public MyChechedException(Exception e){
		super(e);
	}
}
