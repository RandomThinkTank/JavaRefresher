package Generics;

public class genericMethodDemo {
	/*
	 * Method takes two arrays of different types to see if the elements they contain
	 * the same.
	 * 
	 * returns true if the elements match.
	 */
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
		return true;
		
	}
}
