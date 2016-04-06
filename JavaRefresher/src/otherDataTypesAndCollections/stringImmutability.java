package otherDataTypesAndCollections;

public class stringImmutability {

	public static void main(String[] args) {
		String theImmutableString = "theImmutableString";
		
		theImmutableString = "catsPyjamas"; //Now pointing to the string object with the
											//character sequence of "catsPyjamas"
		
		StringBuffer aMutableString = new StringBuffer("aMutableString");
		
		aMutableString.append(" can change!");
		
		System.out.println("Contents of StringBuffer object: " + aMutableString);
		
		String aSubstringOfImmutableString = theImmutableString.substring(5,10);
		
		StringBuilder aStringBuilderObj = new StringBuilder("aStringBuilder");
		aStringBuilderObj.setCharAt(0, 'b');
		System.out.println(aStringBuilderObj);
		
		//Demonstrating immutability - taking the substring of a string does not alter the original string at all.
		System.out.println(aSubstringOfImmutableString);
		System.out.println(theImmutableString);
		
		
		
		
	}

}
