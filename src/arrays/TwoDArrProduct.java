package arrays;

public class TwoDArrProduct {

	public static void main(String[] args) {
		
		int[][] a = {
				{10, 30},
				{20, 40}
		};
		int[][] b = {
				{5},
				{7}
		};
		
		// To multiply two matrices, we need a few steps
		// 1. We need three for loops
		// So we set up the counters
		int i, j, k, m, n;
		// Now we store the length of matrix column and row
		int rowsA = a.length; // 2
		int colsA = a[0].length; // 2
		@SuppressWarnings("unused")
		int rowsB = b.length; // 2
		int colsB = b[0].length; // 1
		// We create the result matrix with the right length
		int[][] result = new int[rowsA][colsB];
		// Start with the three nested loops that will go through RowsA,ColsB,ColsA
		for (i=0; i<rowsA; i++ ) {
			for (j=0; j<colsB; j++) {
				for (k=0; k<colsA; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Multiplying these two matrices equals: ");
		for (m=0; m<result.length; m++) {
			for (n=0; n<result[0].length; n++) {
				System.out.print(result[m][n] + " ");
			}
			System.out.println();
		}
		
	}

}
