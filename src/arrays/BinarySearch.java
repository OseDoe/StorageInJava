package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// In the binary search, we need to have a sorted array
		// Once is sorted, we will have to divide the array in half n times
		// Discarding the half that doesn't include the objective
		
		int[] x = WaysOfCreatingAnArray.arr3; // { 1, 2, 3, 4, 5 }
		
		// We'll need to declare a low, mid and high index
		int lowIndex = 0;
		int highIndex = x.length - 1; // index x[4]
		int midIndex; // The middle of an array is: low + (high - low) / 2
		int obj = 4;
		int result = 0;
		
		while (lowIndex <= highIndex) {
			midIndex = lowIndex + (highIndex - lowIndex) / 2;
			if (obj > x[midIndex]) {
				lowIndex = midIndex + 1;
			} else if (obj < x[midIndex]) {
				highIndex = midIndex + 1;
			} else {
				result = midIndex;
				break;
			}
		}
		
		if (lowIndex > highIndex) System.out.println(obj + " not found.");
		else System.out.print(obj + " found in index " + result);
		
		
	}

}
