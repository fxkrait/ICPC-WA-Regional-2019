package problems;
import java.util.Arrays;
import java.util.Scanner;
public class W {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] grid;
		while(scan.hasNextLine()) {
			int n = Integer.parseInt(scan.nextLine());
			int val = -1;
			grid = new char[n][n];
			for(int i = 0; i < n; i++) {
				String line = scan.nextLine();
				grid[i] = line.toCharArray();
			}
			
			
			for(int i = 0; i < n; i++) {
				
				int whiteRowSum = 0;
				int blackRowSum = 0;
				
				int whiteColumnSum = 0;
				int blackColumnSum = 0;
				int wSumRow = 0;
				int bSumRow = 0;
				
				int wSumColumn = 0;
				int bSumColumn = 0;
				
				
				for(int j = 0; j < n; j++) {
					//Add to sum first
					if(grid[i][j] == 'W') {
						wSumRow++;
						whiteRowSum++;
					}
					else {
						bSumRow++;
						blackRowSum++;
					}
					
					
					if(grid[j][i] == 'W') {
						wSumColumn++;
						whiteColumnSum++;
					}
					else {
						bSumColumn++;
						blackColumnSum++;
					}
					
					
					//Check for consecutive
					if(j != n-1) {
						
						if(grid[i][j] != grid[i][j+1]) {
							wSumRow = 0;
							bSumRow = 0;
						}
						if(grid[j][i] != grid[j+1][i]) {
							wSumColumn = 0;
							bSumColumn = 0;
						}
						if(wSumRow >= 3 || bSumRow >= 3 || wSumColumn >= 3 || bSumColumn >= 3) {
							val = 0;
							break;
						}
					}
					
				}
				if(whiteRowSum != blackRowSum || wSumColumn != bSumColumn) {
					val = 0;
					break;
				}
			}
			if(val == 0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
			
			
		
			
			
			


		}

	}
	

}
