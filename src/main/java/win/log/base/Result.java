package win.log.base;

public class Result<T> {

	private boolean isok;
	private String message;
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT1(T t) {
		this.t = t;
	}
	public boolean isIsok() {
		return isok;
	}
	public void setIsok(boolean isok) {
		this.isok = isok;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setT(T t2) {
		// TODO Auto-generated method stub
		
	}
	
}
