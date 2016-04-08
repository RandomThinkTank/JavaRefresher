package moreMethodsAndClasses;

public class softFailArray {
	
	private int a[]; //the private array being encapsulated
	private int errval; //value to return should the getter fail.
	public int length;
	
	public softFailArray(int size, int errv) {
		a = new int[size];
		length = size;
		errval = errv;
	}
	
	public int get(int index) {
		if(indexOk(index)) return a[index];
		return a[index];
	}

	private boolean indexOk(int index) {
		if(index >=0 && index < length) return true;
		return false;
	}
}
