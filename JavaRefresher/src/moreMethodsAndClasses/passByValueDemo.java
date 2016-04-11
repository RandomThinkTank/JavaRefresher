package moreMethodsAndClasses;

public class passByValueDemo {
	/*
	 * This method makes no change to the arguments passed in the call.
	 */
	void noChanges(int i, int j) {
		i = i + j;
		j = -j;
	}

}
