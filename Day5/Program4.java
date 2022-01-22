/*
 * Given an m x n 2D binary grid grid which  
 * represents a map of '1's (land) and '0's (water), 
 * return the number of islands.
 * An island is surrounded by water and is formed by 
 * connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all 
 * surrounded by water.
 */

import java.util.*;

public class Program4 {
	
	public static void main(String[] args) {
		
		String[][] grid = {
			{"1","1","0","0","0"},
			{"1","1","0","0","0"},
			{"0","0","1","0","0"},
			{"0","0","0","1","1"}
		};
		
		System.out.println("Grid:");
		displayGrid(grid);
		System.out.println("Number of Islands:" + numberOfIslands(grid));
		
	}
	
	static void displayGrid(String grid[][]) { //To display the grid
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int numberOfIslands(String[][] grid) { //To return the number of islands
		if(grid == null || grid.length == 0) return 0;
		int ans = 0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j].equals("1")) { //Land found
					ans = ans + exploreNeighbours(grid, i, j);
				}
			}
		}
		return ans;
	}
	
	static int exploreNeighbours(String[][] grid, int row, int col) { //To explore all neighbours
		if(row<0 || row>=grid.length || col<0 || col>=grid[row].length || grid[row][col].equals("0")) {
			/*
			 * Handling corner cases and if the current cell is water
			 * Return 0
			 */
			return 0;
		}
		grid[row][col] = "0"; //Marking this cell value to 0 so that it will not be traversed again
		/*
		 * Traversing neighbours in all directions(top, down, left, right)
		 */
		exploreNeighbours(grid, row+1, col); //Traversing down
		exploreNeighbours(grid, row-1, col); //Traversing up
		exploreNeighbours(grid, row, col+1); //Traversing right
		exploreNeighbours(grid, row, col-1); //Traversing left
		return 1;
	}
}
