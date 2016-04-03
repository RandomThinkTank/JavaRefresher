package otherDataTypesAndCollections;

public class copyingArrays {

	public static void main(String[] args) {
		int nums1[] = new int[10];
		int nums2[] = new int[10];
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = i+1;
		}
		
		System.out.print("Elements of the object referenced by num1: ");
		for(int i = 0; i < 10;i++) {
			System.out.print(nums1[i] + " ");
		}
		
		nums2 = nums1;
		System.out.println();
		System.out.print("Elements of the object referenced by num2: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(nums2[i] + " ");
		}
		
		nums2[3] = 999;
		
		System.out.println();
		System.out.print("Elements of the object referenced by num2: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(nums2[i] + " ");
		}
		
	}
}
