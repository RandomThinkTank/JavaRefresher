package enumerations;

public class TrafficLightSimulator implements Runnable {
	
	private Thread thrd; 
	private TrafficLightColor tlc;
	boolean stop = false;
	boolean changed = false;
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	
	
	@Override
	public void run() {
		
		
	}

}

