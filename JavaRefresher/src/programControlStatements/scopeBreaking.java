package programControlStatements;

public class scopeBreaking {
	/*
	 * Looking at using break statements to exit nested scopes.
	 * 
	 */
	public static void main(String[] args) {
		
		for(int i=0; i <= 3; i++) {
			System.out.println("Outer loop: "+i);
			System.out.print("Inner loop: ");
			
			int t = 0;
			while(t < 100) {
				if(t == 10) break;
				System.out.print(t + " ");
				t++;
			}
		System.out.println();
		}
		System.out.println("Loops complete");

	}

}
