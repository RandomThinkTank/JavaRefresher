package overloading;

public class OverloadDemo {
	//Demonstrate overloading.
	public static void main(String[] args) {
		Overload ovl = new Overload();
		
		ovl.ovlDemo();
		ovl.ovlDemo(1);
		ovl.ovlDemo(5.0, 7.0);
		ovl.ovlDemo(6,  8);
	}

}
