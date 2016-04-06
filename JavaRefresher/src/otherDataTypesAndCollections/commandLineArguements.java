package otherDataTypesAndCollections;

public class commandLineArguements {
	/*Takes in arguements passed from the command line to the main method. Looks up a 2D
	 * array of phone numbers for a paticular name.
	 */
	public static void main(String[] args) {
		String numbers [] [] = {
				{"Tom", "123456789"},
				{"Susan", "777-888"},
				{"Pam", "888-0000"}
		};
		int i;
		if(args.length != 1) {
			System.out.println("Usage: Java phone <name>");
		}
		else {
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			
			if(numbers.length == i) System.out.println("Sorry, number not found.");
				
			
		}
		
		

	}

}
