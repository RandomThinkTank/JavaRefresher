package programControlStatements;

public class FinalizeDemo {

		int iterationNo;
		
		FinalizeDemo(int i){
			iterationNo = i;
		}
		
		protected void finalize(){
			System.out.println("Finalizing " + iterationNo);
		}
		
		//Generate some new objects.
		void generator(int i) {
			FinalizeDemo demo = new FinalizeDemo(i);
		}
}
