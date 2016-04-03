package otherDataTypesAndCollections.Queues;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue alphabetQueue = new Queue(26);
		char letter = 'a';
		char ch;
		
		for(int i = 0; i < 26; i++) {
			alphabetQueue.put(letter++);
		}
		
		System.out.println("Contents of the alphabet queue.");
		
		for(int i = 0; i < 26; i++) {
			ch = alphabetQueue.get();
			System.out.print(ch + " ");
		}

	}

}
