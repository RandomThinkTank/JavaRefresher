package moreMethodsAndClasses;

public class ErrorInfo {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index OOB"
	};
	
	int severity[] = {2,2,3,4};
	String getErrorInfo(int errorCode) {
		if(errorCode >= 1 && errorCode < msgs.length ) {
			return msgs[errorCode] + " Severity: " + severity[errorCode];  
		}
		return "Invalid Error Code";
	}
}
