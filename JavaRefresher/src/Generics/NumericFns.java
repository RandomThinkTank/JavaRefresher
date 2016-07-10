package Generics;

public class NumericFns<T extends Number> {
	T num;
	
	NumericFns(T num) {
		this.num = num;
	}

	//Return the reciprocal
	double reciprocal() {
		return 1/num.doubleValue();
	}
	
	//return the fractional components.
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	
	boolean absEquals(NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) 
			return true;
		else 
			return false;
	}
}
