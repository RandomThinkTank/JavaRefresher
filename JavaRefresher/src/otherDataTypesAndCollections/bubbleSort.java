package otherDataTypesAndCollections;

import java.util.Random;

public class bubbleSort {

	public static void main(String[] args) {
		int nums [] = new int[100];
		int a, b, t, size;
		Random r = new Random();
		
		for(int i = 0; i < 100; i++) {
			nums[i] = r.nextInt(200) - 100;
		}
		
		size = 100;
		
		System.out.print("Original array is:");
		for(int i = 0; i < size; i++){
			System.out.print(" " + nums[i]);
		}
		System.out.println();
		
		for(a=1; a < size; a++)
			for(b=size-1; b >=a; b--) {
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		
		System.out.print("Sorted array is:");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
		
	}

}
