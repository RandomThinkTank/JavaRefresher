package programControlStatements;

public class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	int range() {
		return fuelcap * mpg;
	}
}
