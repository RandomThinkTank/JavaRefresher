package Generics;

public class TwoGenDemo {

	public static void main(String[] args) {
		
		TwoGen<Integer,String> tgObj = new TwoGen<Integer, String>(100,"Generics");
		
		tgObj.showTypes();
		
		int v = tgObj.getOb1();
		System.out.println("Value of v: " + v);
		
		String t = tgObj.getOb2();
		System.out.println("Value of t: " + t);
		
	}

}
