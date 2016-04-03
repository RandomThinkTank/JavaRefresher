package otherDataTypesAndCollections;

import java.io.IOException;
import java.util.Random;

public class searchForElement {

	public static void main(String[] args) throws IOException {
		int nums2[]  = new int[1000];
		Random r = new Random();
		int guess;
		boolean bingo;
		bingo = false;
		
		for(int i = 0; i < nums2.length; i++) {
			nums2[i] = r.nextInt(200)-100;
		}
		
		System.out.println("Take a guess at a number in the array.\n");
		guess = (char) System.in.read();
		do{
			guess(guess, nums2, bingo);
		}while(bingo);
		
	}
	
	public static void guess(int guess, int[] nums2, boolean bingo) throws IOException{
			char ignore;
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
			for(int i:nums2) {
				if(i == guess) {
					bingo = true;
					System.out.println("Woo well done! It was the " + i +"th index.");
					break;
				}
			}
		
	}

}
