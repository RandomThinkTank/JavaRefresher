package programControlStatements;

public class VehicleDemo {

	public static void main(String[] args) {
		int range1, range2, distanceInMiles;
		double dist1, dist2;
		
		Vehicle minivan = new Vehicle(6,16,21);
		Vehicle sportcar = new Vehicle(2,8,16);
		distanceInMiles = 252;
		
		range1 = minivan.range();
		range2 = sportcar.range();
		
		dist1 = minivan.fuelneeded(252);
		dist2 = sportcar.fuelneeded(252);
		
		System.out.print("Minivan can carry "+ minivan.passengers +". ");
		System.out.println("The range of a minivan is " + range1 + " miles.");
		System.out.println(" To go " + distanceInMiles + " miles, the minivan needs " + dist1 +" gallons.");
		
		System.out.println();
		
		System.out.print("A sportscar can carry "+sportcar.passengers+". ");
		System.out.println("The range of a sportscar is " + range2 + " miles.");
		System.out.println(" To go " + distanceInMiles + " miles, the sportscar needs " + dist2 +" gallons.");
	}

}
