package Default;

public class GraphColoring {
	// Below is an example border matrix. initializing one goes as follows:
	/* 1. Create a 2D array of size n x n-1, where n = number of regions
	 * 2. Initialize all values to 0 (Java technically does this automatically)
	 * 3. Add the values of the bordering regions in ascending order, using the
	 * 	  row number+1 to represent a given region. e.g. region 1 borders region 3, 4, and 2
	 *    so insert 2, 3, 4 into row 0
	 */
	int[][] borderMatrix = 	{
							 {2,3,4,0},
							 {1,3,5,0},
							 {1,2,4,5},
							 {1,3,5,0},
							 {2,3,4,0}
							 };
	int numColors = 3;
	int numRegions = borderMatrix.length;
	int[] colors;
	
	public static void main(String[] args) {
		
	}
	
	private int[] colorMap(int index){
		
		int color;
		
		if (isPromising(index)){
			if(index == numRegions)
				for (int x : colors){
					System.out.print(x + " ");
				}
			else {
				for(color = 1;color <= numColors;color++) {
					colors[index] = color;
					colorMap(index+1);
				}
			}
		}
		
		
		
		
	}
	
	private boolean isPromising(int i) {
		
	}

}
