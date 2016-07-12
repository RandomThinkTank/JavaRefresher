package LambdaExpressions;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		
		NumericFunc nf;
		
		nf = (n) -> {
			int result = 1;
			
			n = n < 0 ? -n : n;
			
			for(int i = 2; i < n/i;i++){
				if((n%i) == 0){
					result = i;
					break;
				}
			}
			return result;
		};
		
		System.out.println("Smallest factor of 12 is " +nf.fun(12));
		System.out.println("Smallest factor of 33 is " +nf.fun(33));
		System.out.println("Smallest factor of 45 is " +nf.fun(45));
	}

}
