package LambdaExpressions;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		
		NumericTest myTest;
		
		myTest = (n,d) -> (n % d) == 0;
		
		if(myTest.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!myTest.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();
		
		myTest = (n,m) -> (n < m);
		
		if(myTest.test(1, 2)){
			System.out.println("1 is less than 2... who woulda thunk it.");
		if(!myTest.test(789, 32)){
			System.out.println("789 is not less than 32");
		}
		System.out.println();
		
		myTest = (n,m) -> (n < 0 ? -n :n) == (m < 0 ? -m : m);
		
		if(myTest.test(4, -4))
			System.out.println("Absolute values of 4 and -4 are equal.");
		if(!myTest.test(3, -4))
			System.out.println("Absolute values of 3 and -4 are not equal.");
		}
	}

}
