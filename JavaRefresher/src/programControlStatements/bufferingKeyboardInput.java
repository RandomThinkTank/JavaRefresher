package programControlStatements;

import java.io.IOException;

public class bufferingKeyboardInput {
	/*Because System.in.read() is being used an IOException must be thrown.
	 * System.in is line buffered so unfortunately the line feed sequence will
	 * also be consumed by the input stream. These characters are left in the input
	 * stream until they are removed from the input stream.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		char ch, answer = 'K';
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
		
		ch = (char) System.in.read();
		
		if(ch == answer) System.out.println("*** Right ***");
		else System.out.println("...Sorry, your wrong.");
	}

}
