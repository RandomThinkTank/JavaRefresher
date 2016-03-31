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
		
		char ch1 = 'A', ch2 = '!';
		i = (ch1 + ch2);
		ch1 = (char) (ch1 + ch2);
		
		System.out.print("A + ! as an integer value is: " + i +"\n");
		System.out.println("A + !: " + ch1 + "\n");
		
		//A cast to a double can be used to get fractional components from
		//a integer division. Enabling a better precision from these operations.
		
		for(int j = 0; j < 5; j++){
			
			System.out.print(j + "/3: "+j/3 + "\n");
			System.out.print(j + "/3 with fractions :"+ (double)j/3);
			System.out.println();
			
		}
	}

}
