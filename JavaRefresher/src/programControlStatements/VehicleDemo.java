package programControlStatements;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 6;
		minivan.mpg = 16;
		minivan.fuelcap = 21;
		
		sportcar.passengers = 2;
		sportcar.mpg = 8;
		sportcar.fuelcap = 16;
		
		System.out.println("A minivan has " + minivan.passengers + " passenger spaces"
				+ " along with " + minivan.mpg +" miles to the galleon, with a "
				+ " a fuelcap of " +minivan.fuelcap);
		
		//objects are passed by reference, much like pointers in c++.
		minivan = sportcar;
		
		System.out.println("A minivan has " + minivan.passengers + " passenger spaces"
				+ " along with " + minivan.mpg +" miles to the galleon, with a "
				+ " a fuelcap of " +minivan.fuelcap);
	}

}
