package brightNetworkAmazonCoding;

public class checkGrid {

	static boolean gridChecker (int grid[][]) {
		if (grid == null) {
			return false;
		}
		else if (grid[0].length == grid.length) {
			return true;
		}
		else if(grid[0].length==9 && grid.length==9) {
			return true;
		}
		else {
			return false;
		}
	}
}
