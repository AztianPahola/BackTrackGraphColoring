package Default;

public class GraphColoring {
	// Below is an example border matrix. initializing one goes as follows:
	/*
	 * 1. Create a 2D array of size n x n-1, where n = number of regions 
	 * 2. Initialize all values to 0 (Java technically does this automatically)
	 * 3. Add the values of the bordering regions in ascending order, using the row
	 *    number+1 to represent a given region. e.g. region 1 borders region 3, 4, and
	 *    2 so insert 2, 3, 4 into row 0
	 */
	static int[][] borderMatrix = { { 2, 3, 4, 0 }, 
									{ 1, 3, 5, 0 }, 
									{ 1, 2, 4, 5 }, 
									{ 1, 3, 5, 0 }, 
									{ 2, 3, 4, 0 } };
	static int numColors = 3;
	static int numRegions = borderMatrix.length;
	static int[] colors = new int[numRegions];

	public static void main(String[] args) {
		System.out.println("Possible color combinations are (if blank there are none):");
		colorMap(0);
	}

	private static void colorMap(int index) {

		int color;

		if (index == numRegions) {
			for (int x : colors) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
				for (color = 1; color <= numColors; color++) {
					colors[index] = color;
					if (isPromising(index)) {
						colorMap(index + 1);
					}
				}
			
		}

	}

	private static boolean isPromising(int i) {
		int j = 0;
		boolean promising = true;
		boolean exitFlag = false;

		while (j < i && !exitFlag) {
			// If the bordering region has yet to be colored, or we are out of bordering regions, exit
			if (borderMatrix[i][j] > i || borderMatrix[i][j] == 0) {
				exitFlag = true;
			} else {
				// Index for a region is it's value in the matrix - 1, e.g. region 1 is index 0
				int borderingRegionIndex = borderMatrix[i][j] - 1;
				if (colors[borderingRegionIndex] == colors[i]) {
					promising = false;
					exitFlag = true;
				}
			}
			j++;
		}
		return promising;
	}

}
