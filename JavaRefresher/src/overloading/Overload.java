package overloading;

//Demonstrating method overloading.
public class Overload {
	void ovlDemo(){
		System.out.println("No parameters");
	}
	
	void ovlDemo(int i){
		System.out.println("One parameter" + i);
	}
	
	void ovlDemo(int i, int j) {
		System.out.println("Two parameters" + i + " " + j);
	}
	
	void ovlDemo(double a, double b) {
		System.out.println("Two double parameters " + a + " " + b);
	}
}
