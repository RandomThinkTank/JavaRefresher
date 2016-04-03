package otherDataTypesAndCollections.Queues;
/*
 * Java implementation of a Queue data structure.
 * 
 */
public class Queue {
	char q[];
	int putloc, getloc;
	
	Queue(int size) {
		q = new char[size]; //allow a new 'queue' of any size to be instantiated through a constructor.
		putloc = getloc = 0; //Initialization of the indices used.
	}
	
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println("*** Queue is full ***");
			return;
		}
		
		q[putloc++] = ch;
	}
	
	char get() {
		if(getloc == putloc) {
			System.out.println("*** Queue is empty ***");
			return (char) 0;
		}
		return q[getloc++];
		
	}
}

