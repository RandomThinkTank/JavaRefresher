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
}
