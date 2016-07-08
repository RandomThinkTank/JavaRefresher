package enumerations;

/*
 * Taking a look at enumerations and their constants. Paticularly emphasising
 * that enum constants are objects of the enum type and as such can have a constructor, methods etc.
 */

public class enumDemo {
	public static void main(String args[]){
	elements el;
	
		for(elements e: elements.values()){
			System.out.println(e + " " + e.getAction());
		}
	}
}
