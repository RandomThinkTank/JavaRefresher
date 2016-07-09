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
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED; //initialise to red.
		thrd = new Thread(this);
		thrd.start();
	}

	@Override
	public void run() {
		while(!stop){
			try{
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000);
				break;
				case YELLOW:
					Thread.sleep(2000);
				break;
				case RED:
					Thread.sleep(12000);
				break;
				}
			}catch(InterruptedException ex){
				System.out.println("Thread " + thrd.getName() + " had an exception");
				ex.printStackTrace();
			}
			changeColor();
		}
		
	}

	private void changeColor() {
		switch(tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
			break;
		}
		
		changed = true;
		notify(); //signal that light has changed.
	}
	
	/*This method won't return until changedColor calls notify.
	 * Basically when the light ends up changing state.
	 * 
	 */
	synchronized void waitForChange(){
		try{
			while(!changed)
				wait();
			changed = false;
		} catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
	
	
	synchronized TrafficLightColor getColor() {
		return tlc;	
	}
	
	synchronized void cancel(){
		stop = true;
	}

}

