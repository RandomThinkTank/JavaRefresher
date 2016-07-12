package LambdaExpressions;

public class LambdaDemo {
	
	public static void main(String args[]){
	MyValue myVal;
	
	/*When this constant is assigned to myVal a class instance is
	 * constructed in which the lambda expression implements
	 * the getValue() method in myValue.
	 */
	myVal = () -> 98.6;
	
	System.out.println("A constant value: "+myVal.getValue());
	
	MyParamValue myPval = (n) -> 1.0/n;
	
	System.out.println("Reciprocal of 4 is " +myPval.getValue(4.0));
	System.out.println("Reciprocal of 8 is " +myPval.getValue(8.0));
	
	
	}
}
