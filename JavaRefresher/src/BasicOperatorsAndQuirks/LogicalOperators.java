package BasicOperatorsAndQuirks;

public class LogicalOperators {
	/*A small refresher on logical operators. Really more to test out
	 * using github as a versioning system instead of SVN.
	 */
	public static void main(String[] args) {
		boolean x, y;
		
		System.out.println("X\tY\tAND\tOR\tXOR\tNOT");
		
		x = true;
		y = true;
		System.out.print(x + "\t" + y + "\t");
		System.out.print((x&y) + "\t" + (x|y) + "\t");
		System.out.println((x ^ y) + "\t" + (!x));
		
		y = false;
		System.out.print(x + "\t" + y + "\t");
		System.out.print((x&y) + "\t" + (x|y) + "\t");
		System.out.println((x ^ y) + "\t" + (!x));
		
		y = true;
		x = false;
		System.out.print(x + "\t" + y + "\t");
		System.out.print((x&y) + "\t" + (x|y) + "\t");
		System.out.println((x ^ y) + "\t" + (!x));
		
		y = false;
		System.out.print(x + "\t" + y + "\t");
		System.out.print((x&y) + "\t" + (x|y) + "\t");
		System.out.println((x ^ y) + "\t" + (!x));
		
		
	}

}
