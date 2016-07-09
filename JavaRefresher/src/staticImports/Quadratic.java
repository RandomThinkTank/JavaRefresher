package staticImports;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import static java.lang.System.*; //redundant but using it just to demo.

public class Quadratic {

	public static void main(String[] args) {
		// a,b,c represent the coefficients in a quadratic equation.
		
		double a, b, c, x;
		
		//Assign coefficients
		a = 4;
		b = 1;
		c = -3;
		
		//equation is in the form ax squared + bx + c with two separate solutions.
		//Because sqrt and pow are static methods they must be called through the
		//use of the class name - Math.
		
		x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) /(2 * a);
		System.out.println(x);
		
		x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) /(2 * a);
		System.out.println(x);
		
		//Using the static import the above equations can be shortened alittle.
		
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) /(2 * a);
		out.println(x);
		
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) /(2 * a);
		out.println(x);
		
	}

}
