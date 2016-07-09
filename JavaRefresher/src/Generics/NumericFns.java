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
}
