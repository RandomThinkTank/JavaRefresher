package enumerations;

/*
 *Demo demonstrating state changes using enumerations on their own
 *thread. 
 */

public class TrafficLightDemo {

	public static void main(String[] args) {
		TrafficLightSimulator tf1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i = 0; i < 8; i++){
			System.out.println(tf1.getColor());
			tf1.waitForChange();
		}
		//Stop the thread after iterating through the colors.
		tf1.cancel();
	}

}
