package Generics;

public class Summation {
	private int sum;
	
	/*
	 * sums the values from 0 to the arg value for a type that extends Number.
	 */
	<T extends Number> Summation(T upTo){
		sum = 0;
		
		for(int i = 0;i < upTo.intValue();i++, sum+=i);
	}
	
	int getSum(){
		return sum;
	}
	
}
