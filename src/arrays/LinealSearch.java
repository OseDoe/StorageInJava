package arrays;

public class LinealSearch {

	public static void main(String[] args) {
		
		int[] x = OneDArrays.arr2;
		
		int obj = 6;
		for (int i=0; i<OneDArrays.arr2.length; i++) {
			System.out.println("Comparing " + x[i] + " with " + obj);
			if (x[i] == obj ) {
				System.out.print("Found " + obj);
				return;
			}
		}
		
	}

}
