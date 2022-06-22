package brightNetworkAmazonCoding;

public class direction {

	static boolean validDirection(int grid[][], int a, int b, int random) {
		while(random==1) {
			if (b<grid[1].length && grid[a+1][b]==0){
				return true;
			}
		}
		
		while(random==2) {
			if (b<grid.length && grid[a][b+1]==0){
				return true;
			}
		}
		while(random==3) {
			if (b<grid.length && a<grid.length && grid[a+1][b+1]==0 ) {
				return true;
			}
		}
		while(random==4) {
			if (a>0 && b>0 && grid[a-1][b-1]==0){
				return true;
			}
		}
		while(random==5) {
			if (a>0 && grid[a-1][b]==0){
				return true;
			}
		}
		while(random==6) {
			if (b>0 && grid[a][b-1]==0){
				return true;
			}
		}
		return false;

		
		
		
	}
}
