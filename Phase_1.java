package brightNetworkAmazonCoding;

public class Phase_1 {

	public static void main (String[] args) {
		
	}
	static void routeFinder (int grid[][]) {
		int startingPointx = 0;
		int startingPointy = 0;
		int endPointx = 9;
		int endPointy = 9;
		if (checkGrid.gridChecker(grid)==true) {
			while(startingPointx!=endPointx && startingPointy!=endPointy) {
				if (direction.validDirection(grid, startingPointx, startingPointy, 3)==true) {
					startingPointx+=1;
					startingPointy+=1;
				}
				
			}
		}

	}
	

	

}
