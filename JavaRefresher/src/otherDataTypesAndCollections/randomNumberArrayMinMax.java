package otherDataTypesAndCollections;

import java.util.Random;

public class randomNumberArrayMinMax {

	public static void main(String[] args) {
		int sample[] = new int[100];
		int lowerBound = -100;
		int upperBound = 100;
		int min = 0;
		int max = 0;
		Random r = new Random();
		
		for(int i = 0; i < 100; i++) {
			sample[i] = r.nextInt(upperBound - lowerBound) + lowerBound;
			System.out.println("This is sample["+ i +"]: "+sample[i]);
		}
		
		for(int i = 0; i < 100; i++) {
			if(sample[i] < min) min = sample[i];
			if(sample[i] > max) max = sample[i];
		}
		
		System.out.println("The minimum is: "+min);
		System.out.println("The minimum is: "+max);

	}

}
