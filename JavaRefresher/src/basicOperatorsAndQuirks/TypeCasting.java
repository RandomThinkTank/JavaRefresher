package basicOperatorsAndQuirks;

public class TypeCasting {
	/*Casting to various different types in Java, seems to be two different rules for this.
	 * 
	 * A and B must be of compatible types e.g a boolean and int are not compatible.
	 * The destination type is larger than the source type e.g int -> double.
	 * 
	 * A widening conversion occurs when casting to a larger type e.g byte to int.
	 * 
	 * Narrowing conversion occurs through explicitly casting from one type to another using
	 * myInt = (int) myDouble. However information may be lost in this process. 
	 */
	public static void main(String[] args) {
		long l;
		double d;
		
		d = 908098907879.0;
		//l = d; this is an illegal operation since there is no widening conversion from double to long.
		
		l = 90809L;
		d = l;
		System.out.println("d and l are: d:" + d + " l:" + l);
		//this will resolve.
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 11.0;
		y = 4.0;
		
		i = (int) (x/y); //cast from double to int
		System.out.println("Int outcome of x/y: "+i);
		//Note the lack of precision here.
		
		i = 100;
		b = (byte) i; //cast conversion from integer to byte.  Should'nt lose information here.
		System.out.println("Byte value of b: " + b);
		
		
		i = 257;
		b = (byte) i; //should lose information here since bytes cannot hold a value of 257.
		System.out.println("Byte value of b: " + b);
		
		b = 90; //ASCII code for Z
		ch = (char) b;
		System.out.println("ch: " + ch); 
		//Allow casting between incompatible types of bytes and chars.
		

	}

}
