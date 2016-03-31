package basicOperatorsAndQuirks;

public class typePromotionRules {
	/*Checking out the type promotion rules java uses when multiple types are
	 * used in the same expression. Java will promote char, byte and short values to ints
	 * -> longs ->floats -> double.
	 * 
	 * This type promotion can lead to unexpected results. For example, the outcome of
	 * two byte values will be an int as shown below.
	 * 
	 */
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
		i = b * b; //No cast is needed in this case.
		
		b = (byte) (b * b);
		System.out.println("i and b: " + i + " " + b);
		

	}

}
