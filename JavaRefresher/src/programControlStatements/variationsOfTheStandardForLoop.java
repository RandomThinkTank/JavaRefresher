package programControlStatements;

import java.io.IOException;

public class variationsOfTheStandardForLoop {
	/*Having a look at some of the more quirky variations of the standard for loop.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		int i,j;
		//using two seperate control variables. Will stop at 5/5
		for(i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i and j: " + i + " " + j);
		}
		
		//using a seperate control condition outside of the control variables. Can be any
		//valid boolean expression.
		System.out.println("Press 's' to stop");
		for(i = 0; (char) System.in.read() != 's'; i++){
			System.out.println("Pass #"+ i);
		}
	}

}
