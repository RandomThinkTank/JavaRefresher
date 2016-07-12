package LambdaExpressions;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		//Determine if one string is a part of another.
		StringTest test;
		
		test = (str1,str2) -> str1.indexOf(str2) != -1;
		
		String str1 = "This is a test string";
		String str2 = "test";
		
		if(test.test(str1, str2)) {
			System.out.println("'" + str1 +"'"+ " is a part of '" +str2 + "'");
		} else {
			System.out.println("'" + str2 +"'"+ " is a part of '" +str1 + "'");
		}
		
		if(test.test(str2, str1)) {
			System.out.println("'" + str2 +"'"+ " is a part of '" +str1 + "'");
		} else {
			System.out.println("'" + str2 +"'"+ " is not a part of '" +str1 + "'");
		}
	
	}
}
