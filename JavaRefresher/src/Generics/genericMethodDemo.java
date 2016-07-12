package Generics;

public class genericMethodDemo {
	/*
	 * Method takes two arrays of the same type to see if the elements they contain
	 * the same.
	 * 
	 * returns true if the elements match.
	 */
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
		//Check the lengths first.
		if(x.length != y.length) return false;
		
		//Then check each element.
		for(int i = 0; i < x.length; i++){
			if(!x[i].equals(y[i])) return false;
		}
		return true;
		
	}
	
	public static void main(String args[]){
		Integer nums[] = {1,2,3,4,5,6};
		Integer nums2[] = {1,2,3,4,5,6};
		Integer nums3[] = {1,2,3,4,5,5};
		Integer nums4[] = {1,2,2,3,4,5};
		
		if(arraysEqual(nums, nums))
			System.out.println("nums equals nums");
		
		if(arraysEqual(nums,nums2))
			System.out.println("nums1 equals nums2");
		
		if(arraysEqual(nums2,nums3))
			System.out.println("nums2 equals nums3");
	}
}
