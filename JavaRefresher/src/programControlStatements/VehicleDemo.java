package programControlStatements;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		minivan.passengers = 6;
		minivan.mpg = 16;
		minivan.fuelcap = 21;
		
		sportcar.passengers = 2;
		sportcar.mpg = 8;
		sportcar.fuelcap = 16;
		
		System.out.print("Minivan can carry "+ minivan.passengers +". ");
		minivan.range();
		
		System.out.print("A sportscar can carry "+sportcar.passengers+". ");
		sportcar.range();
	}

}
