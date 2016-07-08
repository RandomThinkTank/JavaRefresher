package enumerations;

import java.io.PrintWriter;

/*
 * Having a look at some methods that enumerations derive from their superclass
 * Enum.
 */
public class EnumDemo2{
	public static void main(String args[]){
		PrintWriter pw = new PrintWriter(System.out);
		elements el, water;
		
		for(elements e: elements.values()){
			pw.println(e + "'s ordinality is " + e.ordinal());
		}
		
		
		el = elements.EARTH;
		water = elements.WATER;
		pw.println();
		
		if(el.compareTo(water) < 0 ){
			pw.println(el + " comes before "+water);
		}
		else if(el.compareTo(water) == 0){
			pw.println(el + " is at the same position as " +water);
		}
		else
			pw.println(el + " is at a greater position than " +water);
	}
}
