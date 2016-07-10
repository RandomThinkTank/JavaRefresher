package Generics;

public class WildcardDemo {

	public static void main(String[] args) {
		
		NumericFns<Integer> iOb =  new NumericFns<Integer>(4);
		NumericFns<Float> fOb = new NumericFns<Float>(789.89f);
		NumericFns<Long> lOb = new NumericFns<Long>(4L);
		
		printComparison(iOb, fOb);
		printComparison(fOb, lOb);
		printComparison(iOb, lOb);
		
	}
	
	private static void printComparison(NumericFns<?> ob1, NumericFns<?>ob2){
		
		System.out.println("Do the two objects have the same value? " + ob1.absEquals(ob2));
	}
}
