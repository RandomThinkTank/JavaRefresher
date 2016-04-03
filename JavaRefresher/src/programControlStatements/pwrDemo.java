package programControlStatements; 

public class pwrDemo {

	public static void main(String[] args) {
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr w = new Pwr(5.7, 0);
		
		System.out.println(x.b + " raised to the power of " + x.e + " power is " +x.get_pwr());
		System.out.println(y.b + " raised to the power of " + y.e + " power is " +y.get_pwr());
		System.out.println(w.b + " raised to the power of " + w.e + " power is " +w.get_pwr());
	}

}
