package programControlStatements;

import java.io.IOException;

public class variationsOnTheWhileLoop {
	/*Having a look at some of the variations of the while loop syntax.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		char ch;
		ch = 'a';
		while(ch <= 'z') {
			System.out.println(ch);
			ch ++;
		}
		
		//Compute powers of 2.
		int e, result;
		for(int i = 0; i < 10; i++){
			result = 1;
			e = i;
			while(e > 0) {
				result *= 2;
				e--;
			}
			
			System.out.println("2 to the " + i + "th power is " + result );
		}
	
	//do-while
	do {
		System.out.println("Press a key followed by ENTER: ");
		ch = (char) System.in.read();
	}while(ch != 'q');
	}

}
