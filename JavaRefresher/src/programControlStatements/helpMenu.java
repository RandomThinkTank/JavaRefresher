package programControlStatements;

import java.io.IOException;

public class helpMenu {
	/*
	 * An improved version of the help system developed previously.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		char choice, ignore;
		help menu = new help();
		for(;;){
			do {
				menu.showMenu();
				
				choice = (char)System.in.read();
				
				do{
					ignore = (char) System.in.read();
				} while(ignore != '\n');
				
			} while(!menu.isValid(choice));
			
		System.out.println("\n");
		
		
		if(choice == 'q') break;	
		System.out.println(choice);
		menu.helpOn(choice);
		}
	}
}
