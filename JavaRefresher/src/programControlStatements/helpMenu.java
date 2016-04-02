package programControlStatements;

import java.io.IOException;

public class helpMenu {
	/*
	 * An improved version of the help system developed previously.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		char choice, ignore;
		
		for(;;){
			do {
				System.out.println("Help on");
				System.out.println("  1. if");
				System.out.println("  2.switch");
				System.out.println("  3.for");
				System.out.println("  4.while");
				System.out.println("  5.do-while");
				System.out.println("  6.break");
				System.out.println("  7.continue\n");
				System.out.println("Choose one (q to quit): ");
				
				choice = (char)System.in.read();
				
				do{
					ignore = (char) System.in.read();
				} while(ignore != '\n');
				
			} while(choice < '1' | choice > '7' & choice !='q');
			
		System.out.println("\n");
		if(choice == 'q') break;	
		
		switch(choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println("  case constant:");
			System.out.println("  break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
		case '3':
			System.out.println("The for loop:\n");
			System.out.println("for(initialisation; condition; iteration) {");
			System.out.println("statements");
			System.out.println("}");
			break;
		case '4':
			System.out.println("The while loop:\n");
			System.out.println("while(conditional) {");
			System.out.println("statements");
			System.out.println("}");
			break;
		case '5':
			System.out.println("The do while loop\n");
			System.out.println("do {");
			System.out.println("statements");
			System.out.println("} while (condition)");
			break;
		case '6':
			System.out.println("The break statement\n");
			System.out.println("break; or break label;");
			break;
		case '7':
			System.out.println("The continue statement\n");
			System.out.println("continue; or continue label;");
			break;
		default:
			System.out.println("no dice. We'll never hit this :P");
			break;
		}
		}
	}
}
