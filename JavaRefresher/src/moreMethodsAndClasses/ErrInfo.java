package moreMethodsAndClasses;

public class ErrInfo {

	public static void main(String[] args) {
		ErrorInfo ei = new ErrorInfo();
		Err e;
		
		e = ei.getErrorInfo(3);
		System.out.println(e.msg + " " + e.severity);
		
		e = ei.getErrorInfo(19);
		System.out.println(e.msg + " " + e.severity);
		
	}

}
