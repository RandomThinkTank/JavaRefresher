package Generics;

public class simpleGenericExample<T> {

	T ob; //Object of type T.
	
	public simpleGenericExample(T o) {
		ob = o;
	}
	
	T getOb() {return ob;}
	
	void showType() {System.out.println("Type of T is " + ob.getClass().getName());}
	
}
