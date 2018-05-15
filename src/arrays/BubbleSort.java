package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr4 = { 32, 65, 9, 90, 75, 39, 57, 18, 83};
		// For the Bubble sort algorith we need to store two vars
		// We'll need two vars for iteration
		int pass, i;
		// Now we'll need two for loops:
		// The first one will have a condition of arr.length-2
		for (pass=0; pass <= arr4.length-2; pass++) {
			// The second one, arr.length-pass-2
			for (i=0; i <=arr4.length-pass-2; i++) {
				// Now, we swap the two elements
				if (arr4[i] > arr4[i+1]) {
					int temp = arr4[i];
					arr4[i] = arr4[i+1];
					arr4[i+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr4));

	}

}
