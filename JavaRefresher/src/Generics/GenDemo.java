package Generics;
/*
 * Small demo of implementing Generics. Nothing too interesting except the Autoboxing of the types.
 */
public class GenDemo {

	public static void main(String[] args) {
		//Create a gen object for Integers.
		simpleGenericExample<Integer> iOb;
		
		//The object here is of type simpleGenericExample<Integer> not just the usual class type.
		iOb = new simpleGenericExample<Integer>(88);
		
		iOb.showType();
		
		//Doesnt seem to need a cast at this point..made a note to look into this further.
		int v = iOb.getOb();
		System.out.println("value: " + v);
		
		System.out.println();
		
		simpleGenericExample<String> sOb;
		
		sOb = new simpleGenericExample<String>("Generics Test");
		
		sOb.showType();
		
		String str = sOb.getOb();
		System.out.println("value " + str);
		
	}

}
