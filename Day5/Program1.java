/*
 * Write a method void printArray(int[][]arr)
 * Prints array elements clock wise and anti-clockwise alternatively.
 */

import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of the array:");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns of the array:");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("Enter element:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Input:");
		
		for(int i=0; i<row; i++) { //Displaying initial array
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		printArray(arr, row, col);
	}
	
	static void printArray(int[][]arr, int row, int col) { //Prints array elements clock wise and anti-clockwise alternatively.
		System.out.println("Clockwise:");
		printClockwise(arr,row,col);
		System.out.println();
		System.out.println("Anti-Clockwise:");
		printAntiClockwise(arr,row,col);
	}
	
	static void printClockwise(int arr[][], int row, int col) {
        int startRow = 0; //To hold the index of start of row
        int startColumn = 0; //To hold the index of start of column
        int endRow = row; //To hold the index of end of row
        int endColumn = col; //To hold the index of end of column
 
        while (startRow < endRow && startColumn < endColumn) {
            int i=startColumn;
            while(i<endColumn) { //Traversing from left to right in a row
                System.out.print(arr[startRow][i] + " ");
                i++;
            }
            startRow++;
 
            i=startRow;
            while(i<endRow) { //Traversing from top to bottom in a column
                System.out.print(arr[i][endColumn - 1] + " ");
                i++;
            }
            endColumn--;
 
            i=endColumn-1;
            if (startRow < endRow) { 
                while(i >= startColumn) { //Traversing from right to left in a row
                    System.out.print(arr[endRow - 1][i] + " ");
                    i--;
                }
                endRow--;
            }
 
            i=endRow-1;
            if (startColumn < endColumn) {
                while(i >= startRow) { //Traversing from bottom to top in a column
                    System.out.print(arr[i][startColumn] + " ");
                    i--;
                }
                startColumn++;
            }
        }
	}
	
	static void printAntiClockwise(int arr[][], int row, int col) {
        int startRow = 0; //To hold the index of start of row
        int startColumn = 0; //To hold the index of start of column
        int endRow = row; //To hold the index of end of row
        int endColumn = col; //To hold the index of end of column
 
        while (startRow < endRow && startColumn < endColumn) {
            int i=endColumn-1;
            while(i>=startColumn) { //Traversing from right to left in a row
                System.out.print(arr[startRow][i] + " ");
                i--;
            }
            startRow++;
 
            i=startRow;
            while(i<endRow) { //Traversing from top to bottom in a column
                System.out.print(arr[i][startColumn] + " ");
                i++;
            }
            endColumn--;
 
            i=startColumn+1;
            if (startRow < endRow) { 
                while(i <= endColumn) { //Traversing from left to right in a row
                    System.out.print(arr[endRow - 1][i] + " ");
                    i++;
                }
                endRow--;
            }
 
            i=endRow-1;
            if (startColumn < endColumn) {
                while(i >= startRow) { //Traversing from bottom to top in a column
                    System.out.print(arr[i][endColumn] + " ");
                    i--;
                }
                startColumn++;
            }
        }
	}
}
