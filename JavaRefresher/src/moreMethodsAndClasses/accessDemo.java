package moreMethodsAndClasses;

public class accessDemo {

	public static void main(String[] args) {
		accessModifiers am = new accessModifiers();
		
		/*access to data members of am is only allowed
		 * through its accessor methods.
		 */
		
		am.setAlpha(-77);
		System.out.println("am.setAlpha is " +am.getAlpha());
		
		//public data members of am can be accessed using dot notation
		am.beta = 100;
		System.out.println("am.beta is " +am.beta);
		
		am.gamma = 200;
		System.out.println("am.gamma is " +am.gamma);

	}

}
