package moreMethodsAndClasses;

public class PassOb {

	public static void main(String[] args) {
		Block block1 = new Block(2.0, 3.0, 4.0);
		Block block2 = new Block(3.0, 4.0, 5.0);
		Block block3 = new Block(2.0, 3.0, 4.0);
		
		System.out.println("Is block 1 the same as block 2? " + block1.sameBlock(block2));
		System.out.println("Is block 1 the same as block 3? " +block1.sameBlock(block3));
		System.out.println("Does block 1 have the same volume as block 3? " +block1.sameVolume(block3));
		

	}

}
