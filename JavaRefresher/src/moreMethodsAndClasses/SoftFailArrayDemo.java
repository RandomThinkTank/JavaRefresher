package moreMethodsAndClasses;

public class SoftFailArrayDemo {

	public static void main(String[] args) {
		softFailArray sfa = new softFailArray(78, -1);
		int x;
		
		System.out.println("Test the soft fail system");
		for(int i = 0; i < (sfa.length *2); i++) {
			sfa.put(i, i * 10);
		}
		
		for(int i = 0; i < (sfa.length * 2); i++) {
			x = sfa.get(i);
			
			if(x != -1) System.out.print(x +" ");
		}
		System.out.println("");
		
		System.out.println("\nFail with error reports.");
		for(int i = 0; i < (sfa.length * 2); i++) {
			if(!sfa.put(i, i*10))
				System.out.println("Index " + i + "out-of-bounds");
		}
	}

}
