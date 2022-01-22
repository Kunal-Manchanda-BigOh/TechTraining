/*
 * Write an efficient algorithm that searches for a value in an m x n matrix.  
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */

import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = 3;
		int col = 4;
		int[][] arr = {
           {1,3,5,7},
           {10,11,16,20},
           {23,30,34,60}
		};
		
		
		System.out.println("Input:");
		displayArray(arr, row, col);
		
		
		System.out.println("Enter the number to be searched:");
		int target = sc.nextInt();
		System.out.println("Output:" + search(arr, row, col, target));
	}
	
	static void displayArray(int[][] arr, int row, int col) { //To display matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static boolean search(int arr[][], int row, int col, int target) { //To search target element in matrix
		int selectedRow = -1; //To hold the index of row in which the target element is present
		for(int i=0; i<row; i++) { //Traversing first column
			if(target == arr[i][0]) //If target element is found
				return true;
			else if(target > arr[i][0]) 
				/*
				 * If target element is greater than the first 
				 * element in the row then there is possibility 
				 * that the target element is present in that row
				 */
				selectedRow = i;
		}
		
		if(selectedRow == -1) //Target element not found
			return false;
		
		for(int i=0; i<col; i++) { 
			/*
			 * Traversing the row in which there is possibility 
			 * of the presence of target element
			 */
			if(arr[selectedRow][i] == target) //Target element found
				return true;
		}
		return false; //Target element not found
	}
}
