package moreMethodsAndClasses;

public class ErrorInfo {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index OOB"
	};
	
	int severity[] = {2,2,3,4};
	Err getErrorInfo(int errorCode) {
		if(errorCode >= 1 && errorCode < msgs.length ) {
			return new Err(msgs[errorCode], severity[errorCode]);
		}
		return new Err("Invalid Error Code", 0);
	}
}
