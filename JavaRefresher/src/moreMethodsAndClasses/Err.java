package moreMethodsAndClasses;
/*
 * Err object has a constructor of a string for an error message along with an integer
 * indicating the severity of the error message.
 */
public class Err {
	String msg;
	int severity;
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
	
}
