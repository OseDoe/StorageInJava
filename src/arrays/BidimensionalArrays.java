package arrays;

public class BidimensionalArrays {

	// 3 ways of creating a bidimensional array
	// 1
	int[][] biArr = {
			{1, 2, 3},
			{4, 5, 6}
	};
	// 2
	// int[][] arr = new int[x][y]
	// where x = rows and y = columns/length of each row-array
	int[][] biArr2 = new int[3][3];
	// this one for example will create:
	/*
	 * {
	 * 	{0, 0, 0},
	 *  {0, 0, 0},
	 *  {0, 0, 0}
	 *  };
	 */
	
	// 3
	int[][] biArr3 = new int[][] {{1, 2, 3},
							   	  {4, 5, 6},
							   	  {7, 8, 9}};
	
}
