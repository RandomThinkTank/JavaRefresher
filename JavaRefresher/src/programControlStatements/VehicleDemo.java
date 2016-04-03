package programControlStatements;

public class VehicleDemo {

	public static void main(String[] args) {
		int range1, range2;
		
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		minivan.passengers = 6;
		minivan.mpg = 16;
		minivan.fuelcap = 21;
		
		sportcar.passengers = 2;
		sportcar.mpg = 8;
		sportcar.fuelcap = 16;
		
		range1 = minivan.range();
		range2 = sportcar.range();
		
		System.out.print("Minivan can carry "+ minivan.passengers +". ");
		System.out.print("The range of a minivan is " + range1 + " miles.\n");
		
		System.out.print("A sportscar can carry "+sportcar.passengers+". ");
		System.out.print("The range of a sportscar is " + range2 + " miles.");
	}

}
