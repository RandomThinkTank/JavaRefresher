package LambdaExpressions;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isFactor = (n,d) -> (n % d) == 0;
		
		if(isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();

	}

}
