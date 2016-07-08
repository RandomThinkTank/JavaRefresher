package enumerations;

/*
 * Taking a look at enumerations and their constants. Paticularly emphasising
 * that enum constants are objects of the enum type and as such can have a constructor, methods etc.
 */

enum Elements{
	EARTH("Falls"), FIRE("Burns"),WIND("Blows"), WATER("Falls");
	
	private String action;
	Elements(String action){
		this.action = action;
	}
	
	String getAction(){return action;}
}

public class enumDemo {
	public static void main(String args[]){
	Elements el;
	
		for(Elements e: Elements.values()){
			System.out.println(e + " " + e.getAction());
		}
	}
}
