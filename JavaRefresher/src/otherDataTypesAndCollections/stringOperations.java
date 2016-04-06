package otherDataTypesAndCollections;

public class stringOperations {

	public static void main(String[] args) {
		String str1 = "Blah blah bloopy bloop";
		String str2 = new String(str1);
		String str3 = "Java Strings are powerful";
		
		System.out.println("Length of str1 "+str1.length());
		
		for(int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println();
		
		if(str1.equals(str2)){
			System.out.println("Str1 equals str2");
		}
		else
			System.out.println("Str1 does not equal str2");
		
		int result = str1.compareTo(str3);
		if(result == 0) {
			System.out.println("Str1 is equal to str3.");
		} else if(result > 0) {
			System.out.println("Str1 is greater than str3.");
		} else
			System.out.println("Str1 is less than str3.");
		
		
		str2 = "One two three One";
		
		int indxFirst = str2.indexOf("One");
		
		int indxLast = str2.lastIndexOf("One");
		
		System.out.println("The first occurance of 'One' happens at: "+indxFirst);
		System.out.println("The last occurance of 'One' happens at: " +indxLast);
		
		System.out.println(str2.charAt(indxFirst));
		System.out.println(str2.charAt(indxLast));
		}
		
	}

