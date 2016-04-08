package moreMethodsAndClasses;

public class Block {
	double a,b,c;
	double volume;
	
	public Block(double i, double j, double k) {
		// TODO Auto-generated constructor stub
		a = i;
		b = j;
		c = k;
		volume = a * b * c;
	}
	
	boolean sameBlock(Block aBlock) {
		if((aBlock.a == a) & (aBlock.b == b) & (aBlock.c == c)) return true;
		else return false;
	}
	
	boolean sameVolume(Block aBlock) {
		if(aBlock.volume == volume) return true;
		else return false;
	}
	
	
}
