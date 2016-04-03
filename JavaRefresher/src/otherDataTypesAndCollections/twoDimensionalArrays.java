package otherDataTypesAndCollections;

public class twoDimensionalArrays {

	public static void main(String[] args) {
		int t, i;
		int table[] [] =  new int[4][3];
		
		for(t = 0; t < 4; ++t) {
			for(i = 0; i < 3; ++i) {
				table[t][i] =  (t*4)+i+1;
				System.out.print(table[t][i] + " ");
			}
		System.out.println();
		}

	}

}
