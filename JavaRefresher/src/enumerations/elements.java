package enumerations;

enum elements{
	EARTH("Falls"), FIRE("Burns"),WIND("Blows"), WATER("Falls");
	
	private String action;
	elements(String action){
		this.action = action;
	}
	
	String getAction(){return action;}
}