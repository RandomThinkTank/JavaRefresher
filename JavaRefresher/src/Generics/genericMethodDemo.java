package Generics;

public class genericMethodDemo {
	/*
	 * Method takes two arrays of different types to see if the elements they contain
	 * the same.
	 * 
	 * returns true if the elements match.
	 */
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
		//Check the lengths first.
		if(x.length != y.length) return false;
		
		//Then check each element.
		for(int i = 0; i < x.length; i++){
			if(!x[i].equals(y[i])) return false;
		}
		return true;
		
	}
}
