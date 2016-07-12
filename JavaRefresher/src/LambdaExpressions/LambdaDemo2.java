package LambdaExpressions;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isFactor = (n,d) -> (n % d) == 0;
		
		if(isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();
		
		NumericTest lessThan = (n,m) -> (n < m);
		
		if(lessThan.test(1, 2)){
			System.out.println("1 is less than 2... who woulda thunk it.");
		if(!lessThan.test(789, 32)){
			System.out.println("789 is not less than 32");
		}
		System.out.println();
		
		NumericTest absValue = (n,m) -> (n < 0 ? -n :n) == (m < 0 ? -m : m);
		
		if(absValue.test(4, -4))
			System.out.println("Absolute values of 4 and -4 are equal.");
		if(!absValue.test(3, -4))
			System.out.println("Absolute values of 3 and -4 are not equal.");
		}
	}

}
