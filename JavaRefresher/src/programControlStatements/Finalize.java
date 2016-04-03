package programControlStatements;

public class Finalize {

	public static void main(String[] args) {
		FinalizeDemo fd = new FinalizeDemo(0);
		
		for(int i = 0; i < 10000000; i++) {
			fd.generator(i);
		}
	}

}
