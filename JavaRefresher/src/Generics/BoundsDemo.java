package Generics;

public class BoundsDemo {
	
	public static void main(String args[]){
	
	NumericFns<Integer> iOb =  new NumericFns<Integer>(5);
	
		System.out.println("Reciprocal is: " + iOb.reciprocal());
		System.out.println("Fractional is: " + iOb.fraction());
		
	NumericFns<Double> dOb = new NumericFns<Double>(789.332);
	
		System.out.println("Reciprocal is: " + dOb.reciprocal());
		System.out.println("Fractional is: " + dOb.fraction());
	}
	
}
